/*
If you have only Parametrized constructor,
con ob1=new con();
It gives compilation error, because that will invoke a Default constructor
which doesnot exist. If you have a(ny) constructor defined then Default constructor
will not be evoked.
*/
class con
{
  int number;
  String name;
public con()
  {
  this.number=1;
  this.name="Default";
  }

public con(int n,String a)
{
this.number=n;
this.name=a;
}
}
class conex{
  public static void main(String[] args) {
    con ob1=new con();
    System.out.println(ob1.number+"\t"+ob1.name);
    con ob=new con(90,"param");
    System.out.println(ob.number+"\t"+ob.name);
  }
}
