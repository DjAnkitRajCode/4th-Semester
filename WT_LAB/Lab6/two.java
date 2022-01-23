public class two {
    public static void main(String[] args) {
        sub m = new sub();
        m.subtract(2);
        m.subtract(2,3);
        m.subtract(2,3,4);
    }


}
class sub
{
  int a=10;
  public void subtract (int x)
    {
        System.out.println("Value is :"+(a-x));
    }
    public void subtract(int x, int y)
    {
        System.out.println("Value is :"+(a-x-y));
    }
    public void subtract(int x, int y,int z)
    {
        System.out.println("Value is :"+(a-x-z));
    }

}