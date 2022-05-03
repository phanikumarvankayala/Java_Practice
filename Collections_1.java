import java.util.*;
class Student
  {
   int roll;
    String name;
    Student(int roll , String name)
    {
      this.roll=roll;
      this.name=name;
      
    }
  }
class Array2 
  {
    public static void main(String args [])
    {
      ArrayList <Student>al = new ArrayList<Student>();
      Student st1 =new Student(3,"Phani");
      Student st2 = new Student(26,"Krishna");
      al.add(st1);
      al.add(st2);
      //anonmus object
      al.add(new Student(19,"jahnu"));
      //this gives the other nunmbers
      System.out.println(al);
      for(Student s:al)
        {
          System.out.println(s.roll+"  "+s.name);
        }
    }
  }