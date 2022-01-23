import java.util.*;
class plate
{
    int l,w;
    plate()
    {
        l=0;
        w=0;
        System.out.println("constructor of class plate");
    }
}
class box extends plate
{
    int h;
    box()
    {

        h=0;
        System.out.println("constructor of class box");
    }
}
class wood_box extends box
{
    int t;
    wood_box()
    {

        t=0;
        System.out.println("constructor of class wood_box");
    }
}
public class woodenbox
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        wood_box ob=new wood_box();
    }
}