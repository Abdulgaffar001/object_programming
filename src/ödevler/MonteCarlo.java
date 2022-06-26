package ödevler;

import java.util.Iterator;
import java.util.Scanner;

public class MonteCarlo {
	public static void main(String[] args) {
		System.out.println("nokta sayisini giriniz");
		
		
		Scanner sc= new Scanner(System.in);
		
		int n= sc.nextInt();
		
		int numberIncircle=0;
		
		
		long start=System.currentTimeMillis();
		
		for (int i = 0; i < n ; i++) {
			double x=Math.random();
			double y=Math.random();
			double distance = x*x+y*y;
			if (distance<=1) {
				numberIncircle++;
				
			}
		}
	
		long end =System.currentTimeMillis();
		long time= end-start;
		double mypi= 4.0*numberIncircle/n;
		System.out.println("MYPI: "+ mypi);
		System.out.println("javas PI"+Math.PI);
		System.out.println("Time: "+time	);
	}
	
	


}
