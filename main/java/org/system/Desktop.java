package org.system;

public class Desktop extends Computer {
	
	public void desktopSize() {
		System.out.println("64 bit Operating System");
		
	}

	public static void main(String[] args) {
		
	Desktop des= new Desktop();
	des.computerModel();
	des.desktopSize();

	}

}
