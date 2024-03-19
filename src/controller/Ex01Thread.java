package controller;

public class Ex01Thread extends Thread {

	public Ex01Thread() {
	}

	@Override
	public void run() {
		System.out.println("TID " + getId());
	}

}
