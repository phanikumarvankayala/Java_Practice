/* JFM1T10_Assignment3:

     Create an abstract class Shape with following data member and methods- 
     Create data members for height and width.
     Add getter and setter methods for height and width.
     Create methods for finding area and perimeter.
     Create three subclasses Square, Rectangle and EquilateralTriangle that extends Shape class and define both the methods.
     Write a program that will find the area and perimeter of 3 Shapes and print the details for all. 
     Prompt the user for the  values to be input from the terminal.
 
     Sample Input:
     Enter Width of Rectangle in meters
     10
     Enter Length of Rectangle in meters
     5
     Enter width of Equilateraltriangle
     15
     Enter radius of circle
     60

     Expected Output:
     Rectangle width: 10.0 meters and length: 5.0 meters
     Resulting area: 50.0 square meters
     Resulting perimeter: 30.0 meters 

     EquiTriangle side: 15.0meters
     Resulting area: 97 square meters
     Resulting perimeter: 45.0 meters 

     Circle radius : 60.0meters
     Resulting area: 11310 square meters
     Resulting perimeter: 377 meters  

*/

//importing scanner class
import java.util.Scanner;
//abstract class shape
abstract class Shape {
  //declaring the variables
  int height, width;
  //setter method for height
  void setHeight(int height) {
    //assigning values
    this.height = height;
  }
  //setter method for height
  void setWidth(int width) {
    //assigning values
    this.width = width;
  }
  //getter method fot height
  int getHeight() {
    return height;
  }
  //getter method for width
  int getWidth() {
    return width;
  }
  //area and perimeter methods
  abstract int area();
  abstract int perimeter();
}

//Add Rectangle class that extends Shape class
class Rectangle extends Shape {
  //area method of rectangle
  int area() {
    //returning area
    return (height * width);
  }
  //perimeter method of rectangle
  int perimeter() {
    //returning perimeter
    return (2*(height + width));
  }
}
//Add EquilateralTriangle class that extends Shape class
class EquilateralTriangle extends Shape {
  //area method of equilateral triangle
  int area() {
    double root = 1.732/4;
    //returning area
    return (int)(root*(width * width));
  }
  //perimeter method of equilateral triangle
  int perimeter() {
    //returning perimeter
    return (3*width);
  }
}
//Add Circle class that extends Shape class
class Circle extends Shape {
 
  final double pi = 3.1412;
  //area method of circle
  int area() {
    //returning area
    return (int)(pi * width * width);
  }
  //perimeter method of circle
  int perimeter() {
    //returning perimeter
    return (int)(2*pi*width);
  }
}
class AreaPerimeter {
  //Add the main method here and find Area and Perimeter
  public static void main(String[] args) {
    //Use the scanner class to provide height and width at execution time
    Scanner s= new Scanner(System.in);
    //instantiating rectangle
    Shape rectangle = new Rectangle();
    //initializing width varaible
    System.out.println("Enter Width of Rectangle in meters");
    rectangle.setWidth(s.nextInt());
    //initializing the height of rectangle
    System.out.println("Enter Length of Rectangle in meters");
    rectangle.setHeight(s.nextInt());
    //instantiating triangle
    Shape triangle = new EquilateralTriangle();
    //initializing the side of triangle
    System.out.println("Enter side lenght of EquilateralTriangle");
    triangle.setWidth(s.nextInt());
    //instantiating circle
    Shape circle = new Circle();
    //initializing the radius of circle
    System.out.println("Enter radius of circle");
    circle.setWidth(s.nextInt());
    //printing the rectangle width, area and perimeter
    System.out.println();
    System.out.println("Rectangle width : "+rectangle.width+" meters \nRectangle length : "+rectangle.height+" meters");
    System.out.println("Resulting area: "+rectangle.area()+" square meters");
    System.out.println("Resulting perimeter: "+rectangle.perimeter()+" meters");
    //printing the side, area and perimeter of triangle
    System.out.println("\nEquiTriangle side: "+triangle.width+" meters");
    System.out.println("Resulting area: "+triangle.area()+" square meters");
    System.out.println("Resulting perimeter: "+triangle.perimeter()+" meters\n");
    //printing the radius, area and perimeter of circle
    System.out.println("Circle radius : "+circle.width+" meters");
    System.out.println("Resulting area: "+circle.area()+" square meters");
    System.out.println("Resulting perimeter: "+circle.perimeter()+" meters");
  }
}