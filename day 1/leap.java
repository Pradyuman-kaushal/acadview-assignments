import java.util.Scanner;
class leap {
  public static void main(String[] args) {
    int a,n;
    System.out.println("Enter year:");
    Scanner o=new Scanner(System.in);
    n=o.nextInt();
    if(n%4==0)
    {
      if(n%100==0)
      {
        if(n%400==0)
        {
          System.out.println("It is a leap year");
        }
        else
        {
          System.out.println("It is not a leap year");
        }
      }
      else
        {
          System.out.println("It is a leap year");
        }
    }
    else
        {
          System.out.println("It is not a leap year");
        }
  }
}