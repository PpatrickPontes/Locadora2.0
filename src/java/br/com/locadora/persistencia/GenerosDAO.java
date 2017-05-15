/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.locadora.persistencia;

import br.com.locadora.modelo.Generos;
import br.com.locadora.modelo.Usuarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/**
 *
 * @author sala308b
 */
public class GenerosDAO {
    
    public static void inserir(Generos g) throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        String SQL = "";
        
        // Obtem conexao com BD
        conn = ConexaoFactory.getConexao();
        
        // Comando SQL 
        SQL = "INSERT INTO generos (nome, descricao) " +
                                     "VALUES (?, ?)";

        preparedStatement = conn.prepareStatement(SQL);

        
        preparedStatement.setString(1, g.getNome());
        preparedStatement.setString(2, g.getDescricao());
       
        // Executa no BD        
        preparedStatement.executeUpdate();  
        
        // Fechar conexao
        conn.close();
        
    }
    public static Generos buscar(int id) throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        ResultSet rs = null;
        String SQL = "";
        Generos g = null;
        
        // Obtem conexao com BD
        conn = ConexaoFactory.getConexao();
        
        // Comando SQL 
        SQL = "SELECT * FROM generos " +
                " WHERE nome = ? ";

        preparedStatement = conn.prepareStatement(SQL);

        preparedStatement.setInt(1, id);
                
        // Para buscar informações
        rs = preparedStatement.executeQuery();   

        // Verifica se possui dados
        if (rs.next()) {
            
            g = new Generos();
            
            g.setCodigo(rs.getInt("codigo"));
            g.setNome(rs.getString("nome"));
            g.setDescricao(rs.getString("descricao"));
           
         } 
        
        // Fechar conexao
        conn.close();
        
        return g;
    }
}
