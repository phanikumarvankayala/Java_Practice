import java.util.*;
abstract class Bank
  {
    long Acno;
   long  Panno;
    abstract void rate_of_intrest();
    void display()
    {
      System.out.println( Acno+"  " +Panno);
    }
    
  }
class SBI_Bank extends Bank
  {
    public void rate_of_intrest()
    {
      System.out.println("rate of intrest of SBI is 8%");
      
    }
  }
class Axis_Bank extends Bank
  {
    public void rate_of_intrest()
    {
      System.out.println("rate of intrest of Axis bank is 12%");
    }
  
  }
class Abstraction1
  {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      Bank sbi= new SBI_Bank();
      System.out.println("Enter the account number");
      sbi.Acno= sc.nextLong();
      
      System.out.println("Enter PAN number");
      sbi.Panno=sc.nextLong();
      
      sbi.display();
      sbi.rate_of_intrest();
    }
  }