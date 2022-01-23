class Student{
    int roll;
    void getNumber(int roll){
        this.roll = roll;
    }
    void putNumber(){
        System.out.println("Roll number : "+roll);
    }
}
class Test extends Student{
    int m1, m2;
    void getMarks(int m1, int m2){
        this.m1 = m1;
        this.m2 = m2;
    }
    void putMarks(){
        System.out.println("marks1 : "+m1);
        System.out.println("marks2 : "+m2);
    }
}
interface Sports{
    double sportswt = 6;
    void putwt();
}
class Result extends Test implements Sports{
    double total;
        public void putwt(){
            System.out.println("Sports wt :  "+sportswt);
        }
        void display(){
            getNumber(1906582);
            putNumber();
            getMarks(100, 90);
            putMarks();
            putwt();
            total = m1+m2+sportswt;
            System.out.println("total marks : "+total);
        }
}
public class extra {
    public static void main(String[] args) {
        Result r = new Result();
        r.display();
    }
}