package penProgram;

public class FountainPen extends Pen{

	public static void main(String[] args) {
		FountainPen obj= new FountainPen();
		obj.change_nib();
		obj.refill();
		obj.write();
		obj.ink();
		//calling static method from pen super class
		Pen.colour();
		
		//System.out.println("This is variable from super class "+super.a); we can't use super keyword for inherited variable from abstract class 

	}

	@Override
	public void write() {
		System.out.println("This is nothing but a override method from pen class regarding method write");
		
	}

	@Override
	public void refill() {
		System.out.println("This is nothing but override method from pen class regarding method refill");
		
	}
	public void change_nib()
	{
		String xy="change";
		System.out.println("Nib of the pen should "+xy);
	}

}
