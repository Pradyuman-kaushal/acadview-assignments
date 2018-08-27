final class parent{
  public void display()
  {
    System.out.println("we are in class A");
  }
}
class child extends parent{
  public void display()
  {
    System.out.println("we are in class b");
  }
}

class security {
  public static void main(String[] args) {
    parent c=new child();
    c.display();
    System.out.println("we are in main");
  }
}