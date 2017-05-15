/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.locadora.modelo;

import java.util.Date;

/**
 *
 * @author sala308b
 */
public class Filmes {
    
 private int codigo;
 private String titulo;
 private int cod_genero;
 private String sinopse;
 private String diretor;
 private int ano_lancamento;
 private String status;
 private String usuario_cadastrado;
 private Date datahora_cadastro;

    public Filmes() {
    }

    public Filmes(int codigo, String titulo, int cod_genero, String sinopse, String diretor, int ano_lancamento, String status, String usuario_cadastrado, Date datahora_cadastro) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.cod_genero = cod_genero;
        this.sinopse = sinopse;
        this.diretor = diretor;
        this.ano_lancamento = ano_lancamento;
        this.status = status;
        this.usuario_cadastrado = usuario_cadastrado;
        this.datahora_cadastro = datahora_cadastro;
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the cod_genero
     */
    public int getCod_genero() {
        return cod_genero;
    }

    /**
     * @param cod_genero the cod_genero to set
     */
    public void setCod_genero(int cod_genero) {
        this.cod_genero = cod_genero;
    }

    /**
     * @return the sinopse
     */
    public String getSinopse() {
        return sinopse;
    }

    /**
     * @param sinopse the sinopse to set
     */
    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    /**
     * @return the diretor
     */
    public String getDiretor() {
        return diretor;
    }

    /**
     * @param diretor the diretor to set
     */
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    /**
     * @return the ano_lancamento
     */
    public int getAno_lancamento() {
        return ano_lancamento;
    }

    /**
     * @param ano_lancamento the ano_lancamento to set
     */
    public void setAno_lancamento(int ano_lancamento) {
        this.ano_lancamento = ano_lancamento;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the usuario_cadastrado
     */
    public String getUsuario_cadastrado() {
        return usuario_cadastrado;
    }

    /**
     * @param usuario_cadastrado the usuario_cadastrado to set
     */
    public void setUsuario_cadastrado(String usuario_cadastrado) {
        this.usuario_cadastrado = usuario_cadastrado;
    }

    /**
     * @return the datahora_cadastro
     */
    public Date getDatahora_cadastro() {
        return datahora_cadastro;
    }

    /**
     * @param datahora_cadastro the datahora_cadastro to set
     */
    public void setDatahora_cadastro(Date datahora_cadastro) {
        this.datahora_cadastro = datahora_cadastro;
    }
 
 
    
}
