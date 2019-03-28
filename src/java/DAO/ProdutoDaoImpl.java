/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entidade.Produto;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author Dell
*/
public class ProdutoDaoImpl implements ProdutoDao, Serializable {

    private Connection conexao;
    private PreparedStatement psmt;
    private ResultSet rs;
    private Produto produto;
    
    @Override
    public Integer salvar(Object object) throws SQLException {
        produto = (Produto) object; //Casting;
        String sql = "INSERT INTO produto "
                + "(nome,precoCompra,precoVenda,quantidade,descricao,dataCadastro) "
                + "values (?,?,?,?,?,?)";
        try {
            conexao = FabricaConexao.abreConexao();
            psmt = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            psmt.setString(1, produto.getNome());
            psmt.setDouble(2, produto.getPrecoCompra());
            psmt.setDouble(3, produto.getPrecoVenda());
            psmt.setInt(4, produto.getQuantidade());
            psmt.setString(5, produto.getDescricao());
            psmt.setDate(6, new Date(produto.getCadastro().getTime()));
            psmt.executeUpdate();
            rs = psmt.getGeneratedKeys();
            rs.next();
            produto.setId(rs.getInt(1));
            
        } catch (Exception e) {
            System.out.println("Erro ao gravar o produto" + e.getMessage());
        }
        return produto.getId();
    }
    @Override
    public List listarTodos(String nome) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
