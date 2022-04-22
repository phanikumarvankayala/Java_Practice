import java.util.Scanner;
class Ex4
{
  // main method
  public static void  main(String[] args)
  {
    int i,sum=0;
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
      
      sum=sum+a[i];

        }
    System.out.println("the sum of even numbers in the ayyar is :"+sum);
}
}
