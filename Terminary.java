import java.util.Scanner;
public class Terminary
{
	public static void main(String[] args)
	{ 
	    
	    int a,b,c,big;
		System.out.println("enter 3 numbers ");
		Scanner s = new Scanner(System.in);
	    a = s.nextInt();
	    b = s.nextInt();
	    c = s.nextInt();
	    big = a>b?(a>c?a:c):(b>c?b:c);
	    System.out.print("greatest among the follwing = " +big);
	}  
}
