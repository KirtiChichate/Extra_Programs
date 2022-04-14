package animal_prog;

public class BasicAnimal implements Human {

	public static void main(String[] args) {

BasicAnimal obj= new BasicAnimal();
   obj.bite();
   obj.eat();
   obj.jump();
   obj.sleep();

	}

	@Override
	public void jump()
	{
		System.out.println("This is a jump method from monkey interface");
		
	}

	@Override
	public void eat() {
		System.out.println("This is a eat method from human interface");
		
	}

}
