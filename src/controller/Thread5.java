package controller;

public class Thread5 extends Thread {
	
	private int CThread;
	
	public Thread5(int CThread) {
		this.CThread = CThread;
		
	}

	@Override
	public void run() {
		System.out.println(CThread);

	}
	

	


}
