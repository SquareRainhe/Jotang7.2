package com.jotang.jotanger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/msg")
public class msg extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        String message = request.getParameter("message");

        if(message == null||"".equals(message.trim())){
            request.setAttribute("msg","发送信息不能为空");
            request.getRequestDispatcher("send.jsp").forward(request,response);
            return;
        }

        request.getSession().setAttribute("message",message);

        request.getRequestDispatcher("msg.jsp");
        response.sendRedirect("send.jsp");
    }
}
