import java.util.Scanner;
public class six {
        public static void main(String[] args) {

            while(true) {
                System.out.println("1. Area of Circle\n2. Area of Square\n3. Area of Triangle\n4. Exit");
                Scanner myObj = new Scanner(System.in);
                System.out.println("Enter your choice : ");
                int n = myObj.nextInt();
                switch(n)
                {
                    case 1: System.out.println("Enter the radius : ");
                        int x = myObj.nextInt();
                        System.out.println("Area of the Circle is: "+3.14*x*x);
                        break;
                    case 2:
                        System.out.println("Enter the side: ");
                        int y= myObj.nextInt();
                        System.out.println("Area of the Square is: "+y*y);
                        break;
                    case 3:
                        System.out.println("Enter the base and height: ");
                        int b=myObj.nextInt();
                        int h= myObj.nextInt();
                        System.out.println("Area of the Triangle is : "+0.5*b*h);
                        break;
                    case 4:
                        System.out.println("Exiting...");
                        System.exit(0);
                    default:
                        System.out.println("Wrong Choice.");
                        break;
                }

            }
        }
    }
