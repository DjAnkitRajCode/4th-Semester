package Lab11;

import java.util.Scanner;

public class five {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scr=new Scanner(System.in);
	       System.out.println("Enter string: ");
	       String st=scr.next();
	       System.out.println("Enter another string: ");
	       String st2=scr.next();
	       int x=st.compareToIgnoreCase(st2);
	       if(x!=0)
	       System.out.println("String 1 is "+((x>0)?">":"<")+" String 2 ");
	       else
	       System.out.println("String 1 and string 2 are equal ");
	}

}