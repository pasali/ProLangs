package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/yazdir")
public class yazdir extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

    public yazdir() {
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Ogrenci o1 = new Ogrenci(12423, "ali", "Veli", 1991, 1, 3, "BilMuh", "Uganda");
		o1.DerseGir();
		o1.KantineGit();
		out.println(o1.getMemleket());
		Memur m1 = new Memur(1234, "veli", "ali", 1987, 1, "Öğrenciİşleri");
		out.println(m1.EvrakGetir());
		out.println(m1.EvrakGötür());
		Ogretmen O1 = new Ogretmen(1234, "ahmet", "ali", 1967, 1, "İnşaat");
		O1.DerseGir();
		O1.SinavYap();
		OgretimUyesi ou1 = new OgretimUyesi(1234, "veli", "ipçi", 1977, 1, "Makina", "Prof");
		out.println(ou1.getUnvan() + " " + ou1.getAd() + " " + ou1.getSoyad());
		ou1.DerseGir();
		ou1.SinavYap();
		out.print(o1.getAd());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
