import java.util.Scanner;

class Kotak {
	public int panjang;
	public int lebar;
	public int tinggi;
	
	public int volume() {
		return panjang*lebar*tinggi;
	}
		
	public Kotak(){}
		
	public Kotak(int sisi) {
			panjang = sisi;
			lebar = sisi;
			tinggi = sisi;
	}
		
	public Kotak(int a, int b, int c) {
			panjang = a;
			lebar = b;
			tinggi = c;
	}
}

class Contoh {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		
		Kotak kotak;
		
		while(true) {
			System.out.println("Pilih jenis bidang ruang: \n1.Kubus \n2. Balok");
			int bidang ruang = in.nextInt();
			
			if (bidang ruang == 1 ) {
				System.out.println("Masukan nilai sisi: ");
				int sisi = in.nextInt();
				kotak = new Kotak(sisi);
				
				break;
			} else if (bidang ruang == 2){
				System.out.println("Masukan nilai panjang: ");
				int panjang = in.nextInt();
				
				System.out.println("Masukan nilai lebar: ");
				int lebar = in.nextInt();
				
				System.out.println("Masukan nilai tinggi: ");
				int tinggi = in.nextInt();
				kotak = new Kotak(panjang, lebar, tinggi);
				
				break;
			 }
		}
		
		System.out.println(String.format("Volume kotak: %s", kotak.volume()));
	}
}	
