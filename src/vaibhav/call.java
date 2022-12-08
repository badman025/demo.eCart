package vaibhav;

public class call {
	
	
public static void main(String[] args) {
	Parametrized obj=new Parametrized();
	obj.test();  // non static call need to create object in this class
	   Parametrized.test2(); // static from other class can be import without creating object	
	   
}
}
