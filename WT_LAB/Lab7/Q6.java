import java.util.Scanner;

class base
{

    base(int a)
    {

        System.out.println("base constructor with parameter called value of para="+a);
    }
}
class derived extends base
{

    derived(int c)
    {
        super(10);

        System.out.println("derived constructor with parameter called value of para="+c);
    }
}
public class Q6
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        derived ob=new derived(20);
    }
}