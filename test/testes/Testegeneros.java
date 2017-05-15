/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;


import br.com.locadora.modelo.Generos;
import br.com.locadora.persistencia.GenerosDAO;
import java.util.ArrayList;
import java.util.Date;
import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author sala304b
 */
public class Testegeneros {
    
    public static void main(String args[]){
        
        
        //-----------------------------------------------------
        // Testar - INSERIR
       Generos g = new Generos();
       
        g.setNome("Nao sei");        
        g.setDescricao("Uma merda");
       
        try{
            GenerosDAO.inserir(g);
        }catch(Exception e){
            e.printStackTrace();
            return;
        }
        
        System.out.println("Usuario inserido com sucesso: " + 
                    g.getNome());
        

        
        /*
        //-----------------------------------------------------
        // Testar - Buscar
        Produto p = null;
        
        try{
            p = ProdutoDAO.buscar(15);
        }catch(Exception e){
            e.printStackTrace();
            return;
        }
        System.out.println("Produto: " + 
                    p.getIdProduto() + " - " + 
                    p.getDescProduto());
        
        */
        
        /*
        //-----------------------------------------------------
        // Testar - Atualizar
        Produto prod = new Produto();
        prod.setIdProduto(3);
        prod.setDescProduto("Carro F1 destruido!");
        prod.setDataUltReajuste(new Date());
        prod.setValor(500.12f);
        prod.setQtdEstoque(1);
        
        try{
            ProdutoDAO.atualizar(prod);
        }catch(Exception e){
            e.printStackTrace();
            return;
        }
        
        System.out.println("Produto alterado com sucesso: " + 
                    prod.getIdProduto());
        */
        
        /*
        //-----------------------------------------------------
        // Testar - Excluir
        Produto prod = new Produto();
        prod.setIdProduto(3);
        
        try{
            ProdutoDAO.excluir(prod);
        }catch(Exception e){
            e.printStackTrace();
            return;
        }
        
        System.out.println("Produto foi para a vala! ");
        */
        
        /*
        //-----------------------------------------------------
        // Testar - Listar
        ArrayList<Produto> lista = null;
        
        String palavra = "";
        
        try{
            lista = ProdutoDAO.listar(palavra);
        }catch(Exception e){
            e.printStackTrace();
            return;
        }

        for(Produto p:lista){
            System.out.println("Produto: " + 
                    p.getIdProduto() + " - " + 
                    p.getDescProduto());
        }
       */ 
    }
    
}
