import java.util.Scanner;
class Ex8
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
    int max=a[i];
    System.out.println("the min number in the array is :");
      for(i=0;i<5;i++)
      {
    if(a[i]>max)
    {
      max=a[i];
      
      System.out.println(a[i]);
    }
        
      
      

        }
}
}
