package vaibhav;

public class Parametrized {

	int a=10;            // only print in this class
	static int b=20;
	
  public void test() {
	  System.out.println("non static");
  }
  
  public static void test2() {
	  System.out.println("static");
  }
  
  public static void main(String[] args) {
	
	 Parametrized.test2(); //classname.method name // no need to create object for static , 
	                                               //method directly can call for function.
	 System.out.println(Parametrized.b);
	
	 Parametrized obj=new Parametrized(); // object creation for non static method
	 obj.test();
	 System.out.println(obj.a);
	 
}
}