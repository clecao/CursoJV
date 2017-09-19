package br.senac.rn.util;

// @author a915458

import javax.persistence.EntityManager;


public abstract class GenericDAO<T> {
    
    protected static EntityManager manager;
    
    public abstract Class<T> getClassType();
    
    public EntityManager getEm() {
        if (manager == null){
            manager = DataBase.getInstace().getEm();
        }
        return manager;
    }
    
    public void insert(T t){
        getEm().getTransaction().begin();
        getEm().persist(t);
        getEm().getTransaction().commit();
    }
    
    
    
    
}
