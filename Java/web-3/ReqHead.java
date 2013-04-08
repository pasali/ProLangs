package com.reqheaders;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/ReqHead")
public class ReqHead extends HttpServlet {
	private static final long serialVersionUID = 1L;
    String title = "Request Header Tablosu"; 
    
    public ReqHead() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Content-Type, PrintWriter, docType defn, etc.
		PrintWriter out = response.getWriter();
		out.println
		(
		"<HTML>\n" +
		"<HEAD><TITLE>"+title+"</TITLE></HEAD>\n"+
		"<BODY BGCOLOR=\"#FDF5E6\">\n" +
		"<H1 ALIGN=\"CENTER\">" + title + "</H1>\n" +
		"<B>Request Method: </B>" +
		request.getMethod() + "<BR>\n" +
		"<B>Request URI: </B> </B>" +
		"<B>Request" +
		request.getRequestURI() + "<BR>\n" +
		"<B>Request Protocol: </B>" +
		request.getProtocol() + "<BR><BR>\n" +
		"<TABLE BORDER=1 ALIGN=\"CENTER\">\n" +
		"<TR BGCOLOR=\"#FFAD00\">\n" +
		"<TH>Header Name<TH>Header Value");
		Enumeration<String> headerNames =request.getHeaderNames();
		while(headerNames.hasMoreElements()) {
				String headerName = headerNames.nextElement();
				out.println("<TR><TD>" + headerName);
				out.println("<TD>"+request.getHeader(headerName));
		}
		out.println("</TABLE>\n</BODY></HTML>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
