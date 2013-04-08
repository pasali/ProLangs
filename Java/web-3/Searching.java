package com.reqheaders;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Searching")
public class Searching extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Searching() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String searchString = request.getParameter("searchString");
		if ((searchString == null) || (searchString.length() == 0)) {
			reportProblem(response, "Missing search string");
			return;
		}
		searchString = URLEncoder.encode(searchString, "utf-8");
		String searchEngineName = request.getParameter("searchEngine");
		if ((searchEngineName == null) || (searchEngineName.length() == 0)) {
			reportProblem(response, "Missing search engine name");
			return;
		}
		String searchURL =	SearchEngine.makeURL(searchEngineName,searchString);
		if (searchURL != null) {
			response.sendRedirect(searchURL);
		} else {
			reportProblem(response,"Unrecognized search engine");
		}
	}
	
	private void reportProblem(HttpServletResponse response,String message)throws IOException {
			response.sendError(HttpServletResponse.SC_NOT_FOUND,message);			
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
