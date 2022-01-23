import java.util.Scanner;

public class Lab5_Q3 {
        public static void main(String[] args){
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter the size of the Array: ");
            int n= scanner.nextInt();
            int[] a=new int[n];
            int temp=0;
            System.out.println("Enter the Elements: ");
            for(int i=0;i<n;i++)
            {
                a[i]=scanner.nextInt();
            }
            for(int i=0;i<n-1;i++)
            {
                for(int j=0;j<n-i-1;j++)
                {
                    if(a[j]>a[j+1])
                    {
                        temp = a[j];
                        a[j] = a[j+1];
                        a[j+1] = temp;
                    }
                }
            }
            System.out.println("Sorted Numbers are: ");
            for(int i=0;i<n;i++)
            {
                System.out.print(a[i]+" ");
            }
        }
    }
