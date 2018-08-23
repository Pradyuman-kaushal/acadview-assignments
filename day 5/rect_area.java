import java.util.Scanner;
class rectangle{
  public
  int length;
  public int breath;
  public void area()
  {
    System.out.println("Area of rectangle:"+(length*breath));
  }
};
class rect_area {
  public static void main(String[] args) {
    rectangle r=new rectangle();
    Scanner o=new Scanner(System.in);
    System.out.println("Enter value of length and breath of triangle:");
    r.length=o.nextInt();
    r.breath=o.nextInt();
    r.area();
  }
}

