package controller;

public class Ex04Thread extends Thread {

	private int num;
	private int percurso;
	static int posicao = 1;

	public Ex04Thread(int num, int percurso) {
		this.num = num;
		this.percurso = percurso;
	}

	@Override
	public void run() {
		int total = 0;

		while (total < percurso) {

			int saltoMax = (int) (Math.random() * 20);
			total += saltoMax;
			System.out.println("Sapo numero " + num + " Saltou " + saltoMax + " metro(s), total percorrido " + total);
		}

		System.out.println("\t " + posicao + "° LUGAR," + " SAPO " + num);
		posicao++;

	}
}
