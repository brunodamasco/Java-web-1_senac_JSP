/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import DAO.ProdutoDao;
import DAO.ProdutoDaoImpl;
import com.sun.org.apache.xml.internal.security.c14n.helper.C14nHelper;
import entidade.Produto;
import java.util.Date;

/**
 *
 * @author Dell
 */
public class Produtoteste {

    private static Produto produto;
    
    public static void main(String[] args) throws Exception {
        testeSalvar();
    }
    
    public static void testeSalvar() throws Exception {
        System.out.println("Salvar");
        produto = new Produto(null, "nome teste", 10, 20, 30, "bla bla", new Date());
        ProdutoDao produtoDao = new ProdutoDaoImpl();
        produtoDao.salvar(produto);
    }
}
