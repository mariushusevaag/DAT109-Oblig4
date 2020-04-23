package no.hvl.dat109.objects;

public class Terning {

	private final int MAX = 6;
	private int verdi;

	public Terning() {
		verdi = 1;
	}

	public Terning(int verdi) {
		this.verdi = verdi;
	}

	public int trill() {
		verdi = (int) (Math.random() * MAX) + 1;

		return verdi;
	}

	public int getVerdi() {
		return verdi;
	}

	public void setVerdi(int verdi) {
		this.verdi = verdi;
	}

	@Override
	public String toString() {
		String result = Integer.toString(verdi);
		return result;
	}

}
