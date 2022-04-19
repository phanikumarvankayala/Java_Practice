import java.util.Scanner;
class Alphabet
  {
    public static void main(String[] args)
    {
      char a;
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the Alphabet");
      a=sc.next().charAt(0);
      int v= (int) a;
      if(a>=97&&a<=122)
      {
        System.out.println("The alphabet is Lower case");
        }
      
    else 
    {
      System.out.println("The alphabet is Upper case");
    }
    }
  }