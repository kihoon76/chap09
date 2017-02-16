package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	private static Log log = LogFactory.getLog(LoginServlet.class);
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		log.info("#############");
		log.info("doGet()");
		log.info("#############");
		
		String err = req.getParameter("err");
		
		if(err != null) {
			req.setAttribute("errorMsg", "사용자정보가 올바르지 않습니다.");
		}
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/loginform.jsp");
		dispatcher.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		log.info("#############");
		log.info("doPost()");
		log.info("#############");
		
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		
		if("hong".equals(id) && "1234".equals(pw)) {
			resp.sendRedirect("/index.jsp");
		}
		else {
			resp.sendRedirect("/login?err");
		}
	}
}
