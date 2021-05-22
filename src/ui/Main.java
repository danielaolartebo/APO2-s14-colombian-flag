package ui;

import thread.FlagThread;

/*
 * 
 * Seguimiento 14
 * Daniela Olarte Borja
 * A00368359
 * 
 */

public class Main {
	public final static String ESC   = "\u001b[";
	public final static int blue=44;
	public final static int yellow=43;
	public final static int red=41;
	
	public static void main(String[] args) {
	System.out.println(ESC+"2J");
	
	FlagThread colorY =new FlagThread(yellow,10,1,10);
	FlagThread colorB =new FlagThread(blue,20,11,5);
	FlagThread colorR =new FlagThread(red,30,16,5);
	
	colorY.start();
	colorB.start();
	colorR.start();

	}
}

