public class three {
    public static void main(String[] args) {
     shape s= new shape();
     s.area(2);
     s.area(10,20);
     s.are(10,5.57f);
    }
}
class shape
{
    int a=10;
    public void area(int r)
    {
        System.out.println("Area of circle is :"+(3.14*r*r));
    }
    public void area(int length, int bre)
    {
        System.out.println("area of triangle is :"+(0.5*length*bre));
    }
    public void are(int x, float y)
    {
        System.out.println("area of rectangle is :"+(x*y));
    }

}