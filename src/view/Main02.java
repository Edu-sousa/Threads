package view;

import controller.Ex02Thread;

public class Main02 {

	public static void main(String[] args) {

		int[][] matriz = new int[3][5];

		for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 5; y++) {
				matriz[x][y] = (int) (Math.random() * 100);
			}
			System.out.println();
			Thread thread = new Ex02Thread(matriz[x]);
			thread.start();
		}

//		System.out.println("\n\n\n\n");
//
//		for (int x = 0; x < 3; x++) {
//			for (int y = 0; y < 5; y++) {
//				System.out.print(+matriz[x][y] + " ");
//			}
//			System.out.println();
//			Thread thread = new Ex02Thread(matriz[x]);
//			thread.start();
//		}

	}

}