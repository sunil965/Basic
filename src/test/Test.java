package test;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte b = 10;
		b= (byte) (b+1);
		System.out.println("Byte value b is : "+b);
		
		double d=getCommission(0);
		System.out.println("Double value d is : "+d);
	}

	private static double getCommission(double margin) {
	    BigDecimal bd = BigDecimal.valueOf(((10000 / (100 - margin)) - 100));
	    bd = bd.setScale(2, RoundingMode.HALF_UP);
	    return bd.doubleValue();
	  }
}
