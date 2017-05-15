/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.locadora.persistencia;

import br.com.locadora.modelo.Filmes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

/**
 *
 * @author sala308b
 */
public class filmesDAO {
    
    public static void inserir(Filmes f) throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        String SQL = "";
        
        // Obtem conexao com BD
        conn = ConexaoFactory.getConexao();
        
        // Comando SQL 
        SQL = "INSERT INTO filmes (titulo, god_genero, sinopse, diretor,"
                + " ano_lacamento, status, usuario_cadastro, datahora_cadastro) " +
                                     "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        preparedStatement = conn.prepareStatement(SQL);

        preparedStatement.setString(1, f.getTitulo());
        preparedStatement.setInt(2, f.getCod_genero());
        preparedStatement.setString(3, f.getSinopse());
        preparedStatement.setString(4, f.getDiretor());
        preparedStatement.setInt(5, f.getAno_lancamento());
        preparedStatement.setString(6, f.getStatus());
        preparedStatement.setString(7, f.getUsuario_cadastrado());
        Timestamp dataAux = new Timestamp(
                f.getDatahora_cadastro().getTime());
        preparedStatement.setTimestamp(8, dataAux);
        
        
        
       
        // Executa no BD        
        preparedStatement.executeUpdate();  
        
        // Fechar conexao
        conn.close();
        
    }
    public static Filmes buscar(int id) throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        ResultSet rs = null;
        String SQL = "";
        Filmes f = null;
        
        // Obtem conexao com BD
        conn = ConexaoFactory.getConexao();
        
        // Comando SQL 
        SQL = "SELECT * FROM filmes " +
                " WHERE genero = ? ";

        preparedStatement = conn.prepareStatement(SQL);

        preparedStatement.setInt(1, id);
                
        // Para buscar informações
        rs = preparedStatement.executeQuery();   

        // Verifica se possui dados
        if (rs.next()) {
            
            f = new Filmes();
            
            f.setCodigo(rs.getInt("codigo"));
            f.setTitulo(rs.getString("titulo"));
            f.setCod_genero(rs.getInt("cod_genero"));
            f.setSinopse(rs.getString("sinopse"));
            f.setDiretor(rs.getString("diretor"));
            f.setAno_lancamento(rs.getInt("ano_lacamento"));
            f.setStatus(rs.getString("status"));
            f.setUsuario_cadastrado(rs.getString("usuario_cadastro"));
            f.setDatahora_cadastro(rs.getDate("datahora_cadastro"));
           
         } 
        
        // Fechar conexao
        conn.close();
        
        return f;
    }
    
}
