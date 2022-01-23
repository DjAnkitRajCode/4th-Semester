package Lab10;

import java.util.Scanner;

public class illustrateTryCatchFinally {
    static Scanner sc = new Scanner(System.in);
public static void main(String[] args) {
    System.out.println("Input two number for dividing : ");
    try{
        System.out.printf("Ans is  : %d\n\n", sc.nextInt()/sc.nextInt());
    }catch(ArithmeticException ae){
        System.out.println("Cannot divide with zero\n");
    }finally{
        System.out.println("Well, Program ended");
    }
}    
}
