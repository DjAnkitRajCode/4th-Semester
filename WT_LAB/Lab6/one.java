import java.util.Scanner;

public class one {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Length");
        int length=myObj.nextInt();
        System.out.println("Enter Length");
        int breadth=myObj.nextInt();
        System.out.println("Enter Length");
        int height=myObj.nextInt();
       box b = new box(length,breadth,height);
       b.volume();
    }

}
class  box
{
    int len,bre,hig;
   box(int l,int b,int h)
   {
       len=l;
       bre=b;
       hig=h;
   }
 public void volume()
 {
     int vol= len*bre*hig;
     System.out.println("Volume is : "+vol);
 }
}
