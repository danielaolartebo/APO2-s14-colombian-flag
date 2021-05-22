package model;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Flag {
	
	public final static String ESC   = "\u001b[";
	public static double width=4;
	private BufferedWriter printer;
	private int position;
	private int time;
	private int color;
	private int large;
	public int height=1;
	private char space=' ';
	
	public Flag(int color, int time,int position,int large) {
		this.color=color;
		this.time=time;
		this.position=position;
		this.large=large;
		printer= new BufferedWriter(new OutputStreamWriter(System.out));
	}

	public void initialize() throws IOException, InterruptedException {
		printer.write(ESC+position+";"+0+"f");
		while(height<200) {
		for (int i = 0; i < large; i++) {
			printer.write(ESC+color+"m"+space);
			printer.flush();
			Thread.sleep(time);
			int x=position+i;
			printer.write(ESC+x+";"+height+"f");
		}
			printer.write(ESC+color+"m"+space);
			printer.flush();
			height++;
			printer.write(ESC+position+";"+height+"f");
		}
	}
}
