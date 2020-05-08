package Calculator.Calculator;

import java.util.Scanner;

public class App {
	
	public  int add(int a,int b)
	{
		return a+b;
	}
	
	public int multiply(int a,int b)
	{
		return a*b;
	}
	
	public int subtraction(int a,int b)
	{
		return a-b;
	}
	
	public int division(int a,int b)
	{
		
			return a/b;
		
		
			
	}
	
	
	 public static void main( String[] args )
	    {
		 Scanner sc=new Scanner(System.in);
		 App app=new App();
	        System.out.println( "Hello To Calculator Program!!" );
	        while(1==1)
	        {
	        	System.out.print("Enter two integers");
	        	int a=sc.nextInt();
	        	int b=sc.nextInt();
	        	  System.out.println("Let us do simple addition of 2 numbers");
	  	      
	  	        System.out.println("Addition will result in "+" "+app.add(a,b) );
	  	        System.out.println("Let us also do multipilcation of 2 numbers");
	  	        System.out.println("Multiplication is: "+ app.multiply(a, b));
	  	      System.out.println("Let us also do subtraction of 2 numbers");
	  	        System.out.println("Subtraction is: "+ app.subtraction(a, b));
	  	      System.out.println("Let us also division of 2 numbers");
	  	        System.out.println("Division is: "+ app.division(a, b));
	  	        System.out.println("Enter -1 to exit");
	  	        int k=sc.nextInt();
	  	        if(k==-1)
	  	        	break;
	        }
	      return ;
	        
	        
	    }

}
