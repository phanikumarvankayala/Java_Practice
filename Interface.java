import java.util.*;
interface Bank1
  {
    long acno = 234210;
    void rate_of_intrest();
    
  }
class SBI_Bank1 implements Bank1
{
  public void rate_of_intrest()
  {
    System.out.println("the rate of intrest is 10%");
  }
}
class Axis_Bank1 implements Bank1
{
void rate_of_intrest()
  {
    System.out.println("The rate of intrest of Axis bank is 12%");
  }
}
class Interface
{
  public void  main (String args[])
  {
    SBI_Bank1 sbi=new SBI_Bank1();
    sbi.acno();
    sbi.rate_of_intrest();
    Axis_Bank1 ax = new Axis_Bank1();
    ax.rate_of_intrest();
    
  }
}