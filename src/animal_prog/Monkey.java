package animal_prog;

public interface Monkey {

	public default void bite()
	{
		System.out.println("This is deafult method from monkey interface with definition");
	}
	
	public void jump();
	
}
