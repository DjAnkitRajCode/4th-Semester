import java.util.Scanner;

public class day_switch_case {
    public static void main(String[] args) {
        System.out.println("Enter the day num");
        Scanner scn = new Scanner(System.in);
        int day=scn.nextInt();
        day = day %7;
        switch(day)
        {
            case 1:
                System.out.println("Friday");
                break;
            case 2:
                System.out.println("Saturday");
                break;
            case 3:
                System.out.println("Sunday");
                break;
            case 4:
                System.out.println("Monday");
                break;
            case 5:
                System.out.println("Tuesday");
                break;
            case 6:
                System.out.println("Wednesday");
                break;
            case 7:
                System.out.println("Thursday");
                break;
            default:
                System.out.println("Wrond day No.");
                break;

        }
    }
}