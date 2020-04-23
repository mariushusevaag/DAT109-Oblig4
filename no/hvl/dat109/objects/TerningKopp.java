package no.hvl.dat109.objects;

public class TerningKopp {
	
	Terning t1;
	Terning t2;
	
	
	public TerningKopp() {
		t1 = new Terning();
		t2 = new Terning();
	}
	
	public int trillTerninger() {
		return t1.trill() + t2.trill();
	}

}
