import java.util.Scanner;

public class concatinate {
    public static void main(String[] args) {
        System.out.println("Enter first name : ");
        Scanner myObj = new Scanner(System.in);
        String firstName = myObj.nextLine();
        System.out.println("Enter last name : ");
        String lastName = myObj.nextLine();
        System.out.println(lastName+" "+firstName);
    }
}