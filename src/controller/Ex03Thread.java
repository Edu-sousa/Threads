package controller;

public class Ex03Thread extends Thread {

	private int numero;
	private int[] vetor;

	public Ex03Thread(int[] vetor, int numero) {

		this.vetor = vetor;
		this.numero = numero;
	}

	@Override
	public void run() {
		
		if(numero %2 ==0) 
			par(vetor);
		impar(vetor);

	}

	private void par(int[] vetor) {

		double tempoInicial = System.nanoTime();

		for (int i = 0; i < vetor.length; i++) {
		}

		double tempoFinal = System.nanoTime();
		double tempoTotal = (tempoFinal - tempoInicial)/Math.pow(10, 9);

		System.out.println("Tempo for: " + tempoTotal);

	}

	private void impar(int[] vetor) {

		double tempoInicial = System.nanoTime();
		
		for (int i : vetor) {}
		
		double tempoFinal = System.nanoTime();
		double tempoTotal = (tempoFinal - tempoInicial)/Math.pow(10, 9);

		System.out.println("Tempo foreach: " + tempoTotal);

	}
}
