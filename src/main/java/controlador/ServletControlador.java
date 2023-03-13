package controlador;

import datos.Pais;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

@WebServlet(name = "ServletControlador", urlPatterns = {"/ServletControlador"})
public class ServletControlador extends HttpServlet {

    @Resource(name="world")
    DataSource dataSource;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("Entrando al Servlet");
        String[] nombres = request.getParameterValues("name");
        String sqlStr = "select * from country where ";
        for (int i = 0; i < nombres.length;i++) {
            sqlStr += "name = '" + nombres[i] + "'";
            if (i != nombres.length -1){ 
                sqlStr += "OR ";
            }     
        }
        sqlStr += " AND population > 0 ORDER BY population DESC";
        Connection con = null;
        ResultSet rs = null;
        List<Pais> paises = new ArrayList<>();
        PreparedStatement stmt = null;

        try {
            con = dataSource.getConnection();
            stmt = con.prepareStatement(sqlStr);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Pais p = new Pais();
                p.setName(rs.getString("name"));
                p.setContinent(rs.getString("continent"));
                p.setPopulation(rs.getInt("population"));
                p.setIndepyear(rs.getInt("indepyear"));
                System.out.println("---------------");
                System.out.println(p.getName());
                System.out.println("---------------");
                paises.add(p);
            }
            request.setAttribute("paises", paises);
            request.getRequestDispatcher("vistafinal.jsp").forward(request, response);
        } catch (Exception e) {
            System.out.println("He petao" );
            e.printStackTrace();
            request.getRequestDispatcher("vistafinal.jsp").forward(request, response);
        } finally {

        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
