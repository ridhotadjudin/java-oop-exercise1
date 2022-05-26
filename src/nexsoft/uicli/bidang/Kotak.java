package nexsoft.uicli.bidang;

import nexsoft.uicli.Soal;

//inheritance
public class Kotak extends RuangBidang implements Soal {
	int pSisi = 1;

	public Kotak() {

	}

	public Kotak(int pSisi) {
		this.pSisi = pSisi;
	}
	
	//bisa untuk mengganti sifat turunan
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		for(int x=0;x<pSisi;x++) {
			for(int y=0;y<pSisi;y++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	@Override
	public void calculate() {
		System.out.println("Nilai luas adalah : "+(pSisi*pSisi));
		
	}
}
