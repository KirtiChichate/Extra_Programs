package telecom_Prog;

public class Methodoverloading {

	public static void main(String[] args) {

		//call nonstatic method overloading methods
		
		Methodoverloading obj= new Methodoverloading();
		obj.Telephone();
		
		obj.Telephone(7, 'A');
		Methodoverloading.Telephone(2, 5);		

	}

	
	public void Telephone()
			{
		System.out.println("This is a zero parameter method ");
			}
	public void Telephone(int a, char b)
	{
		int sum=a+b;
		System.out.println("This is a two parameter method "+sum);
	}
	public static void Telephone(int a, int b)
	{
		System.out.println("This is a static method with two parameter but different datatype");
	}
}
