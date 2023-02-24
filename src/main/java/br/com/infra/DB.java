/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.infra;

import br.com.exception.DBException;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 *
 * @author Matheus
 */
public class DB {
    
    private static Connection conn = null;
    
    public static Connection getConnection(){
        if(conn == null){
            try {
                Properties props = loadProperties();
                String url = props.getProperty("host");
                conn = DriverManager.getConnection(url, props);
            } catch(SQLException e){
                throw new DBException("Erro ao tentar se conectar ao banco de dados: " + e.getMessage());
            }
        }
        return conn;
    }
    
    public static void closeConnection(){
        if(conn != null){
            try {
                conn.close();
            } catch (SQLException e){
                throw new DBException("Erro ao fechar conexão: " + e.getMessage());
            }
        }
    }
    
    public static void closeStatement(Statement st){
        if(st != null){
            try {
                st.close();
            } catch (SQLException e) {
                throw new DBException("Erro ao fechar declaração: " + e.getMessage());
            }
        }
    }
    
    public static void closeResultSet(ResultSet rs){
        if(rs != null){
            try {
                rs.close();
            } catch (SQLException e){
                throw new DBException("Erro ao fechar query: " + e.getMessage());
            }
        }
    }
    
    private static Properties loadProperties() {
        try {
            FileInputStream fs = new FileInputStream("db.properties");
            Properties props = new Properties();
            props.load(fs);
            return props;
        } catch (IOException e) {
            throw new DBException("Erro ao buscar informações do banco de dados: " + e.getMessage());
        }
    }
    
    
}
