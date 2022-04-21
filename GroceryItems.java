/* JFM1T5_Assignment 2:

   Write a program to store your 10 different expenses done in this month and print the highest price you incurred.
   Prompt the user for the 10 numbers to be input from the terminal.
   Sample Input:
   45.90
   23.56
   123
   23
   90.00
   344
   44
   60.01
   267
   100
   
   Expected Output:

   The highest price you incurred is 344.0

*/

import java.util.Scanner;

public class GroceryItems {

//Define the main method
public static void main(String[] args)
  {
    
//Declare and initialize variables
int i,n; // n is for number grocery items
    // the cost of items may not be an integer always
//scanner class to read the number of items 
Scanner sc =new Scanner(System.in);
    System.out.println("Enter the number of grocery items");
    n=sc.nextInt();
    //intializing the array
     float f[]=new float[n];
    System.out.println("Enter the prices of "+n+" elements ");
    //using for reading the cost of  n items from the user 
    for(i=0;i<n;i++)
      {
        //cost of the item may not be always integer
        f[i]=sc.nextFloat();
      }
//Check the n different expenses price using for loop
float max;
    max=f[0];
    for(i=0;i<n;i++){
//Calculate the highest price in all expenses and check if the expenses is more than new item. If true then return max.
    if(f[i]>max){
      max=f[i];
    }
     
      }
     System.out.println("The highest price incrudded is :"+max);
//Print the result

}
}
