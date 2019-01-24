package Observer;

public class Providers {

	public static void main(String[] args) {

		MobileProvider celcom = new MobileProvider(60);
		
		MobileClient max = new MobileClient(celcom);
		MobileClient mark = new MobileClient(celcom);
		
		max.display();
		mark.display();

		celcom.setPrice(80);
		
		celcom.setPrice(40);
		
		MobileProvider orange = new MobileProvider(30);
		
		MobileClient alex = new MobileClient(orange);
		
		alex.display();
		
		orange.setPrice(50);

	}

}
