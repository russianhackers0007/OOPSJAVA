package javaPgms;

public class forlooparray 
{

	public static void main(String[] args) 
	{
		
		int[] arrayvalues= {43,324,565,575,756};
		
		//step 1 of using for loop
//		for (int index=0; index<5;index++)
//		{
//			System.out.println(arrayvalues[index]);
//		}
		
		//another way of using for loop is
		for(int element:arrayvalues)
		{
			System.out.println(element);
		}

	}

}
