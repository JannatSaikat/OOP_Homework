package conceptMobile;


public class PolymorphismMobile extends ConcreteMobile {
	
	//Method Overloading
	public void product(String Model) {
		String model= Model;
		System.out.println(model + " is created");
	}
	
	public void product(int Model) {
		int model= Model;
		System.out.println("Here you get Concept Phone: " + model );
	}
	
	
	
	

	@Override
	public void virtualAssistant() {
		
		System.out.println("Sorry, Virtual Assistant will be implemented after few months.");
	}

	public static void main(String[] args) {
		PolymorphismMobile polymorphismMobile = new PolymorphismMobile();
		polymorphismMobile.virtualAssistant();
		polymorphismMobile.product("New Model"); 
		polymorphismMobile.product(2019);
		
		
		
	}

}
