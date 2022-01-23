public class Q2 {

    public static void main(String[] args) {
        try {
            int a;
            int b = 0;
            a = 1 / b;
        } catch (Exception c) {
            System.out.println("Generic exception Catch");
        } 
        System.out.println("After try/catch Blocks");
    }

}