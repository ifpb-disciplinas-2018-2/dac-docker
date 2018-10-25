package br.edu.ifpb.domain;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ricardo Job
 */
@WebServlet(name = "ListarPessoas", urlPatterns = {"/listar"})
public class ListarPessoas extends HttpServlet {

    private List<Pessoa> lista = new ArrayList<>();
    
    @Override
    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        this.lista.add(new Pessoa("Kiko", "123"));
        this.lista.add(new Pessoa("Chaves", "124"));
        this.lista.add(new Pessoa("Madruga", "125"));
        this.lista.add(new Pessoa("Chiquinha", "163"));
        
        request.setAttribute("lista", this.lista);
        request.getRequestDispatcher("listar.jsp")
                .forward(request, response);
    }

}
