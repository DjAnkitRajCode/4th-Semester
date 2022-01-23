import java.util.Scanner;

public class five {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter No of students: ");
        int n=myObj.nextInt();
        batch[] yp = new batch[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter Your Roll No :");
            int roll;
            roll=myObj.nextInt();
            String name;
            name=myObj.nextLine();
            float CGPA;
            CGPA=myObj.nextFloat();
            yp[i].getdata(roll,name,CGPA);

        }
        batch x= new batch();
        x.lowest_CGPA(yp,n);


    }
    static class batch
    {
       int roll;
       String name;
       float CGPA;
       public void getdata(int r,String s, float C)
       {
           roll= r;
           name=s;
           CGPA=C;
       }

       public void lowest_CGPA(batch[] yp,int n)
       {
          float lowest=100;
          for(int i=0;i<n;i++)
          {
              if(lowest>yp[i].CGPA)
              {
                  lowest= yp[i].CGPA;
              }
          }
           System.out.println("Lowest CGPA is :"+ lowest);
       }
    }

}