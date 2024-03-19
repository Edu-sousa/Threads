package view;

import controller.Ex03Thread;

public class Main03 {

	public static void main(String[] args) {

		int[] vetor = new int[1000];

		for (int i = 0; i < 1000; i++) {
			vetor[i] = (int) (Math.random() * 101);
		}
		
		Thread threadImpar = new Ex03Thread(vetor, 1);
		
		Thread threadPar = new Ex03Thread(vetor,2);
		threadPar.start();
	}

}
