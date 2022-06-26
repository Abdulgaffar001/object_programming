package ödevler;

import java.util.Scanner;

public class PirimeNumber {
	public static void main(String[] args) {
		PirimeNumber pn=new PirimeNumber();
	    System.out.println("Lutfen pozitif bir sayi giriniz ");
		Scanner sc =new Scanner(System.in);
		int n= sc.nextInt();
		System.out.println(pn.isPrime(n));	
	}
		boolean isPrime(int n) {
			boolean prime=true;
		
			for(int i=2;i<n;i++) {
				if (n%i==0 ) {
					prime=false;
					break;
				}
			}
			
			return prime;
		}
		}
