package model;

public class Special extends Menus {
	public int diskon;

	public Special(String kode, String name, int harga, int diskon) {
		super(kode, name, harga);
		this.diskon = diskon;
	}
	
	
}
