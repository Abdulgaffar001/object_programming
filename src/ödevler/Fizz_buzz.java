package ödevler;

import java.util.Scanner;

public class Fizz_buzz { 
	
	public static void main(String[] args) {
		
		
		 System.out.println("Lutfen pozitif bir sayi giriniz ");
			Scanner sc =new Scanner(System.in);
			int n= sc.nextInt();

	
	

                               

    if (n%15==0)                                                
        System.out.println("FizzBuzz");
   
    else if (n%5==0)    
        System.out.println("Buzz");


    else if (n%3==0)    
        System.out.println("Fizz");
         
    else
        System.out.println("bu fizz buzz degil "+n);  

}
		
		
}


