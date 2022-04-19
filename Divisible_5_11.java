import java.util.Scanner;
class Divisible_5_11
  {
    //main method
    public static void main(String[] args)
    {
      //variable declaration
      int n;
      //scanner calsss used to read the number that should be divisible by 5 & 11
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number");
      n=sc.nextInt();
      // condition for the that shouod be divisible by 5 & 11
      if(n%5==0&&n%11==0)
      {
        // printing the output
        System.out.println("the number is divisible by both 5 & 11");
      }
      else {
        System.out.println("the number is not divisible by 5 & 11");
      }
      
    }
    
  }