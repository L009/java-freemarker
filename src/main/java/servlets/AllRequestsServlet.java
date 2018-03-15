package servlets;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import java.io.IOException;

/**
 * Created by leonid on 24.10.16.
 */
public class AllRequestsServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws  ServletException, IOException
    {
        String valueKey = request.getParameter("key");
        if(valueKey == null) valueKey = "";
        response.getWriter().println(valueKey);

        response.setContentType("text/plain;charset=utf-8");
        response.setStatus(HttpServletResponse.SC_OK);
    }


}
