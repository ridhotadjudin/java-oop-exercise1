package nexsoft.uicli;

import java.util.ArrayList;
import java.util.List;

import nexsoft.uicli.bidang.RuangBidang;

public class UIManager {
	String teks = "";
	
	//membuat collection
	List<RuangBidang> bidang = new ArrayList<RuangBidang>();

	//	RuangBidang bidang;
	
	public void add(RuangBidang bidang){
		this.bidang.add(bidang);
	}
	
//	public void add(RuangBidang bidang){
//		this.bidang = bidang;
//	}
	
	public UIManager() {
		teks = "Hello";
	}

	public UIManager(String teks) {
		this.teks = teks;
	}

	public void print() {
		if(bidang!= null) { //pakai for each
			for(RuangBidang ruangBidang : bidang) {
				ruangBidang.draw();
			}
		}else {
			System.out.println(this.teks);
		}
	}
	
	//efek
//	public void print() {
//		if(bidang!= null) {
//			bidang.draw();
//		}else {
//			System.out.println(this.teks);
//		}
//	}

}