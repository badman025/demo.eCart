package loop;


public class Package {

	 public void triangle()
	 
		 {
				
				int n=5;
				
				for (int i=1;i<=n;i++) {
					for (int j=1;j<=i;j++) {
						System.out.print("*");
					}System.out.println();
				}
			
	 }
	  public void Reversetriangle() {
			
			int n=5;  
			
			for(int i = n; i>=1; i--) {
				for (int j = 1;j<=i;j++) {
				System.out.print("*");	
				}
				System.out.println();
			}
				
		}
public static void main(String[]args) {
	Package obj= new Package();
	obj.triangle();
	obj.Reversetriangle();
	obj.triangle();
	obj.Reversetriangle();
}
}