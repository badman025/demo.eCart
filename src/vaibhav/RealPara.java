package vaibhav;

public class RealPara {

	public void add(int a , int b, int c) { // Parameterized 
		
		System.out.println(a+b+c);
		
	}
      public void objadd(String value) {
    	  System.out.println(value);
      }
      public static void main(String[] args) {
		
    	  RealPara obj = new RealPara();
    	  obj.add( 10 , 20, 30);
    	  obj.add(50,50,50);
    	  obj.objadd("hi im chitti 123");
	}
}
;