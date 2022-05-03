abstract class Shape
{
void draw()
  {
    System.out.println("Draw");
  }
}
class Rectangle extends Shape{
  void display()
  {
    System.out.println("this is a rectangle");
  }
}
class Square extends Shape{
  void display()
  {
    System.out.println("This is a Square");
  }
}
class circle extends Shape{
  void display()
  {
    System.out.println("This is circle");
  }
  
}
class Abstraction2
  {
    public static void main(String[] args)
    {
      Shape rect = new Rectangle();
      rect.draw();
      rect.display();
      Shape sqr = new Square();
      sqr.draw();
      sqr.display();
      Shape cir = new circle();
      cir.draw();
      cir.display();
    }
  }