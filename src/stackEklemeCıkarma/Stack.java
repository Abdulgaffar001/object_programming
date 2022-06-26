package stackEklemeCıkarma;

import java.util.Arrays;
import java.util.Iterator;
 
import javax.print.attribute.standard.MediaSize.NA;

public class Stack {
	
	 public static final int Max_Stack_Size=5; 
	 boolean full= false;
	 boolean empty= true;
	 
	 String[] array = new String[ Max_Stack_Size];
	 int pointer = 0;
	 public boolean push(String newElement) {
		 if (!full) {
			array[pointer]=newElement;
			pointer++;
			empty=false;
			if (pointer==Max_Stack_Size) {
				full= true;
			}
			return true;
		}
		 else {
			 return false;
		}
		
	 }
	
	 public String pop() {
		 String lastItem=null;
		 if (!empty) {
			 lastItem = array[pointer-1];
			 array[pointer-1]=null;
			 pointer--;
			 if (pointer!=Max_Stack_Size) {
				 full= false;
			 }
			 if (pointer==0) {
				 empty= true;
			 }
		 }
		 
		 return lastItem;
		 }
	
	 
	 public void clear() {
		 Arrays.fill(array,null);
		 pointer=0;
		 empty=true;
		 full=false;
		 
	 }
	 
	 public boolean isEmpty() {
		 return empty;
	 }
	 
	 public boolean isFull() {
		 return full;
	 }
	 
	 public int size () {
		 return pointer; 
	 }
	 
	 public int getCapacity() {
		 return  Max_Stack_Size;
	 }
	 
	 public void showElements() {
		 System.out.println("***Elements in the Stack ");
		 if (!empty)
			 for(String s:array) {
				 if (s != null)
				   System.out.println(s);
		 }
		 else 
			 System.out.println("Nothing in the Stack");
	 }
}