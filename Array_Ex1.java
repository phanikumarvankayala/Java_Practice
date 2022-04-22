
import java.util.Scanner;
class Ex1{
  //main class
  public static void main(String[] args){
    //declaration of array 
    int a[]=new int[5]; int i;
    //scanner class to read the input from the user
    Scanner sc =new Scanner(System.in);
    System.out.println("enter the array elements");
    //so as to decrese the code for loop is used to take every input
    for(i=0;i<5;i++)
    {
      a[i]=sc.nextInt();
      
    }
    //if we keep this statement inside the for loop it will be repeated to many times
    System.out.println("the array elements are :");
    for(i=0;i<5;i++)
      {
        //printing the all the elements of the array
        System.out.println(a[i]);
      }
  }
}