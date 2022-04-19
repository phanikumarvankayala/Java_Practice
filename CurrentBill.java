import java.util.Scanner;
class CurrentBill
  {
    public static void main(String[] args)
    {
      int u;
      // as the total cost of electricity is will be like rs 555.23
      //so taken as the float value we can take double also for more acuuracy/*
      float Bill,total;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter units");
      u=sc.nextInt();
      // make sure the condtion is correct and frame the formula clearly/*
      
    if(u<=50){
      //any number that is divided by 1/2  it is nothung but multiplying with 0.5
      //1/2=0.5
        Bill=u/2;
      total=Bill+Bill*20/100;
      System.out.println(""+total);
      }
      else if(u<=150){
        //same as the 1/2  0.75 can be represented as 3/4
        Bill=3*u/4;
        total=Bill+Bill*20/100;
      System.out.println("Total electricity bill is:"+total);
      }
      else if(u<=250){
        //1.20 can be expressed as 6/5
        Bill=6*u/5;
        total=Bill+Bill*20/100;
      System.out.println("Total electricity bill is:"+total);
      }
      else if(u>250){
        // as of the above conditioos we can write the 1.5 as 3/2
        Bill=3*u/2;
        total=Bill+Bill*20/100;
      System.out.println("Total electricity bill is:"+total);
      }
        
      
    }
  }