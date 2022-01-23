import java.util.Scanner;
public class seven {
        public static void main(String[] args) {
            Numbers numm = new Numbers();
            numm.read();
            numm.swap();
            numm.display();
        }
    }
    class Numbers
    {
        int[] num;
        int n;
        public void read()
        {
            Scanner myObj = new Scanner(System.in);
            System.out.println("Enter the no. of elements: ");
            n = myObj.nextInt();
            num=new int[n];
            System.out.println("Enter the elements: ");
            for(int i=0;i<n;i++)
            {
                num[i]=myObj.nextInt();
            }
        }
        public void swap()
        {
            int max=0,maxi=0;
            int min=99999,mini=0;
            for(int i=0;i<n;i++)
            {
                if(num[i]>max)
                {
                    max=num[i];
                    maxi=i;
                }
                if(num[i]<min)
                {
                    min=num[i];
                    mini=i;
                }
            }
            num[mini]=max;
            num[maxi]=min;
            System.out.println("Swapped.");
        }
        public void display()
        {
            for(int i=0;i<n;i++)
            {
                System.out.print(num[i]+" ");
            }
        }
    }
