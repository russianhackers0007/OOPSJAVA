package inheritance;

class parentclass
{
	private String abc="Aditya";
	public void method1()
	{
		System.out.println("Hello friends my name is "+abc);
	}
}

public class SingleLevelInheritance extends parentclass
{

	public static void main(String[] args)
	{
		parentclass pc= new parentclass();
		pc.method1();

	}

}
