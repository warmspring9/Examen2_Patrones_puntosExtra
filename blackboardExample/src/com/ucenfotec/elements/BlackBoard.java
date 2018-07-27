package com.ucenfotec.elements;

public class BlackBoard {
	int number1;
	int number2;
	int respuesta;
	
	public BlackBoard() {
		number1 = 0;
		number2 = 0;
		respuesta = 0;
	}
	public int getNumber(int a) {
		if(a==1) {
			return number1;
		} else {
			return number2;
		}
	}
	public void save(int number,int a) {
		if(a==1) {
			number1 = number;
		} else {
			number2 = number;
		}
	}
	public void answear(int number) {
		respuesta = number;
	}
	public int getAnswear() {
		return respuesta;
	}
}
