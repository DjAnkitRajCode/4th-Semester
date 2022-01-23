import java.io.*;
class test {
    public static void main(String args[]) {

        // Initializing A[]
        System.out.println("Enter size of array:");
        int A[] = new int [args.length];
        System.out.println("Enter array elements:");
        for (int i = 0; i < args.length; i++) {
            A[i] = Integer.parseInt(args[i]);
        }

        // Calculating square of each elements of A[]
        int B[] = new int [args.length];
        for (int i = 0; i < args.length; i++) {
            B[i] = A[i] * A[i];
        }

        // Printing A[]
        System.out.println("A");
        for (int i = 0; i < args.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();

        // Printing B[]
        System.out.println("B");
        for (int i = 0; i < args.length; i++) {
            System.out.print(B[i] + " ");
        }
    }
}