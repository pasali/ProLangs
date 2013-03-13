
public class TestKisiler {

	public static void main(String[] args) {
		
		Ogrenci o1 = new Ogrenci(12423, "ali", "Veli", 1991, 1, 3, "BilMuh", "Uganda");
		o1.DerseGir();
		o1.KantineGit();
		System.out.println(o1.getMemleket());
		Memur m1 = new Memur(1234, "veli", "ali", 1987, 1, "Öğrenciİşleri");
		m1.EvrakGetir();
		m1.EvrakGötür();
		Ogretmen O1 = new Ogretmen(1234, "ahmet", "ali", 1967, 1, "İnşaat");
		O1.DerseGir();
		O1.SinavYap();
		OgretimUyesi ou1 = new OgretimUyesi(1234, "veli", "ipçi", 1977, 1, "Makina", "Prof");
		System.out.println(ou1.getUnvan() + " " + ou1.getAd() + " " + ou1.getSoyad());
		ou1.DerseGir();
		ou1.SinavYap();
		
	}
}
