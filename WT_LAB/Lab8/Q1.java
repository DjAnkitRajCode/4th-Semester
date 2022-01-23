import java.util.Scanner;

    abstract class Student {
        abstract void course(int rollNumber, int regNumber);
    }

    class Kiitian extends Student {
        void course(int roll, int registration) {
            System.out.println("Your roll number is "+roll+" and your Registration Number is "+ registration+".");
        }
    }

    class College {
        public static void main(String[] args) {
            Student obj = new Kiitian();
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your Roll Number: ");
            int rollNumber = sc.nextInt();
            System.out.print("Enter your Registration Number: ");
            int regNumber = sc.nextInt();
            obj.course(rollNumber, regNumber);
        }
    }