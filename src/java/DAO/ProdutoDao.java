/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Dell
 */
public interface ProdutoDao extends BaseDao{
    
    List listarTodos(String nome) throws SQLException;
}
