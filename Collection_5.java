import java.util.*;
class Employee
  {
    int eid;
    String name;
    String designation;
    long Salary;
    Employee(int eid , String name, String designation, long Salary)
    {
      this.eid=eid;
      this.name=name;
      this.designation=designation;
      this.Salary=Salary;
    }
  }
class Arraylist5
  {
    public static void main (String [] args)
    {
      Scanner sc = new Scanner(System.in);
      ArrayList <Employee> al = new ArrayList<Employee>();
      System.out.println("Enter the details of the Employee 1");
      System.out.println("Enter Employee id , Employee name , Employee designation , Employee Salary");
      Employee e =new Employee(sc.nextInt(),sc.next(),sc.next(),sc.nextLong());
       System.out.println("Enter the details of the Employee 2");
      System.out.println("Enter Employee id , Employee name , Employee designation , Employee Salary");
      Employee e2 = new Employee(sc.nextInt(),sc.next(),sc.next(),sc.nextLong());
      al.add(e);
      al.add(e2);
    
     for(Employee d:al)
       {   System.out.println("");
           System.out.println("The details of the Employee :");
             System.out.println("");
         System.out.println(d.eid+"\n"+d.name+"\n"+d.designation+"\n"+d.Salary);
       }
      
    }
  }