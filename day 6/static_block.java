class static_blk{
    static int a;
    static int b;
    int x,y;
    static
    {
      System.out.println("static block called");
      a=0;
      b=0;
    }
    static_blk(int p,int q)
    {
      System.out.println("Parameterized constructor called");
      x=p;
      y=q;
    }

}

class static_block {
  public static void main(String[] args) {
    static_blk w=new static_blk(10,20);

    System.out.println("a: "+static_blk.a+" b: "+static_blk.b);
    System.out.println("x: "+w.x+" y: "+w.y);
  }
}