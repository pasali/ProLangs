package main;

public class SifreEntropy {
	
	private double alfabe;
	private double entropy;
	private int uzunluk;
	private long CPU = 4000000000L ;
	private double KirilmaZamani;
	
	public double getKirilmaZamani() {
		return KirilmaZamani;
	}

	public void setKirilmaZamani(double kirilmaZamani) {
		KirilmaZamani = kirilmaZamani;
	}

	
	public double getAlfabe() {
		return alfabe;
	}


	public void setAlfabe(int alfabe) {
		this.alfabe = alfabe;
	}


	public double getEntropy() {
		return entropy;
	}


	public void setEntropy(double entropy) {
		this.entropy = entropy;
	}


	public void AlfabeyiHesapla(String sifre) {
		this.uzunluk = sifre.length();
		
		if (sifre.matches(".*[\\p{Ll}]+.*"))
			this.alfabe += 29;
		if (sifre.matches(".*[\\p{Lu}]+.*")) 
			this.alfabe += 29;
		if (sifre.matches(".*[\\d]+.*"))
			this.alfabe += 10;
		if (sifre.matches(".*[-!$%^&*()_+|~=`{}\\[\\]:\";'<>?,.\\\\/]+.*"))
			this.alfabe += 30;
		if (sifre.matches(".*[ ]+.*"))
			this.alfabe += 1;
	}

	
	public String SureFormatiniAyarla() {
		String sure = " "; 
		
		if (this.KirilmaZamani < 60) {
			if (this.KirilmaZamani > 0.1 ) {
				sure = String.format("%.1f",this.KirilmaZamani) + " saniyede";
			}else {
				sure = String.format("%." + this.UzunlukHesapla() + "f",this.KirilmaZamani) + " saniyede";
			}
			
		}else if (3600 > this.KirilmaZamani && this.KirilmaZamani > 60) {
			this.KirilmaZamani = this.KirilmaZamani / 60; 
			sure = String.format("%.2f",this.KirilmaZamani) + " dakikada";
			
		}else if (86400 > this.KirilmaZamani && this.KirilmaZamani > 3600) {
			this.KirilmaZamani = this.KirilmaZamani / 3600; 
			sure = String.format("%.2f",this.KirilmaZamani) + " saatte";
			
		}else if (2592000 > this.KirilmaZamani && this.KirilmaZamani > 86400) {
			this.KirilmaZamani = this.KirilmaZamani / 86400; 
			sure = String.format("%.2f",this.KirilmaZamani) + " günde";
			
		}else if (31104000 > this.KirilmaZamani && this.KirilmaZamani > 2592000) {
			this.KirilmaZamani = this.KirilmaZamani / 2592000; 
			sure = String.format("%.2f",this.KirilmaZamani) + " ayda";
			
		}else if (this.KirilmaZamani > 31104000) {
			this.KirilmaZamani = this.KirilmaZamani / 31104000; 
			sure = String.format("%.2f",this.KirilmaZamani) + " yılda";
		}
		return sure;
	}
	
	
	public void KirilmaZamaniHesapla() {
		double kombinasyonlar, sure;
		
		if (this.entropy != 0) {
			kombinasyonlar = Math.pow(2, this.entropy);
			sure = kombinasyonlar / this.CPU;
			this.KirilmaZamani = sure;
		}	
	}
	
	
	public void Entropy() {
		if (this.alfabe == 0) {
			this.entropy = 0;
		}else {
			this.entropy = (Math.log(this.alfabe) / Math.log(2.0)) *  this.uzunluk;
		}
	}
	
	
	public String UzunlukHesapla() {
		char[] zaman = String.format("%.9f",this.KirilmaZamani).toCharArray();
		int len;
		for (len = 1; len < zaman.length; len++) {
			if (zaman[len - 1] != '0' && zaman[len] == '0' && zaman[len - 1] != ',') {
				break;
			}
			
			
		}
		return String.valueOf(len-2);
	}
}
