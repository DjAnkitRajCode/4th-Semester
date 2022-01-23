public class Q3 {
    public static void main(String[] args) {
        A obj1= new B();//linking at runtime
        obj1.show();//show() will be decided at runtime
        obj1= new c();
        obj1.show();
    }

}
class A
{
    public void show()
    {
        System.out.println("in A");
    }
}
class B extends A
{
    public void show()
    {
        System.out.println("In B");
    }
}
class c extends A
{
    public void show()
    {
        System.out.println("In C");
    }
}
