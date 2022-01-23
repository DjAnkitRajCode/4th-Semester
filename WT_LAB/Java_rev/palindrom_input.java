import java.util.Scanner;

public class palindrom_input {
    public static void main(String[] args) {
        System.out.println("Enter the num");
        Scanner scn = new Scanner(System.in);
        int num=scn.nextInt();
        int rem=0;
        int check=num;
        int vol=0;
        while(num>0)
        {
            rem= num%10;
            vol=(vol*10)+rem;
            num= num/10;
        }
        if(check==vol)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not palindrome");
        }

    }
}