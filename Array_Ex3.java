import java.util.Scanner;
class Ex3
{
  // main method
  public static void  main(String[] args)
  {
    int i,count=0;
    int a[]=new int[5];
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the array values");
    for(i=0;i<5;i++)
      {
        a[i]=sc.nextInt();
        }
  
      for(i=0;i<5;i++)
      {
    if(a[i]%2==0)
      
      count++;

        }
    System.out.println("the number of even numbers in the arraya is :"+count);
}
}
