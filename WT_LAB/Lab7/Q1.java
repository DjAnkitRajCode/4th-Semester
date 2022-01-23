import java.util.Scanner;
    class two_D
    {
        int a;
        void input()
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the value: ");
            a=sc.nextInt();
        }
        void calc()
        {
            double cost=40*a*a;
            System.out.println("The cost of 2-D sheet is Rs. "+cost);
        }
    }
    class three_D extends two_D
    {
        void calc()
        {
            double cost=60*a*a*a;
            System.out.println("The cost of 3-D box is Rs. "+cost);

        }
    }
public class Q1 {
        public static void main(String args[])
        {
            two_D obj1=new two_D();
            obj1.input();
            obj1.calc();
            three_D obj2=new three_D();
            obj2.input();
            obj2.calc();
        }
    }
