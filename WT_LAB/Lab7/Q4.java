import java.util.*;
public class Q4 {

    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int x,y,z;
        System.out.println("enter radius of circle");
        x=in.nextInt();
        System.out.println("enter l and b for rec");
        y=in.nextInt();
        z=in.nextInt();
        circle ob=new circle();
        ob.cal(x);
        ob.show_area();
        rectangle ob1=new rectangle();
        ob1.cal(y,z);
        ob1.show_area();
    }

    }
class shape
{
    double area;
    void show_area()
    {
        System.out.println("Area="+area);
    }
}
    class circle extends shape
    {
        int r;
        void cal(int a)
        {
            r=a;
            area=3.14*r*r;
        }
    }
    class rectangle extends shape
    {
        int l,b;
        void cal(int a,int c)
        {
            l=a;
            b=c;
            area=l*b;
        }
    }