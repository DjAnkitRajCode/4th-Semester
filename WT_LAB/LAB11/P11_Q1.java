import java.util.*;
public class P11_Q1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a;
		char ch;
		a=sc.nextLine();
		System.out.println("Before changing the case");
		System.out.println(a);
		char temp[] = a.toCharArray();
		int x;
		for(int i=0;i<temp.length;i++)
		{
			x=(int)temp[i];
			if(x>=97&&x<=122)
			{
				x-=32;
				temp[i]=(char)x;
			}
			else
			{
				x+=32;
				temp[i]=(char)x;
			}
		}
		System.out.println("After changing the case");
		for(int i=0;i<temp.length;i++)
			System.out.print(temp[i]);
		System.out.println();
		temp=a.toCharArray();
		String b="";
		for(int i=a.length()-1;i>=0;i--)
			b+=temp[i];
		System.out.println("Reverse of the string is");
		System.out.println(b);
		String c;
		c=sc.nextLine();
		if(a.equals(c))
			System.out.println("They are equal");
		else
			System.out.println("They are not equal");
		a+=c;
		System.out.println("After joining the strings are");
		System.out.println(a);
	}
}