import java.util.*;
class mapping{
    public static void main(String []args)
  {
    int a;
    HashMap hm=new HashMap();
    hm.put("Pradyuman",1);
    hm.put("mayank",2);
    hm.put("minal",3);
    hm.put("Pulkit",4);
    hm.put("nitish",5);
    Set set=hm.entrySet();
    Iterator it=set.iterator();
    System.out.println("elements and keys:");
    while(it.hasNext())
    {
      Map.Entry mr=(Map.Entry)it.next();
     System.out.print(mr.getKey()+" : ");
     System.out.println(mr.getValue());

    }

  }
}