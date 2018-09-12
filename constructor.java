public class constructor
{
int age;
String name;

constructor() //Default constructor
{
this.age=6;
this.name="Divya";
}

constructor(String n,int a) //Parametrized constructor
{
this.age=a;
this.name=n;
}


public static void main(String args[]){
//constructor obj=new constructor();
//constructor obj1=new constructor("Ram",89);

constructor obj = new constructor();
constructor obj1 =
		       new constructor("Steve", 56);
System.out.println("Default" +obj.name+ " "+ obj.age+ "parametrzed" +obj1.name+ " " +obj1.age);
}
}
