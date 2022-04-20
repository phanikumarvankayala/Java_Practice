/*  JFM1T2_Assignment5:

    Write a program to print the sum of two numbers without using + operator.
    Prompt the user input from the terminal.
    
    Sample Input:
    Enter first number: git 
    22
    Enter second number: 
    50
    
    Expected Output:
    The sum of two numbers is: 72
*/

//import statements for java program to read inputs using Scanner class
import java.util.Scanner;

public class SumWithoutPlus {
  //main method
  public static void main(String[] args)
  {
    int a,b;
    /*
  Use the scanner class to provide input at execution time using scanner object
  Scanner sc=new Scanner(System.in);
*/

    Scanner sc=new Scanner(System.in);
    /*
  Take input from user
  System.out.println("Enter first number: ");
  int a=sc.nextInt();
*/
    System.out.println("Enter fist number");
    a=sc.nextInt();
    System.out.println("Enter Second number");
    b=sc.nextInt();
    //check if the second number is greater than zero then increase first number and decrease second number
    while(b!=0)
      {
      int carry= a&b;
    a = a^b;
    b= carry<<1;
        }
    //check if the second number is less than zero then decrease first number and increase second number
    System.out.println("the sum of two numbers is :"+a);
  }



//print result

}