package test.test;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 

{
	public static int a=200;
	public void printOddNumbers(int n)
	{
		if(n <=200)
		{
			if(n%2==0)
			{
				System.out.println(n);
				n--;
				
			}
			printOddNumbers(n);
			
		}
	}
    public static void main( String[] args )
    {
    	App app = new App();
        System.out.println( "Hello World!" );
        Array[] ar = new Array[10];
        
        try
        {
        	System.out.println(ar[11]);
        }
        catch(Exception e)
        {
        	e.getMessage();
        }
        finally
        {
        	System.gc();
        }
        String st = "hello";
        System.out.println(st.substring(st.indexOf('l'), 3));
        System.out.println(st.charAt(2));
        app.printOddNumbers(a);
        
    }
}
