package encapsulationlearning;

class encapsulationtesting
{
			private String name1="";
			
			public void setname(String displayname )
			{
				name1=displayname;
			}
			
			public String getname()
			{
				 return name1;
			}
}

class MainFile
{
			public static void main(String[] args)
			{
				encapsulationtesting et= new encapsulationtesting();
				et.setname("Aditya");
				System.out.println("Name of the Best Employee is :" +et.getname());
			}
}
