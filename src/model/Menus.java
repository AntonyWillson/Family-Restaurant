package model;

public abstract class Menus {
	private String kode;
	private String name;
	private int harga;
	
	public Menus(String kode, String name, int harga) {
		super();
		this.kode = kode;
		this.name = name;
		this.harga = harga;
	}

	public String getKode() {
		return kode;
	}

	public void setKode(String kode) {
		this.kode = kode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHarga() {
		return harga;
	}

	public void setHarga(int harga) {
		this.harga = harga;
	}
	
	
	
}
