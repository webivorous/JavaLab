public class Largest
{
	public static void main(String args[])
	{
		int a=20,b=30,c=10;
		if(a>b&&a>c)
		{
			System.out.println("a = "+a+" is the largest number");
		}
		else if(b>a&&b>c)
		{
			System.out.println("b = "+b+" is the largest number");
		}
		else
		{
			System.out.println("c = "+c+" is the largest number");
		}
	}
}