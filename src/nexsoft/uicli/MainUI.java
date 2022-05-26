package nexsoft.uicli;

import nexsoft.uicli.bidang.Kotak;
import nexsoft.uicli.bidang.RuangBidang;
import nexsoft.uicli.bidang.Segitiga;

public class MainUI {

	public static void main(String[] args) {

		UIManager ui = new UIManager();
		RuangBidang ruang = new RuangBidang();
//		ui.add(new RuangBidang());
//		ui.add(new Kotak(10));
//		ui.add(new Segitiga(10));
//		ui.add(new Kotak(5));
//		ui.add(new Segitiga(5));
//		ui.print();  //contoh encapsulation - tidak kelihatan fungsi draw
		
		Matematika mtk = new Matematika();
		mtk.add(new Kotak(5));
		mtk.add(new Segitiga(5));
		mtk.calculate();
		
	}

}
