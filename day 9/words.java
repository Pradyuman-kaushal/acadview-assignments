import java.util.*;
class words {
  public static void main(String[] args) {
    Scanner o=new Scanner(System.in);
    System.out.println("Enter a string");
    String str=o.nextLine();
    int i,c=0;
    for(i=0;i<str.length();i++)
    {
      if(str.charAt(i)==' ')
      {
        c++;
      }
    }
    c++;
    System.out.println("number of words are "+c);
  }
}
