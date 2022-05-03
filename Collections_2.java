import java.util.*;
class Book
  {
    int Bid;
    String bookname;
    String author;
    Book(int Bid , String bookname , String author)
    {
      this.Bid=Bid;
      this.bookname=bookname;
      this.author=author;
    }
  }
class Array4
  {
    public static void main(String[] args)
    {
      
    
    Scanner sc =new Scanner(System.in);
    ArrayList<Book>al = new ArrayList<Book>();
System.out.println("Enter the details of Book 1");
      System.out.println("Enter book id , book name , book author repectively");
      Book B= new Book(sc.nextInt(),sc.next(),sc.next());
      System.out.println("Enter the details of Book 2");
      System.out.println("Enter book id , book name , book author repectively");
      Book B2 = new Book(sc.nextInt(),sc.next(),sc.next());
      al.add(B);
      al.add(B2);
      for(Book b:al)
        {
          System.out.println(b.Bid+"\n"+b.bookname+"\n"+b.author);
        }
      
  }
  }