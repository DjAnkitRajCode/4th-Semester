Marketing Package:
package Lab9.packageProgram.Marketing;
import java.util.Scanner;
import Lab9.packageProgram.General.Employee;
public class Sales extends Employee{
public static Scanner sc = new Scanner(System.in);
public static void prnt(String s){
System.out.println(s);
}
public void setId(int s){
this.empid=s;
}
Sales(int id,Double b){
this.empid=id;
this.basic=b;
this.DA=b*0.8;
this.HRA=b*0.5;
};
public double tallowance(){
return this.earnings()*0.05;
};
public static void main(String[] args) {
prnt("Please type in the employee id and basic salary: ");
Sales sales = new Sales(sc.nextInt(),sc.nextDouble());
prnt("Earnings are : "+sales.earnings());
prnt("Travel Allowance is : "+sales.tallowance());
prnt("EMPLOYEE ID IS : "+sales.empid);
}
}