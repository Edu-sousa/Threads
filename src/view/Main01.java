package view;

import controller.Ex01Thread;

public class Main01 {

	public static void main(String[] args) {

		for (int id = 0; id < 5; id++) {
			Thread thread = new Ex01Thread();
			thread.start();
		}
	}
}
