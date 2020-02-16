/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class login extends HttpServlet {
public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException {
    res.setContentType("text/html");
    PrintWriter out = res.getWriter();
    
    String n = req.getParameter("username");
    String p = req.getParameter("pass");
    
    if(n.equals("admin")||p.equals("pass"))
    {
        out.print("<h2>welcome</h2>");
        
    }
    else
    {
       RequestDispatcher rd = req.getRequestDispatcher("index.html");
       rd.forward(req,res);
        
    }
    
    
}
}