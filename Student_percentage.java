package Grade;
public  class Student_percentage extends Student_marks
   {
     public  double percentage;
     //total marks 300 is in divisor and 100 is multiplied to it to calculate the percentage so dividing the whole marks with 3 is enough
     public void student_percentage()
     {
      percentage = (super.t)/3;
       System.out.println("the percentage obtained by the student is : "+percentage+"%");
     }
   }