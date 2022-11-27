package oo.relacionamentoUmParaUm;

public class Motor {
	
	boolean status = false;
	double fatorInj = 1;
	
	int giros() {
		if (status==true) {
			return (int) Math.round(fatorInj * 3000);
		} else return 0;
	}
	
	

}
