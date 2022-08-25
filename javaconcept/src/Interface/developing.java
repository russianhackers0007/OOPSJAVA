package Interface;

public class developing implements bankingclient,domainclient {

	public static void main(String[] args) 
	{
		//this di object can access all the methods of developing class and all the class that it implements.
		developing di= new developing();
		di.login();
		di.checkbalance();
		di.paycreditbal();
		di.takeloan();
		
		//this i1 object is only responsible to access method of the interface1 interface and not interface2 class and this
		//type of mechanism is also known as Run Time polymorphism.
		bankingclient i1=new developing();
		i1.takeloan();
		i1.checkbalance();
		i1.paycreditbal();
		
		domainclient i3= new developing();
		i3.selenium();
	}

						@Override
						public void takeloan()
						{
							System.out.println("Congrats you got a loan");
						}
						@Override
						public void checkbalance() 
						{
							System.out.println("please check your balance");
						}
						@Override
						public void paycreditbal()
						{
							System.out.println("please collect your credit balance");
						}
						public void login()
						{
							System.out.println("please enter your login details");
						}
						@Override
						public void selenium() 
						{
							System.out.println("Welcome to selenium");
						}
		
	}
