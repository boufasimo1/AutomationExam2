package loops;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
	Scanner ui = new Scanner(System.in)	;
	
	boolean w = false ;
 
	String l = null;

	 while (w==false) {
  
		 	l = ui.nextLine();
		 	String v ="" ;
		 	char[] h = l.toCharArray();
		 
		 	for (int i=l.length()-1;i>=0 ;i-- ) {
			v =v+ h[i];
		 	}
		 	w = l.equalsIgnoreCase(v);
		 	if (w==false)
		 		System.out.println(l+" is not a palindrome, Please try again... ");
	 		}
	 		System.out.println("it's a palindrom");
	 	}
	}
