class cce{
   String web;
   cce(String w){
	web = w;
   }

   /* This is the Copy Constructor, it
    * copies the values of one object
    * to the another object (the object
    * that invokes this constructor)
    */
   cce(cce je){
	web = je.web;
   }
   void disp(){
	System.out.println("This is  "+web);
   }

   public static void main(String args[]){
	cce obj1 = new cce(" passed to copy constructor");

	/* Passing the object as an argument to the constructor
	 * This will invoke the copy constructor
	 */
	cce obj2 = new cce(obj1);
	obj1.disp();
	obj2.disp();
   }
}
