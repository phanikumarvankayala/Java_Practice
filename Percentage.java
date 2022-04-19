import java.util.Scanner;
class Percentage
  {
    //main method
    public static void main(String[] args)
    {
      //variablke declaration
      int physics,chemistry,biology,maths,computer,totalmarks;
      // percentage can be either integer or decimal so representing the precentage as float is suggestable
      float p;
      // bring the scanner class tot read the marks 
      
      Scanner sc=new Scanner(System.in);
      // marks input.
      System.out.println("Enter marks of physics");
      physics=sc.nextInt();
      System.out.println("Enter the marks of chemistry");
      chemistry=sc.nextInt();
      System.out.println("Enter the marks of biology");
      biology=sc.nextInt();
      System.out.println("Enter the marks of maths");
      maths=sc.nextInt();
      System.out.println("Enter the marks of computer");
      computer=sc.nextInt();
      //for calculating the percentage of the givent marks we have to give the input that for how many marks the exams are conducted 
      totalmarks=500;
      p=(physics+chemistry+biology+maths+computer)*100/500;
      //rounding off the percentage from float to int
      int percent=(int) p;
      // writing the conditions for giving the grade for the respective percentage
      if(p>=90)
      {
        System.out.println("you got "+percent+"% grade:A");
                }    
      else if(p>=80){
          System.out.println("you got "+percent+"% grade:B");
        }
          else if(p>=70){          
            System.out.println("you got "+percent+"% grade:C");
            }
            else if(p>=60){
              System.out.println("you got "+percent+"% grade:D");
                          }
      else if(p>=40){
        System.out.println("you got "+percent+"% grade:E");
        }
      else if(p<=40)
      {
        System.out.println("you got "+percent+"% grade:F");
      }
        
      }
    }
  