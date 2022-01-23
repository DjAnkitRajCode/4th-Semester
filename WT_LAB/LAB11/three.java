package Lab11;
import java.util.*;
public class three {

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
	}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println("Wrong index: "+e);
		}
	}

}