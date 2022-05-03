import java.util.*;
class ArrayList1
{
  public static void main(String[] args)
  {
    ArrayList al = new ArrayList();
    //adding the elements to the array list
    al.add("Phani");
    al.add(95420);
    al.add("WestGodavari");
    System.out.println(al);
    //checking the a word present in the list
    if(al.contains("Phani"))
    {
      System.out.println("Name found");
    }
    else{
      System.out.println("Name not found");
    }

    al.add("orange");
    al.add("watermelon");
    al.add("Apple");
    al.remove(4);
    System.out.println(al);
    //for each loop
    for(Object obj:al)
      {
        System.out.println(obj);
      }
    //using of iterator class
    Iterator itr = new Iterator();
    while(itr.hasNext())
      {
        System.out.println(itr.next());
      }
    //storing only the string type of data
    ArrayList<String> al1=new ArrayList<String>(); //optional to write the string at the constructor
    
  }
  
}