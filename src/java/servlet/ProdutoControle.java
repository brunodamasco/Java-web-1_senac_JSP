package servlet;

import entidade.Produto;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ProdutoControle", urlPatterns = {"/ProdutoControle"})
public class ProdutoControle extends HttpServlet {

    private HttpServletRequest request;
    private HttpServletResponse response;
    private Produto produto;
    private List<Produto> produtos = new ArrayList<>();
    private RequestDispatcher rd;

    protected void processRequest() throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String cmd = request.getParameter("cmd");
        switch (cmd) {
            case "salvar":
                salvar();
                break;
            case "excluir":
                break;
            case "carregarParaAlterar":
                break;
            case "pesquisar":
                break;
            default:
                break;
        }
        rd.forward(request, response);
    }

    private void salvar() {
        produto = new Produto();
        produto.setNome(request.getParameter("produto"));
        produto.setDescricao(request.getParameter("descricao"));
        produto.setCadastro(new Date());

        produto.setQuantidade(Integer.parseInt(request.getParameter("qtd")));
        produto.setPrecoCompra(Double.parseDouble(request.getParameter("precoCompra")));
        produto.setPrecoVenda(Double.parseDouble(request.getParameter("precoVenda")));
        produtos.add(produto);
        System.out.println("quantidade de produtos na lista " + produtos.size());
        rd = request.getRequestDispatcher("listarProduto.jsp");
        request.setAttribute("listaProdutos", produtos);
        

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        this.request = request;
        this.response = response;
        processRequest();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        this.request = request;
        this.response = response;
        processRequest();
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
