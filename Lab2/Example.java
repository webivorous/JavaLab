public class Example
{
	int a;
	void setA(int a)
	{
		this.a=a;
		System.out.println("Value of a is set");
	}

	int printA()
	{
		System.out.println("Value of a is returned");
		return this.a;
	}
}