
public class Ogrenci extends Kisi {
	
	private int OgrNo;
	private int Sınıf;
	private String Bolum;
	private String Memleket;
	
	public int getOgrNo() {
		return OgrNo;
	}
	public void setOgrNo(int ogrNo) {
		OgrNo = ogrNo;
	}
	public int getSınıf() {
		return Sınıf;
	}
	public void setSınıf(int sınıf) {
		Sınıf = sınıf;
	}
	public String getBolum() {
		return Bolum;
	}
	public void setBolum(String bolum) {
		Bolum = bolum;
	}
	public String getMemleket() {
		return Memleket;
	}
	public void setMemleket(String memleket) {
		Memleket = memleket;
	}
	
	public Ogrenci() {
		
	}
	public Ogrenci(int tcNo, String ad, String soyad, int dtarihi, int ogrNo,
			int sınıf, String bolum, String memleket) {
		super(tcNo, ad, soyad, dtarihi);
		OgrNo = ogrNo;
		Sınıf = sınıf;
		Bolum = bolum;
		Memleket = memleket;
	}
	
	public void DerseGir() {
		System.out.println("Dersteyim kanka.");
	}
	
	public void KantineGit() {
		System.out.println("Kantine akıyorum gençler.");
	}
	
}
