package Lab10;

import java.util.Scanner;

class NegativeNumberException extends Exception{

    NegativeNumberException(String s) {
        super(s);
    }
}

public class userMadeException {
    static Scanner sc = new Scanner(System.in);

    static void ProcessInput(int n) throws NegativeNumberException {
        if(n<0){
            throw new NegativeNumberException("Negative number !");
        }else{
            System.out.println((double)n);
        }
    }
    public static void main(String[] args) {
        System.out.println("Type in number : ");
        try{
            ProcessInput(sc.nextInt());
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
