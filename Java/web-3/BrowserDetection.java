package com.reqheaders;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BrowserDetection")
public class BrowserDetection extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String title, message;
		String userAgent = request.getHeader("User-Agent");
		if ((userAgent != null) && (userAgent.contains("MSIE"))) {
			title = "Microsoft Minion";
			message = "Welcome, O spineless slave to the " + "mighty empire.";
		}else if (userAgent.matches(".*Android.*")){// android
		    title = "You're an Android!";
		    message = "androidciyiz";
		}else {
			title = "Hopeless Firefox Rebel";
			message = "Enjoy it while you can. " + "You <I>will</I> be assimilated!";
		}
		out.println(title + message);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
