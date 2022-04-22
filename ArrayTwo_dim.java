import java.util.Scanner;
class two_dim{
  public static void main(String[] args){
    int i,j,row,col;
   
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the row value");
    row = sc.nextInt();
    System.out.println("Enter the col value");
    col=sc.nextInt();
     int a[][] = new int[row][col];
    System.out.println("Enter the values in array");
    for(i=0;i<row;i++)
      {
        for(j=0;j<col;j++)
          {
            a[i][j]=sc.nextInt();
          }
      }
    System.out.println("the elements in the array are :");
    for(i=0;i<row;i++)
      {
        for(j=0;j<col;j++)
          {
            System.out.print(a[i][j] + "  ");
          }
            System.out.println( );
      }
    
    
  }
}