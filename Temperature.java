/* JFM1T5_Assignment3:

   Write a program to store the temperature of your city for last 7 days and print the lowest temperature of the week.
   Prompt the user input from the terminal.
   
   Sample Input:
   Enter number of days 
   3
   Enter the temperature of Day :1
   88
   Enter the temperature of Day :2
   34
   Enter the temperature of Day :3
   0 
   
   Expected Output:
   The lowest temperature of the week 3 is 0.0 celsius

*/
import java.util.Scanner;
class Temperature{
  //main class
  public static void main(String[] args){
    //intializing the variables for no.of days(d) and length of the array(i)
    int d,i;
    //scanner class to read the number of days and temperatures
   
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of days : ");
    d=sc.nextInt(); //no of days.
    //array was considered as the float because the temperatures may not be a intger
    //intializing the array   d- represents the number of days
    float temp[]=new float[d];
    //reading the temperature input from the user
    for(i=0;i<d;i++){
      
      System.out.println("Enter the temperature of day : "+(i+1));
      temp[i]=sc.nextFloat();
      }
    float min;
    //calculating the min temperature from the given data
           min=temp[0];
      for(i=0;i<d;i++)
        {
          if(temp[i]<min)
          {
            min = temp[i];   
          }
    }
    //printing the minimum temp 
     System.out.println("The lowest temperature of the week is "+min+" degree celsius");
}
}