General Package :
package Lab9.packageProgram.General;
public class Employee {
public double basic,DA,HRA;
protected int empid;
private String ename;
public Employee(){
basic=DA=HRA=empid=0;
this.ename="";
};
public Employee(double b){
basic=b;
DA=b*0.8;
HRA=b*0.5;
};
public double earnings(){
return basic+DA+HRA;
}