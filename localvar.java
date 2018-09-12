//Example for local localvariable; Both static and local varibles have same names. See how they are printed



public class localvar{
  public static String mystring="staticvariable";
  public void myfunc(){
    String mystring="localvariable";
    System.out.println("Inside the function\t" +mystring);
  }
public static void main(String[] args) {
  System.out.println("Inside main\t"+mystring);
  localvar obj=new localvar();
  obj.myfunc();
}
}
