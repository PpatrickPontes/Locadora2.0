/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.locadora.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


// Essa Classe usa o padrão de projeto Factory (Fabrica)
public class ConexaoFactory {

    //  Database credentials
    
    public static Connection getConexao() throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        
        String drive = "com.mysql.jdbc.Driver";
        String banco = "jdbc:mysql://localhost:3306/locadora";
        String usuarioBD = "root";
        String senha = "123456";
        
        try { 
            Class.forName(drive);
            conn = DriverManager.getConnection(banco, usuarioBD, senha);
        } catch (SQLException | ClassNotFoundException e) { 
    		throw e; 
        } 
        return conn;
    }
    
}
