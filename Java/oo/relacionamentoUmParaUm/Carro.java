package oo.relacionamentoUmParaUm;

public class Carro {
	
	Motor motor= new Motor();
	//Nesse caso, a relação é de 1 para um, um motor possui um carro
	
	void ligar() {
		motor.status = true;
	}
	void desligar() {
		motor.status = false;
	}
	
	boolean estaLigado() {
		return motor.status;
	}
	void acelerar() {
		if(motor.fatorInj <2.6) {
		motor.fatorInj += 0.4;
		}
	}
	void freiar() {
		if(motor.fatorInj > 0.5) {
			motor.fatorInj -= 0.4;
		}
	}
	

}
