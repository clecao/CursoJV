package br.sanac.rn.model;

import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity(name = "tb_vendas")  // Para poder usar bd e criar tabela
public class Venda {
    
    @Id   // Define o campo que está abaixo com chave primaria
    @GeneratedValue(strategy = GenerationType.AUTO)   //Para que a chave primaria fique automatica
    private int id;
    @ManyToOne
    private Cliente cliente;
    @ManyToMany
    private List<Produto> produto;
    private float valor;
    
    // Alt + Ins escolhe construtor.
    public Venda() {
    }
    
    // Alt + Ins escolhe construtor e marca todos os campos.
    public Venda(int id, Cliente cliente, List<Produto> produto, float valor) {
        this.id = id;
        this.cliente = cliente;
        this.produto = produto;
        this.valor = valor;
    }
    
     // Clica em Alt + Insert e escolhe Get Set  e Encapsular para tornar publica
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Produto> getProduto() {
        return produto;
    }

    public void setProduto(List<Produto> produto) {
        this.produto = produto;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    // Clica em Alt + Insert e equals/hashCode - Seleciona tudos dos dois lados.

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.id;
        hash = 29 * hash + Objects.hashCode(this.cliente);
        hash = 29 * hash + Objects.hashCode(this.produto);
        hash = 29 * hash + Float.floatToIntBits(this.valor);
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
        final Venda other = (Venda) obj;
        if (this.id != other.id) {
            return false;
        }
        if (Float.floatToIntBits(this.valor) != Float.floatToIntBits(other.valor)) {
            return false;
        }
        if (!Objects.equals(this.cliente, other.cliente)) {
            return false;
        }
        if (!Objects.equals(this.produto, other.produto)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    
}
