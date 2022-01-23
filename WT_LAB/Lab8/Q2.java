interface motor{
    final static int capacity=25;
    public void run(int t);
    public void consume(int u);
}
class Washing_Machine implements motor{
    public void run(int t){
        System.out.println("The machine ran for only " + t + " hours.");
    }
    public void consume(int u){
        System.out.println("The machine has consumed " + u + " units of electricity.");
    }
}
public class Q2{
    public static void main(String[] args){
        Washing_Machine m1 = new Washing_Machine();
        System.out.println(m1.capacity);
        m1.run(4);
        m1.consume(200);
    }
}
