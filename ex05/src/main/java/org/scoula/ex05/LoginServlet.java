package org.scoula.ex05;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException, IOException {
        String userid = req.getParameter("userid");
        String passwd = req.getParameter("passwd");
        req.setAttribute("userid", "홍길동");
        req.setAttribute("passwd", "1234");
        req.getRequestDispatcher("login.jsp").forward(req, res);
    }
}
