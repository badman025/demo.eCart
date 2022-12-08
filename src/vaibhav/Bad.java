package vaibhav;

public class Bad {
public  void triangle() {   //non static
	
 	int n=5;
 	
	for (int i = 1;i <=n; i++) {
		
		for (int j = 1; j<=i; j++) {
			System.out.print("*");	
		} System.out.println(); 
	}   

}
 public void reversetriangle() {
	 int n=5;
	 {
		 for (int i=1;i<=n;i++) {
			 for(int j=i;j<=n;j++) {
				 System.out.print("*");
			 }System.out.println();
		 }
	 }
	 
	 
}
 public static void main(String[] args) {
	Bad obj = new Bad();  //object creation
	obj.triangle();       
	obj.reversetriangle();
	obj.triangle();       
	obj.reversetriangle();
}
}
