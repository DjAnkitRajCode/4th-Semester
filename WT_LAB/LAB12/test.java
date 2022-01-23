import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows");
        int row= sc.nextInt();
        System.out.println("Enter  Col :");
        int col = sc.nextInt();
        int [][] num = new int [row][col];
        int [][]  transpose= new int[col][row];
        readMatrixElement(num,row,col);
        transposeMatrix(num,transpose,row,col);
        printMatrix(transpose,col,row);
    }
    public static  void readMatrixElement(int [][]num,int row,int col)
    {
         Scanner sc = new Scanner(System.in);
         for(int i=0;i<row;i++)
         {
             for(int j=0;j<col;j++)
             {
                 num[i][j]=sc.nextInt();
             }
         }
    }
    public static void printMatrix(int [][]matrix,int row,int col)
    {
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.println(matrix[i][j]+" ");
            }
           
        }
    }
    public static void transposeMatrix(int [][]num,int [][]transpose,int row,int col)
    {
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                transpose[j][i]=num[i][j];
            }
        }
    }


}