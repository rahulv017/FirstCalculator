package Calculator.Calculator;

public class App {
	
	public  int add(int a,int b)
	{
		return a+b;
	}
	
	public int multiply(int a,int b)
	{
		return a*b;
	}
	 public static void main( String[] args )
	    {
		 App app=new App();
	        System.out.println( "Hello To Calculator Program!!" );
	        System.out.println("Let us do simple addition of 2 numbers");
	        System.out.println("Assume two positive integers A=2 and B=4");
	        int a=2;
	        int b=4;
	        System.out.println("Addition will result in "+" "+app.add(a,b) );
	        System.out.println("Let us also do multipilcation of 2 and 4");
	        System.out.println("Multiplication is: "+ app.multiply(a, b));
	        
	        
	    }

}
