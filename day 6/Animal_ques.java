class animal
{
  public String breed,color;
  public void speak()
  {
    System.out.println("Animals have their own language to speak");
  }
}
  class dog extends animal
  {
    public void speak()
    {
      System.out.println("Dogs bark and Dogs have a language that allows them to communicate their emotional state and their intentions to others around them");
    }
  }
  class cat extends animal
  {
    public void speak()
    {
      System.out.println("Cats rarely vocalize with other cats (other than to hiss and growl at trespassers)");
    }
  }

class Animal_ques {
  public static void main(String[] args) {
    animal a=new animal();
    a.speak();
     a=new dog();
     a.speak();
     a=new cat();
     a.speak();
    
    
  }
}