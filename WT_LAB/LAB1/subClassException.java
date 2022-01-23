package Lab10;

class Parent{
    public void notDivideByZero() throws Exception{
        System.out.println("Thrown by parent");
    }
}

class Child extends Parent{
    public void notDivideByZero() throws Exception{
        System.out.println("Thrown by child");
        super.notDivideByZero();
    }
}

public class subClassException extends Child {
    public static void main(String[] args) {
        Child child = new Child();
        try{
            child.notDivideByZero();
        }catch(Exception e){

        }
    }
}
