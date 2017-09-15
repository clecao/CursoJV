/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sanac.rn.model;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author a915458
 */

@Entity    // Para poder usar bd
public class Categoria {
    
    @Id   // Define o campo que está abaixo com chave primaria
    @GeneratedValue(strategy = GenerationType.AUTO)   //Para que a chave primaria fique automatica
    private int id;
    private String nome;
    private String descricao;
    
     public Categoria() {
    }

    public Categoria(int id, String nome, String descricao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
    }


// Clica em Alt + Insert e escolhe Get Set  e Encapsular para tornar publica
   public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

// Clica em Alt + Insert e escolhe EQUALS (Marca todos)    
    @Override
    
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + this.id;
        hash = 67 * hash + Objects.hashCode(this.nome);
        hash = 67 * hash + Objects.hashCode(this.descricao);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Categoria other = (Categoria) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        return true;
    }

// Clica em Alt + Insert e escolhe toString() (Marca todos)     
    @Override
    public String toString() {
        return "Categoria{" + "id=" + id + ", nome=" + nome + ", descricao=" + descricao + '}';
    }

// fim    

    
    
    
    
}
