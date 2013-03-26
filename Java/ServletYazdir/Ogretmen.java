package com.test;
public class Ogretmen extends Kisi{

	private int SicilNo;
	private String Bolum;
	
	public int getSicilNo() {
		return SicilNo;
	}
	public void setSicilNo(int sicilNo) {
		SicilNo = sicilNo;
	}
	public String getBolum() {
		return Bolum;
	}
	public void setBolum(String bolum) {
		Bolum = bolum;
	}
	
	public Ogretmen() {
		
	}
	public Ogretmen(int tcNo, String ad, String soyad, int dtarihi,
			int sicilNo, String bolum) {
		super(tcNo, ad, soyad, dtarihi);
		SicilNo = sicilNo;
		Bolum = bolum;
	}
	
	public void DerseGir() {
		System.out.println("Dersteyiz çocuklar.");
	}
	public void SinavYap() {
		System.out.println("Çıkarın kalem kağıtları yazılı yoklama var.");
	}
	
}
