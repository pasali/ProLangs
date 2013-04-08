package com.reqheaders;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Zipper")
public class Zipper extends HttpServlet {
	private static final long serialVersionUID = 1L;
    String title = "Sıkıştırma";
    
    public Zipper() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out;
		if (Gzip.isGzipSupported(request) && !Gzip.isGzipDisabled(request)) {
			out = Gzip.getGzipWriter(response);
				response.setHeader("Content-Encoding", "gzip");
		}else {
			out = response.getWriter();
		}
		
		out.println
		(
		"<HTML>\n" +
		"<HEAD><TITLE>" + title + "</TITLE></HEAD>\n" +
		"<BODY BGCOLOR=\"#FDF5E6\">\n" +
		"<H1 ALIGN=\"CENTER\">" + title + "</H1>\n");
		String line = "Blah,Blah, blah, blah, blah, blah. " +
				"Yadda, yadda, yadda, yadda.";
		for(int i=0; i<10000; i++) {
			out.println(line);
		}
		out.println("</BODY></HTML>");
		out.close();
	
	}
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
