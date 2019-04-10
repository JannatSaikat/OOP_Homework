package conceptMobile;

public class TestEncapsulationIdentity {
	public static void main(String[] args) {

		EncapsulationIdentity encapsulationIdentity = new EncapsulationIdentity();
		encapsulationIdentity.setName("Jannat");
		System.out.println("Phone owner is " + encapsulationIdentity.getName());
		
		encapsulationIdentity.setIMEI(666666);
		System.out.println("IMEI number is " + encapsulationIdentity.getIMEI());
		
	}	


}
