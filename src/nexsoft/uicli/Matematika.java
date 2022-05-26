package nexsoft.uicli;

import java.util.ArrayList;
import java.util.List;

public class Matematika {
	
	List<Soal> listSoal = new ArrayList<Soal>();
	
	public void add(Soal soal) {
		this.listSoal.add(soal);
	}
	
	public void calculate() {
		for(Soal soalx : listSoal) {
			soalx.calculate();
		}
	}
	
}
