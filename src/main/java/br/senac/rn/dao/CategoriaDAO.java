/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.rn.dao;

import br.sanac.rn.model.Categoria;
import br.sanac.rn.model.Sexo;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author a915458
 */
public class CategoriaDAO {
    
    private EntityManager manager;
    private EntityManagerFactory factory;
    
    public CategoriaDAO() {
        factory = Persistence.createEntityManagerFactory("ConexaoDB");
        manager = factory.createEntityManager();
    }
    
    public void inserir(Categoria categoria){
        manager.getTransaction().begin();
        manager.persist(categoria);
        manager.getTransaction().commit();       
    }
    
    public void excluir(Categoria categoria){
        manager.getTransaction().begin();
        manager.remove(categoria);
        manager.getTransaction().commit();
    }
    
    public void atualizar(Categoria categoria){
        manager.getTransaction().begin();
        manager.merge(categoria);
        manager.getTransaction().commit();
    }
    
    public List<Categoria> buscarTodos(){
        TypedQuery<Categoria> consulta = manager.createQuery("SELECT c FROM Categoria c", Categoria.class);
        return consulta.getResultList();
    }
    
}
