abstract class animal
{
String color,breed,name;
public void speak()
{
System.out.println("animals speaks their own language");
}
abstract void eat();
}
class cat extends animal
{

public void eat()
{
System.out.println("cat eats rats");
}
}

class abstract_cls {
public static void main(String[] args) {
animal a= new cat();
a.speak();
a.eat();

}
}
