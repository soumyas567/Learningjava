/*

Enhanced for loop is used when you have an array or a collection. The counter variable will iterate through the collection
*/

class Enhancedloopexample {
   public static void main(String args[]){
      int arr[]={1,2,3,4};
      String array[]={"Soumya","Aatiqah","Praveen"};

      for (int num : arr) {
         System.out.println(num);
      }
   for(String s:array)
   {
     //Data type of i is String
     System.out.println(s);
   }
}
}
