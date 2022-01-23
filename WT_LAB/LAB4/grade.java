public class grade {
    public static void main(String args[]){
        int a=50;
        if(a>=90){
            System.out.println("O Grade");
        }
        else if(a>=80 && a<90){
            System.out.println("E Grade");
        }
        else if(a>=70 && a<80){
            System.out.println("A Grade");
        }
        else if(a>=60 && a<70){
            System.out.println("B Grade");
        }
        else if(a>=50 && a<60){
            System.out.println("C Grade");
        }
        else{
            System.out.println("Fail");
        }
    }
}
