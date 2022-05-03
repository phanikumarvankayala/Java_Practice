package Grade;
public class Student_Grade extends Student_percentage
  {
   public  void grade(){
     if(super.percentage>100)
     {
       System.out.println("Check the marks entered");
     }
    else if(super.percentage>=90)
    {
      System.out.println("Scored Grade-A");
    }
else if (super.percentage<90&&super.percentage>=80)
{
  System.out.println("Scored Grade -B");
}
else if(super.percentage<80&&super.percentage>=70)
{
  System.out.println("Scored Grade-C");
}
else if(super.percentage<70&&super.percentage>=55)
{
  System.out.println("Scored Grade-D");
}
else if(super.percentage<55&&super.percentage>=40)
{
  System.out.println("Scored Grade-E");
}
else 
{
  System.out.println("Student Failed");
}
      }
  }