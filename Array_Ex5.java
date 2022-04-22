import java.util.Scanner;
class Ex5
{
  // main method
  public static void  main(String[] args)
  {
    int i;
    int a[]=new int[5];
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the array values");
    for(i=0;i<5;i++)
      {
        a[i]=sc.nextInt();
        }
    System.out.println("the number divisible by 5 in the array are :");
      for(i=0;i<5;i++)
      {
    if(a[i]%5==0)
      
      System.out.println(a[i]);

        }
}
}
