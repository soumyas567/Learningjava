/*
Demo for Bitwise Operator:
&  Bitwise AND
|  Bitwise OR
^  1 if bits are equal else 0
*/

public class BitwiseOperatorDemo {
  public static void main(String args[]) {

     int num1 = 11;  /* 11 = 00001011 */
     int num2 = 22;  /* 22 = 00010110 */
     int result = 0;

     result = num1 & num2;
     System.out.println("num1 & num2: "+result);// result is 10 in binary 2 in decimal

     result = num1 | num2;
     System.out.println("num1 | num2: "+result);//result is 11111 in binary 1+2+4+8+16=31 in decimal

     result = num1 ^ num2;
     System.out.println("num1 ^ num2: "+result); //00011101=29 in decimal
     result = ~num1;
     System.out.println("~num1: "+result);

     result = num1 << 2;
     System.out.println("num1 << 2: "+result); result = num1 >> 2;
     System.out.println("num1 >> 2: "+result);
  }
}
