import java.util.*;
import Grade.*;

class Perfomance
  {//main method 
    public static void main(String[] args)
    {
    Scanner sc =new Scanner(System.in);
   Student_attendence s1 = new  Student_attendence();
    System.out.println("Enter the marks of  3 student");
int a = sc.nextInt();
int b=sc.nextInt();
int c= sc.nextInt();
s1.total_marks(a,b,c);
s1.student_percentage();
s1.grade();
s1.attendence();
      

  }
  }