class Calc
{
	public static void main(String args[])
	{
		char ch=args[1].charAt(0);
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[2]);
		if(ch=='+')
			System.out.println("Sum of "+a+" and "+b+" = "+(a+b));
		else if(ch=='-')
			System.out.println("Difference of "+a+" and "+b+" = "+(a-b));
		else if(ch=='x')
			System.out.println("Product of "+a+" and "+b+" = "+(a*b));
		else if(ch=='/')
			System.out.println("Quotient of "+a+"/"+b+" = "+(a/b));
		else
			System.out.println("Invalid Input");
	}
}