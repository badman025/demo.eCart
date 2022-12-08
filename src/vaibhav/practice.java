package vaibhav;

public class practice {

	public void Rtriangle() {
		
		int n=5;
		
		for(int i =1;i<=n;i++) {
			for (int j=i;j<=n;j++) {
				System.out.print("* ");
			}System.out.println();
		}
	}
	public static void main(String[] args) {
		
		practice obj = new practice();
		obj.Rtriangle();
		}
}
