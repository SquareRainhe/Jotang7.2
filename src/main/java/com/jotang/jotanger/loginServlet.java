package com.jotang.jotanger;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        String uname = request.getParameter("uname");
        String upwd = request.getParameter("upwd");

        if(uname == null||"".equals(uname.trim())){
            request.setAttribute("msg","账号不能为空");
            request.getRequestDispatcher("login.jsp").forward(request,response);
            return;
        }

        if(upwd == null||"".equals(upwd.trim())){
            request.setAttribute("msg","密码不能为空");
            request.getRequestDispatcher("login.jsp").forward(request,response);
            return;
        }

        if(!"admin".equals(uname)||!"123456".equals(upwd)){
            request.setAttribute("msg","账号或密码错误");
            request.getRequestDispatcher("login.jsp").forward(request,response);
        }

        request.getSession().setAttribute("uname",uname);

        response.sendRedirect("slogin.jsp");
    }
}
