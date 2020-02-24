package ie.audio;

import processing.core.PVector;

public class Main
{	

	

	public void audio1()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Audio1());
		
	}

	public void audio2()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Audio2());
		
	}

	public static void main(String[] args)
	{
	
		Main main = new Main();
		main.audio1();
			
	}
}