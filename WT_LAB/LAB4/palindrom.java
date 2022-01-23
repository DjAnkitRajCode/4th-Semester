public class palindrom {
    public static void main(String args[]) {
      int n = 123321, r = 0, temp = 0;
  
      int num = n;
      while(n!=0){
          r = n%10;
          temp = (temp *10) + r;
          n = n/10;
      }
      if(temp == num){
          System.out.println(num + " is a palindrome number");
      }
      else{
          System.out.println(num + " is not a palindrome number");
      }
    }  
  }