package com.uvsq.monsite.action;


import com.uvsq.monsite.beans.UserBean;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

public class ActionUn implements Action {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        UserBean user = (UserBean) session.getAttribute("user");
        if(user != null) {
            user.setAttribut1(request.getParameter("attribut1"));
            user.setAttribut2(request.getParameter("attribut2"));
        }
        return "page1.jsp";
    }
}
