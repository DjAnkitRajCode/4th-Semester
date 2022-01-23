package Sessional;
import java.util.*;

public class upper {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String s =sc.nextLine();
        String[] arr = s.split(" ");
        System.out.println(arr[0].toUpperCase());
    }
}