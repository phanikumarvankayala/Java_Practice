import java.util.Scanner;
class Capital
  {
    public static void main(String[] args)
    {
      char ch;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter any key");
      ch=sc.next().charAt(0);
      int var =(int) ch;
      if(var>=97&&var<=122||var>=65&&var<=90)
      {
        System.out.println("Entered key is Alphabet");
      }
      else
      {
        System.out.println("Entered key is not a alphabet");
      }
    }
  }