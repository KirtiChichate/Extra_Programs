package penProgram;

public abstract class Pen {

	public abstract void write();
	public abstract void refill();

	 int a=10;
	
	public void ink()
	{
		System.out.println("this is complete method from abstract class pen");
	}
	
	public static void colour()
	{
		System.out.println("this is static complete method from abstract class pen ");
	}
}
