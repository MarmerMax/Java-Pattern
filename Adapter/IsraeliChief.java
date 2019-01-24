package Adapter;

public class IsraeliChief extends Israeli implements Chief{

	@Override
	public void makeDinner() {
		this.cookShakshuka();
	}

	@Override
	public void makeBreakfast() {
		this.cookShawarma();
	}

	@Override
	public void makeSupper() {
		this.cookFalafel();
	}

}
