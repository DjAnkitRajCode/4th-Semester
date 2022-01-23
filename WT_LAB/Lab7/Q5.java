/*Write a program to create an Account class containing acc_no, balance as data
members and disp() to display the details. Inherit it in Person class with all
mentioned data members and functions. Person class also has name and
aadhar_no as extra data members of its own. Override disp() function. Create
5 persons‟ details.
*/
import java.util.*;
class account
{
    int acc_no;
    double balance;
    account(int a,double b)
    {
        acc_no=a;
        balance=b;
    }
    void display()
    {
        System.out.println("Account number="+acc_no);
        System.out.println("Balance="+balance);
    }
}
class person extends account
{
    String name;
    int adn;
    person(String n,int m,int x,double y)
    {
        super(x,y);
        name=n;
        adn=m;
    }
    void display()
    {
        super.display();
        System.out.println("Account holder name="+name);
        System.out.println("Aadhar no="+adn);
    }
}
public class Q5
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        double g;
        String j;
        int i,c,f;
        for(i=0;i<2;i++)
        {
            System.out.println("enter name,aadhar,account no and balance");
            j=in.nextLine();
            c=in.nextInt();
            f=in.nextInt();
            g=in.nextDouble();
            person ob=new person(j,c,f,g);
            ob.display();
        }
    }
}