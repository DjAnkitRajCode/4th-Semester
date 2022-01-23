package Lab10;

import java.util.Scanner;

public class OutOfBond {
    static Scanner sc = new Scanner(System.in); 
    public static void main(String[] args) {
        int[] arr= {10,12,14,15,16} ;
        System.out.println("Type in index : ");
        int index = sc.nextInt();
        try{
            System.out.printf("At index %d : %d ",index,arr[index]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index too large !");
        };

    }
}
