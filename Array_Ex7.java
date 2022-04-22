import java.util.Scanner;
class Ex7
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
    int min=a[0];
    System.out.println("the min number in the array is :");
      for(i=0;i<5;i++)
      {
    if(a[i]<a[0])
    {
      min=a[i];
      
      System.out.println(a[i]);
    }
        
      
      

        }
}
}
