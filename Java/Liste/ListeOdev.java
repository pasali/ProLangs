import java.util.Scanner;


public class ListeOdev {

	private int [] liste;
	private int boyut;
	
	public int[] getListe() {
		return liste;
	}

	public void setListe(int[] liste) {
		this.liste = liste;
	}

	public int getBoyut() {
		return boyut;
	}

	public void setBoyut(int boyut) {
		this.boyut = boyut;
	}

	public void ListeOlustur() {
		System.out.println("Liste boyutunu girin: ");
		Scanner scan = new Scanner(System.in);
		setBoyut(scan.nextInt());
	    this.liste = new int[getBoyut()];
	}
	
	public void ElemanEkle() {
		
		for (int i = 0; i < getBoyut(); i++) {
			System.out.println("eleman giriniz: ");
			Scanner sayi = new Scanner(System.in);
			this.liste[i] = sayi.nextInt();
		}
	}
	public void ListeYazdir() {
		for (int i : this.liste) {
			System.out.print(i + " ");
		}
		System.out.println("");
	}
	
	public void KucuktenBuyuge() {
		
		for (int k = 0; k < this.liste.length; k++) {		
			for (int i = 0; i < this.liste.length - 1 ; i++) {
				if(this.liste[i] > this.liste[i + 1]) {
					int temp = this.liste[i + 1];
					this.liste[i + 1] = this.liste[i];
					this.liste[i] = temp;
				}	
			}
		}
	}
	
	public void BuyuktenKucuge() {
			
			for (int k = 0; k < this.liste.length; k++) {		
				for (int i = 0; i < this.liste.length - 1 ; i++) {
					if(this.liste[i] < this.liste[i + 1]) {
						int temp = this.liste[i + 1];
						this.liste[i + 1] = this.liste[i];
						this.liste[i] = temp;
					}	
				}
			}
	}
	public void EnBuyuk() {
		this.KucuktenBuyuge();
		System.out.println("En buyuk eleman: " + liste[getBoyut() - 1]);
		
	}
	
	public void EnKucuk() {
		this.KucuktenBuyuge();
		System.out.println("En kucuk eleman: " + liste[0]);
	}
	
	public void ListeToplami() {
		int toplam = 0;
		for (int i : this.liste) {
			toplam += i;
		}
		System.out.println("Listedeki elemanların toplamı: " + toplam);
	}
}
