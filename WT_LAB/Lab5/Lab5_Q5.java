import java.util.Scanner;

public class Lab5_Q5 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total no. of elements in the array: ");
        int n=sc.nextInt();
        int []a=new int[n];
        int []freq=new int[n];
        int visit=-1;
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            int c=1;
            for(int j=i+1;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    c++;
                    freq[j]=visit;
                }
            }
            if(freq[i]!=visit)
            {
                freq[i]=c;
            }
        }
        for(int i=0;i<freq.length;i++)
        {
            if(freq[i]!=visit)
            {
                System.out.println(a[i]+" is present "+freq[i]+" time(s) in the array.");
            }
        }
    }
    }
