package com.ucenfotec.elements;

public class Suma implements KnowledgeSources {
	BlackBoard BB;
	int a = 0;
	int b = 0;
	
	public Suma(BlackBoard BB) {
		this.BB = BB;
	}
	@Override
	public void getNumbers() {
		a = BB.getNumber(1);
		b = BB.getNumber(2);
	}

	@Override
	public int operate() {
		return a + b;
	}

	@Override
	public void store(int pNumber) {
		BB.answear(pNumber);

	}

}
