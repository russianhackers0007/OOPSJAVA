package polymorphismConcepts;

class MethodOverloadingChildClass
{
	public void Overload1(String abc)
	{
		System.out.println("My name is "+abc);
	}
	
	public void Overload1(String abc, int a)
	{
		System.out.println("The Age of "+abc+" is "+a);
	}
}


public class MethodOverloading 
{

	public static void main(String[] args)
	{
		MethodOverloadingChildClass mocl=new MethodOverloadingChildClass();
		mocl.Overload1("aditya");
		mocl.Overload1("Aditya", 26);

	}

}
