
package br.senac.rn.principal;

//import br.sanac.rn.model.Sexo;

import br.sanac.rn.model.Categoria;
import br.sanac.rn.model.Cliente;
import br.sanac.rn.model.Produto;
import br.senac.rn.dao.CategoriaDAO;
import br.senac.rn.dao.ClienteDAO;
import br.senac.rn.dao.ProdutoDAO;
import br.senac.rn.dao.SexoDAO;

//import br.senac.rn.dao.SexoDAO;

public class Principal {
    
    public static void main(String[] args) {
    
          Cliente c1 = new Cliente();
          ClienteDAO dao = new ClienteDAO();
          System.out.println(dao.buscarTodos().toString());
          
       
   System.exit(0);
    }
    
    
       
    }  

//    PARA INSERIR O DADOS.
//    public static void main(String[] args) {
//        CategoriaDAO dao = new CategoriaDAO();
//        dao.inserir(new Categoria(0, "Calçado", "Só para os pes"));
// TERMINA AQUI (TEM O FINAL MESMO LÁ EM BAIXO.        
      
//   INSERIR PEGANDO ID DE OUTRA TABELA.
//    public static void main(String[] args) {
//        
//       Produto p1 = new Produto();
//       p1.setNome("Sapato");
//       p1.setDescricao("Sem cadarço");
//       p1.setPreco(125.4f);
//       p1.setCategoria(new CategoriaDAO().buscarPorId(2));
//       
//       ProdutoDAO dao = new ProdutoDAO();
//       dao.inserir(p1);
       
//    //   INSERIR PEGANDO ID DE OUTRA TABELA.
//    public static void main(String[] args) {
//        
//       Cliente cli = new Cliente();
//       cli.setNome("José");
//       cli.setCpf("598.258.312-95");
//       cli.setSexo(new SexoDAO().buscarPorId(1));
//       
//       ClienteDAO dao = new ClienteDAO();
//       dao.inserir(cli);
    
    

   // dao.buscarTodos().forEach((cli) -> {System.out.println(cli);});
        
    //    SexoDAO dao = new SexoDAO();
        
        //System.out.println(dao.buscarTodos().toString());
//        for (Sexo s : dao.buscarTodos()){
//            System.out.println(s);
//        }
       // MESMA COISA DO DE CIMA.
        //dao.buscarTodos().forEach((s) -> {System.out.println(s);});
        
       // System.out.println(dao.buscarPorId(2).toString());
       
       //dao.excluir(dao.buscarPorId(3));
 
    //  Sexo sa = new Sexo(2,"Indefinido",'I');
       
    //   dao.atualizar(sa);