package com.ucenfotec.elements;

public class Controler {
	BlackBoard BB;
	
	public Controler() {
		BB = new BlackBoard();
	}
	public int Sumar(int a,int b) {
		KnowledgeSources suma = new Suma(BB);
		BB.save(5, 1);
		BB.save(7, 2);
		suma.getNumbers();
		suma.store(suma.operate());
		return BB.getAnswear();
	}
}
