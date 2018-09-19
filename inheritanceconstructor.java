/*When a constructor of child class is created automatically, paret constructor
will also be called

*/

class parent{
parent()
{System.out.println("Parent");}

}
class child extends parent{
  child()
  {
    System.out.println("Child");}
}
  class inheritanceconstructor
{
public static void main(String args[])
{
child ob=new child();

}
}
