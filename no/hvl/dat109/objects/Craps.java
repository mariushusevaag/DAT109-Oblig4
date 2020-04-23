package no.hvl.dat109.objects;

public class Craps {
	
	static TerningKopp tk = new TerningKopp();

	public static void main(String[] args) {
		int sum = tk.trillTerninger();
		System.out.println("Du trilte " + sum);

		if (sum == 7) {
			System.out.println("Du vant!");
			
		} else {
			System.out.println("Du tapte!");
		}

	}

}
