import java.util.Scanner;
class complex{
  public 
  int real;
  int imag;
  void display()
  {
    if(imag >0)
    System.out.println("Complex no is: "+real+"+"+imag+"i");
    else
    System.out.println("Complex no is: "+real+imag+"i");
  }
};
class complex_no {
  public static void main(String[] args) {
    complex c=new complex();
    Scanner o=new Scanner(System.in);
    System.out.println("Enter real part of complex no:");
    c.real=o.nextInt();
    System.out.println("Enter imagenary part of complex no:");
    c.imag=o.nextInt();
    c.display();
  }
}

