import java.util.Scanner;
class Alphabet_number
  {
    public static void main(String[] args)
    {
      char ch;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter any key");
      ch=sc.next().charAt(0);
      int var=(int) ch;
      //
      if(var>=97&&var<=122||var>=65&&var<=90){
        System.out.println("Entered key is a alphabet");
          }
      else if((var>32&&var<=47)||(var>=58&&var<=64))
      {
        System.out.println("Entered key is a Special charecter");
      }
      else if(var<=91&&var>=96||var<=123&&var>=126)
      {
        System.out.println("Entered key is a Special charecter");
      }
      else {
        System.out.println("Entered key is a number");
    
      }
    }
  }