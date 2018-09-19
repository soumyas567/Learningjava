/* Encapsulation Example
Encapsulation simply means binding object state(fields) and behaviour(methods) together.
If you are creating class, you are doing encapsulation.
*/
class Employeecount
{
   private int numOfEmployees = 0;
   public void setNoOfEmployees (int count)
   {
       numOfEmployees = count;
   }
   public double getNoOfEmployees ()
   {
       return numOfEmployees;
   }
}

public class EncapsulationExample
{
   public static void main(String args[])
   {
      Employeecount obj = new Employeecount();
      obj.setNoOfEmployees(10);
      System.out.println("No Of Employees: "+(int)obj.getNoOfEmployees());
    }
}
