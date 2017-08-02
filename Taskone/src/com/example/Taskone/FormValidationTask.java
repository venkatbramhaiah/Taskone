package com.example.Taskone;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class FormValidationTask extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		PrintWriter pw= resp.getWriter();
		resp.setContentType("application/json");
		resp.setCharacterEncoding("UTF-8");
		
		String customer=req.getParameter("data");
		
		    pw.write(customer);
		    
		
	}
}
