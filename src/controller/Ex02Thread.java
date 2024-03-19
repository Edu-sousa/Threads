package controller;

public class Ex02Thread extends Thread {

	private int[] vetor;

	public Ex02Thread(int[] vetor) {
		this.vetor = vetor;
	}

	@Override
	public void run() {
		somaLinha(vetor);
	}

	private void somaLinha(int[] vet) {
		int soma = 0, linha = 0;

		for (int cont = 0; cont < vet.length; cont++) {
			soma = soma + vet[cont];
		}

		System.out.println("TID " + getId() + " soma " + soma);
	}
}