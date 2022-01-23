import java.util.Scanner;

public class four {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Length");
        int length=myObj.nextInt();
        System.out.println("Enter bre");
        int breadth=myObj.nextInt();
         rectangle r = new rectangle(length,breadth);
         r.area();
         r.perimeter();
    }


}
class rectangle
{ int len,bre;
    rectangle(int x,int y)
    {
        len=x;
        bre=y;
    }
    public void area()
    {
        System.out.println("Area of the rectangle is :"+(len*bre));
    }
    public void perimeter()
    {
        System.out.println("Perimeter is : "+(2*(len+bre)));
    }
}