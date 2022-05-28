class Ayam {
	private static String jenis_unggas = "Ayam";
	private static int jumlah_kaki = 2;

	public static String getJenisUnggas(){
		return jenis_unggas;
	}
	public static int getJumlahKaki(){
		return jumlah_kaki;
	}
	private static void berkokok(){
	System.out.println("Aku berkokok");
	}
	private static void berlari(){
		System.out.println("Aku berlari");
	}

	public static void main(String[] args) {
		System.out.println(String.format("Jenis unggas: %s", getJenisUnggas()));
		System.out.println(String.format("Jumlah kaki: %s", getJumlahKaki()));
		
		berkokok();
		berlari();
	}
}
