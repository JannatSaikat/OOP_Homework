package conceptMobile;

public class ConcreteMobile extends AbstractMobile implements InterfaceMobile, InterfaceMobile2 {

	@Override
	public void internet() {
		
		System.out.println("Internet is implemented recently.");
		
	}

	@Override
	public void videoCall() {
		
		System.out.println("Video Call is implemented recently.");
		
	}

	@Override
	public void call() {
		
		System.out.println("Call is already functional.");
	}

	@Override
	public void message() {
	
		System.out.println("Message is already functional.");
		
	}

	@Override
	public void browsing() {
		System.out.println("Browsing will be implemented. Caution: Don't get addicted folks");
	}

	@Override
	public void gps() {
		System.out.println("GPS will be implemented. Happy driving!");
		
	}

	@Override
	public void virtualAssistant() {
		System.out.println("Virtual Assistant will be implemented. But don't get isolated");
		
	}
	
	
	
	
	

}
