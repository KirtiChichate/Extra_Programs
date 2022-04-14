package telecom_Prog;
//this is concept of method overriding using polymorphisms
public class SmartTelephone extends Telephone {

	public static void main(String[] args)
	{
		
		
		SmartTelephone obj= new SmartTelephone();
		obj.disconnected();
		obj.lift();
	}
	
	
	
	
	@Override
	public void lift() {

System.out.println("Lift method is completed using method overriding ");
		
	}

	@Override
	public void disconnected() {
		System.out.println("disconnected method is completed using method overriding");
		
	}

}
