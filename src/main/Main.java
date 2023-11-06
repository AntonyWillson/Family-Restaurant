package main;

import java.util.ArrayList;
import java.util.Scanner;

import model.Menus;
import model.Regular;
import model.Special;

public class Main {
	Scanner s = new Scanner(System.in);
	ArrayList<Menus> RegularMenuList = new ArrayList<>();
	ArrayList<Menus> specialMenuList = new ArrayList<>();
	
	public Main() {
		while (true) {
			System.out.println("Family Restaurant");
			System.out.println("==========================");
			System.out.println("1. Add Regular Menu");
			System.out.println("2. Add Special Menu");
			System.out.println("3. Show All Menu");
			System.out.println("4. Delete Regular Menu");
			System.out.println("5. Delete Special Menu");
			System.out.println("6. Exit");
			
			int choose;
			do {
				System.out.print("Choice [1-6] : ");
				choose = s.nextInt();s.nextLine();
			} while (choose < 1 || choose > 6);
			
			switch (choose) {
			case 1:
				menu1();
				break;
				
			case 2:
				menu2();
				break;
				
			case 3:
				menu3();
				break;
				
			case 4:
				menu4();
				break;
				
			case 5:
				menu5();
				break;
				
			case 6:
				System.exit(0);
				break;

			
			}
		}
	}
	

	void menu1() {
		System.out.println("Add Regular Menu");
		System.out.println("===========================");
		
			 		
		String kode = "a";
		
					do {
						System.out.print("Input Menu Code : ");
						kode = s.nextLine();
						
						for (Menus menus : RegularMenuList) {
							if (menus.getKode().equals(kode)) {
								kode = "r";
							}
						}
						
					} while (kode.length() != 4 || !kode.startsWith("R"));
				
				
		
					String name;
					do {
						System.out.print("Input menu name : ");
						name = s.nextLine();
					} while (name.length() < 5 || name.length() > 20);
					int harga;
					do {
						System.out.print("Input menu price : ");
						harga = s.nextInt();
						s.nextLine();
					} while (harga < 10000 || harga > 100000);
					Menus r = new Regular(kode, name, harga);
					RegularMenuList.add(r);
				}
		
	
	
	void menu2() {
		System.out.println("Add Special Menu");
		System.out.println("===========================");
		String kode;
		do {
			System.out.print("Input Menu Code : ");
			kode = s.nextLine();
			
			for (Menus menus : specialMenuList) {
				if (menus.getKode().equals(kode)) {
					kode = "r";
				}
			}
			
		} while (kode.length() != 4 || !kode.startsWith("S"));
	
		
		String name;
		do {
			System.out.print("Input menu name : ");
			name = s.nextLine();
		} while (name.length() < 5 || name.length() > 20);
		
		int harga;
		do {
			System.out.print("Input menu price : ");
			harga = s.nextInt();s.nextLine();
		} while (harga < 10000 || harga > 100000);
		
		int diskon;
		do {
			System.out.print("Input menu diskon : ");
			diskon = s.nextInt();s.nextLine();
		} while (diskon != 10 && diskon != 25 && diskon != 50);
		
		Menus s = new Special(kode, name, harga, diskon);
		specialMenuList.add(s);
	}
	
	void menu3() {
		System.out.println("Reguler Menu");
		System.out.println("==================================================");
		System.out.printf("|%-5s|%-10s|%-20s|%-10s|\n","No.","Kode","Nama","Harga");
		System.out.println("==================================================");
		for (int i = 0; i < RegularMenuList.size(); i++) {
			Menus r = RegularMenuList.get(i);
			System.out.printf("|%-5s|%-10s|%-20s|%-10s|\n",(i+1),r.getKode(),r.getName(),r.getHarga());
		}
		System.out.println(" ");
		System.out.println("============================================================");
		System.out.printf("|%-5s|%-10s|%-20s|%-10s|%-10s|\n","No.","Kode","Nama","Harga","Diskon");
		System.out.println("============================================================");
		for (int i = 0; i < specialMenuList.size(); i++) {
			Menus s = specialMenuList.get(i);
			System.out.printf("|%-5s|%-10s|%-20s|%-10s|%-10s|\n",(i+1),s.getKode(),s.getName(),s.getHarga(),((Special)s).diskon);
		}
	}
	
	void menu4() {
		String choose;
		boolean found = false;
		
		while (found == false) {
			do {
				System.out.print("Masukan Kode : ");
				choose = s.nextLine();
			} while (choose.length() != 4);
			
			for (int i = 0; i < RegularMenuList.size(); i++) {
				if (choose.equals(RegularMenuList.get(i).getKode())) {
					RegularMenuList.remove(i);
					found = true;
				}
			}
		}
	}
	
	void menu5() {
			String choose;
			boolean found = false;
			
			while (found == false) {
				do {
					System.out.print("Masukan Kode : ");
					choose = s.nextLine();
				} while (choose.length() != 4);
				
				for (int i = 0; i < specialMenuList.size(); i++) {
					if (choose.equals(specialMenuList.get(i).getKode())) {
						specialMenuList.remove(i);
						found = true;
					}
				}
			}
		
	}

	public static void main(String[] args) {
		new Main();

	}

}
