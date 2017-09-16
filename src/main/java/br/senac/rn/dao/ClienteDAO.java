package br.senac.rn.dao;

import br.sanac.rn.model.Cliente;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class ClienteDAO {
    private EntityManager manager;
    private EntityManagerFactory factory;
    
    public ClienteDAO() {
        factory = Persistence.createEntityManagerFactory("ConexaoDB");
        manager = factory.createEntityManager();
    }
    
    public void inserir(Cliente cliente) {
        manager.getTransaction().begin();
        manager.persist(cliente);
        manager.getTransaction().commit();
    
    }
    
    public void excluir(Cliente cliente){
        manager.getTransaction().begin();
        manager.remove(cliente);
        manager.getTransaction().commit();
    }
    
    public void atualizar (Cliente cliente){
        manager.getTransaction().begin();
        manager.merge(cliente);
        manager.getTransaction().commit();
    }
    
    public List<Cliente> buscarTodos(){
        TypedQuery<Cliente> consulta = manager.createQuery("SELECT c FROM tb_cliente c", Cliente.class);
        return consulta.getResultList();
    }
    
    public Cliente buscarPorId(int id){
        return manager.find(Cliente.class, id);
    }

    public Object buscarPorId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
