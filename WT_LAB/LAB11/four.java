package Lab11;

import java.util.Scanner;

public class four{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
       Scanner scr=new Scanner(System.in);
       System.out.println("Enter string: ");
       String st=scr.next();
       System.out.println("Enter an index: ");
       int n=scr.nextInt();
       char s=st.charAt(n);
       System.out.println("CHAR AT "+n+" = "+s);
       System.out.println("LENGTH: "+st.length());
       System.out.println("Concat of given string:"+st.concat(st));
       System.out.println("Substring: "+st.substring(1));
	}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println("Wrong index: "+e);
		}
	}
	}