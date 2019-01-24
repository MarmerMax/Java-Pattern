package Observer;

public class MobileClient implements Observer{
	

	private int price;
	private MobileProvider mobileProvider;
	
	public MobileClient(MobileProvider mobileProvider) {
		this.mobileProvider = mobileProvider;
		this.mobileProvider.registerObserver(this);
		//price = mobileProvider.getPrice();
	}

	@Override
	public void update(int price) {
		this.price = price;
		display();
	}

	public void display() {
		System.out.printf("Price was change!!! Currenet price is %d.\n", price);
	}
}
