/* JFM1T9_Assignment3:
     Create a base class Teacher and a sub class ComputerTeacher.
     class ComputerTeacher extends the designation and collegename properties and work() method from base Teacher class,
     you need not declare these properties and method in ComputerTeacher sub class .
     Try accessing these properties using child class object in Main method.
  
     Sample Output:
     Designation       CollegeName
     ComputerTeacher      IIT
*/
class Teacher {
     //initializing variables
     String designation ="Computer Teacher";
     String collegename = "IIT";
     public void disp() {
          System.out.print("Desigantion--> "+designation+"\nCollege Name-->    "+collegename);
     }
}

class ComputerTeacher extends Teacher {
     //main class
     public static void main(String[] args) {
          //Creating a new object
          ComputerTeacher obj = new ComputerTeacher();
          obj.disp();
     }
}

