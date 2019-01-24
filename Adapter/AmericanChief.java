package Adapter;

public class AmericanChief extends American implements Chief{

	@Override
	public void makeBreakfast() {
		this.cookCornflex();
	}
	
	@Override
	public void makeDinner() {
		this.cookSteak();
	}

	@Override
	public void makeSupper() {
		this.cookPie();
	}

}
