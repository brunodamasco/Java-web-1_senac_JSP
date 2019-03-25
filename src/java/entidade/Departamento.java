/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Dell
 */
public class Departamento implements Serializable{
    private Integer id;
    private String  nome;
    private Date cadastro;
    private String descricao;
    private String responsavel;   

    public Departamento() {
    }

    public Departamento(Integer id, String nome, Date cadastro, String descricao, String responsavel) {
        this.id = id;
        this.nome = nome;
        this.cadastro = cadastro;
        this.descricao = descricao;
        this.responsavel = responsavel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getCadastro() {
        return cadastro;
    }

    public void setCadastro(Date cadastro) {
        this.cadastro = cadastro;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }
    
}


