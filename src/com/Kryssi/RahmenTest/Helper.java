package com.Kryssi.RahmenTest;

import java.util.Random;

public class Helper 
{
	
	public static double random_DblRange(int x1, int x2) {
	    return Math.floor(x1 + (Math.random() * (x2 - x1)));
	}
	
	public static int random_IntRange(int iFrom, int iTo) {
		if(iTo==0) { return 0; }
		Random generator = new Random();
	    return generator.nextInt(iTo-iFrom)+iFrom;
	}
	
	public static int nextRandomInt(int iMax) {
		if(iMax==0) { return 0; }
		Random generator = new Random();
	    return generator.nextInt(iMax);
	}

}
