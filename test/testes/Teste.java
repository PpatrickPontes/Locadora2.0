/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;


import br.com.locadora.modelo.Usuarios;
import br.com.locadora.persistencia.UsuariosDAO;
import java.util.ArrayList;
import java.util.Date;
import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author sala304b
 */
public class Teste {
    
    public static void main(String args[]){
        
        
        //-----------------------------------------------------
        // Testar - INSERIR
        Usuarios u = new Usuarios();
        u.setLogin("Peixe boi");
        u.setNome("Patrick");
        
         String senha = "123456";
         String senhaCritografada = DigestUtils.sha512Hex(senha);
         
        u.setSenha(senhaCritografada);
        u.setPerfil("Adm");
        u.setStatus("Ativo");
       
        try{
            UsuariosDAO.inserir(u);
        }catch(Exception e){
            e.printStackTrace();
            return;
        }
        
        System.out.println("Usuario inserido com sucesso: " + 
                    u.getNome());
        

        
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
