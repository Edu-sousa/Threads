package view;

import controller.Ex04Thread;

public class Main04 {

	public static void main(String[] args) {

		int percurso = 100;

		System.out.println("\tCORRIDA DE 100 METROS!!!");

		for (int i = 1; i < 6; i++) {
			Thread thread = new Ex04Thread(i, percurso);
			thread.start();
		}
	}
}
