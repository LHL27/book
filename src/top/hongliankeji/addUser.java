package top.hongliankeji;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(name="addUser",urlPatterns = {"/addUser"})
public class addUser extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String userName = request.getParameter("userName");
        String userPwd = request.getParameter("pwd");
        String userAge = request.getParameter("userAge");
        System.out.printf(userName + "  "+userPwd);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        this.doPost(request,response);
    }
}
