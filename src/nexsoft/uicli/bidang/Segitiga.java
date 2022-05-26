package nexsoft.uicli.bidang;

import nexsoft.uicli.Soal;

public class Segitiga extends RuangBidang implements Soal {
	int panjang = 1;
	
	public Segitiga() {

	}

	public Segitiga(int panjang) {
		this.panjang = panjang;
	}
	
	//bisa untuk mengganti sifat turunan
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		for(int x=0;x<=panjang;x++) {
			for(int y=0;y<=x;y++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	@Override
	public void calculate() {
		System.out.println("Luas segitiga : "+(0.5*panjang*panjang));
		
	}
}
