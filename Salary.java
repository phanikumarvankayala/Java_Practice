import java.util.Scanner;
class Salary
  {
    public static void main(String[] args)
    {
      int bs,hra;
      //as the dearness allowanceis based on the base salary no need to give a new variable for that .
      // bring the scanner class to read the base salary 
      
      Scanner sc=new Scanner(System.in);
      System.out.println("enter your Basi Salary");
      // basi salary--s
      bs=sc.nextInt();
      //for calculating the HRA--housing rent allowance we have to give the input of the house rent
      System.out.println("Enter house rent");
        hra=sc.nextInt();
      if(bs<=10000)
      {
        /// the fromula for the gross salary is changed based upon the salary so that we have written the condition based on the bASE salary
        int gross_salary= bs+bs*80/100+hra*20/100;
        System.out.println("Gross Salary is: "+gross_salary);
      }
      else if(bs<=20000){
        int gross_salary=bs+bs*90/100+hra*25/100;
        System.out.println("Gross Salary is: "+gross_salary);
      }
      else if(bs>=20000){
        int gross_salary=bs+bs*95/100+hra*30/100;
        //printing the solution
        System.out.println("gross Salary is :"+gross_salary);
      }
  
    }
  }