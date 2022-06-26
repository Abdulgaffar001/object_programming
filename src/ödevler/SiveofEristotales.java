package ödevler;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class SiveofEristotales {

	public static void main(String[] args) {
		
		 SiveofEristotales seo =new  SiveofEristotales();
		 System.out.println("Lutfen pozitif bir sayi giriniz ");
			Scanner sc =new Scanner(System.in);
			int n= sc.nextInt();
		 seo.countNumberOfPrimesUPTo(n);
		
	}
	void countNumberOfPrimesUPTo(int n ) { 
		long start =System.currentTimeMillis();
		boolean [] list=new boolean[n+1];
		Arrays.fill(list,true);
		
		int upperBound = (int)(Math.sqrt(n)+1);		
		for (int i = 2; i <= upperBound; i++) {
			if(list[i]==true) {
				for(int j=2;i*j<=n;j++)
					list[i*j]=false;}
		}
		
		int numberOfPrime=0;
		for (boolean b : list) {
			if (b) {
			numberOfPrime++;
			}
		}
		long end=System.currentTimeMillis();
		long time = end - start;
		
		System.out.println(n+" sayina kadar "+( numberOfPrime -2)+" tane asal sayi vardir ");
		System.out.println("Time: "+time+" ms.");
	}

}
