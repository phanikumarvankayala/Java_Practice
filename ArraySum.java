/*  
    JFM1T5_Assignment 1:
    Write a program to store 10 numbers in an array and display the sum of all the elements.
    Prompt the user for the 10 numbers to be input from the terminal.
    Sample Input:
    Enter the 10  elements:
    1
    2
    3
    4
    5
    6
    7
    8
    9
    10
    Expected Output:
    Sum of array elements is : 55

*/
import java.util.Scanner;
public class ArraySum {

//Define the main method
public static void main(String[] args){
  int n;
  int sum=0; // for printing the sum of all the elements
  int i=0;// i is for index number
//Take input from user
Scanner sc=new Scanner(System.in);
  System.out.println("Enter the length of the array");
    n=sc.nextInt();
  //Declare the variables and initialize
int a[]= new int[n];
  System.out.println("Enter the "+n+" elements");
//Check user input values using for loop and add all values
  // as the array elements were allocated by index number also index starts with 0 it will be ended by 9 for 10 elements
 for(i=0;i<n;i++)
 {
  a[i]=sc.nextInt(); 
 }
  // this loop is to performe the addition operation
  for(i=0;i<n;i++)
    {
      sum=sum+a[i];
    }
  System.out.println("Sum of array elements is : " +sum);
//Print the result

}
}
