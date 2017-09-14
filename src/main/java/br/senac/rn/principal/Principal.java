/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.rn.principal;

import br.sanac.rn.model.Sexo;
import br.senac.rn.dao.SexoDAO;

public class Principal {

    public static void main(String[] args) {
        
//        Sexo s1 = new Sexo();
//        
//        s1.setNome("Feminino");
//        s1.setSigla('F');
//        
//        SexoDAO dao = new SexoDAO();
//        
//        dao.inserir(s1);
        

        
        SexoDAO dao = new SexoDAO();
        
        //System.out.println(dao.buscarTodos().toString());
//        for (Sexo s : dao.buscarTodos()){
//            System.out.println(s);
//        }
       // MESMA COISA DO DE CIMA.
        //dao.buscarTodos().forEach((s) -> {System.out.println(s);});
        
       // System.out.println(dao.buscarPorId(2).toString());
       
       //dao.excluir(dao.buscarPorId(3));
 
      Sexo sa = new Sexo(2,"Indefinido",'I');
       
       dao.atualizar(sa);
        
        System.exit(0);
        
       
    }
}
