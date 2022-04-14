package animal_prog;

public interface Human extends Monkey {

	
	public void eat();
	
	public default void sleep()
	{
		System.out.println("this is default method from human interface with definition");
	}
}
