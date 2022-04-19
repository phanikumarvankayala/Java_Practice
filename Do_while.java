import java.util.Scanner;
class Do_while
  {
    public static void main(String[] args)
    {
      int i=0,t;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number");
      t=sc.nextInt();
      do{
        System.out.println(i);
        i++;
      }
        while(i<t);
   }
  }