package inheritance;

class parentclass1
{
	private String abc="Aditya";
	public void method1()
	{
		System.out.println("Hello friends my name is "+abc);
	}
}

class parentclass2 extends parentclass1
{
	public String dac="Apoorva";
	public String Surname="Nadkarni";
	public void method2()
	{
		System.out.println("my name is "+dac);
	}
	public void method3()
	{
		System.out.println("my surname is "+Surname);
	}
}

public class MultiLevelInheritance extends parentclass2
{

	public static void main(String[] args)
	{
		parentclass2 pc2= new parentclass2();
		pc2.method1();
		pc2.method2();
		pc2.method3();
		
		
		
	}

}
