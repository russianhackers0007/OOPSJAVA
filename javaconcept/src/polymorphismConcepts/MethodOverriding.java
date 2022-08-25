package polymorphismConcepts;

class Override1
{
	public void disp(int num)
	{
		System.out.println("my Age is :"+num );
	}
}

class override2 extends Override1
{
	public void disp(String name,int num)
	{
		System.out.println("The Age of "+name+" is "+num);
	}
}

public class MethodOverriding
{

	public static void main(String[] args)
	{
		override2 o = new override2();
		o.disp(26);
		o.disp("Aditya",26);

	}

}
