/*Soumya S,
soumyas567@gmail.com
When a variable is declared as static, then a single copy of variable is created and shared among all objects at class level.

After running this progrm change the static key word.Now abc is an instance variable

Line 27 will produce an error

*/

public class staticandinst{
  public   static String abc="First string";
public static void main(String[] args) {
vartest obj1=new vartest();
vartest obj2=new vartest();
vartest obj3=new vartest();
System.out.println(obj1.abc);
System.out.println(obj2.abc);
System.out.println(obj3.abc);

obj2.abc="Changed String";
System.out.println(obj1.abc);
System.out.println(obj2.abc);
System.out.println(obj3.abc);


System.out.println("Directly printing static varialble : \t"+abc);
}
}
