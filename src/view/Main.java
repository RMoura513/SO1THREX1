package view;

import controller.Thread5;

public class Main {

	public static void main(String[] args) {

		for (int CThread = 0; CThread < 5; CThread++) {
        Thread thread5 = new Thread5(CThread);
		thread5.start();
		}
	}

}
