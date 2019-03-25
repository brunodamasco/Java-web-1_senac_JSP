package servlet;

import entidade.Departamento;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "DepartamentoControle", urlPatterns = {"/DepartamentoControle"})
public class DepartamentoControle extends HttpServlet {

    private HttpServletRequest request;
    private HttpServletResponse response;
    private Departamento departamento;
    private List<Departamento> departamentos = new ArrayList<>();
    private RequestDispatcher rd;

    protected void processRequest() throws ServletException, IOException {
        
        String comando = request.getParameter("cmd");
        switch(comando){
            case "salvar":
                salvar();
                break;
        }
        rd.forward(request, response);
    }
    
    private void salvar(){
        departamento = new Departamento();
        departamento.setNome(request.getParameter("nome"));
        departamento.setDescricao(request.getParameter("descricao"));
        departamento.setResponsavel(request.getParameter("responsavel"));
        departamento.setCadastro(new Date());
        departamentos.add(departamento);
        request.setAttribute("msg", "Savo com sucesso!");
        rd = request.getRequestDispatcher("cadastrodepartamento.jsp");
        request.setAttribute("departamentos", departamentos);
  
       // mostrarDado();
    }
    private void mostrarDado() {
        rd = request.getRequestDispatcher("listaDepartamento.jsp");
        request.setAttribute("departamentos", departamentos);
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
