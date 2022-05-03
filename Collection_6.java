import java.util.*;
class Student1
  {
   int roll;
    String name;
    Student1(int roll , String name)
    {
      this.roll=roll;
      this.name=name;
      
    }
  }
class ArrayList3 
  {
    public static void main(String args [])
    {
      Scanner sc =new Scanner(System.in);
      ArrayList <Student1>al = new ArrayList<Student1>();
      System.out.println("Enter the details of Student 1");
      Student1 st1 =new Student1(sc.nextInt(),sc.next());
      System.out.println("Enter the details of Student 2");
      Student1 st2 = new Student1(sc.nextInt(),sc.next());
      al.add(st1);
      al.add(st2);
     
      //this gives the other nunmbers
      System.out.println(al);
      for(Student1 s:al)
        {
          System.out.println(s.roll+"  "+s.name);
        }
    }
  }