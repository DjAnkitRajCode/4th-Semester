import java.util.Scanner;

public class perfectNumber{
    public static void main(String[] args) {
        System.out.println("Enter the num");
        Scanner scn = new Scanner(System.in);
        int num=scn.nextInt();
        int rem=0;
        int sum=0;
        for(int i=1;i<num;i++)
        {
            rem= num%i;
            if(rem==0)
            {
                sum=sum+i;
            }
        }

        if(sum==num)
        {
            System.out.println("Perfect num");
        }
        else
        {
            System.out.println("Not a perfect num");
        }
    }
}