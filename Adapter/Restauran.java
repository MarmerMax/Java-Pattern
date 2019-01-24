package Adapter;

public class Restauran {

	private Chief chief;
	
	public void setChief(Chief chief) {
		this.chief = chief;
	}
	
	public void changeChief() {
		if(chief instanceof AmericanChief) {
			this.setChief(new IsraeliChief());
		} else if(chief instanceof IsraeliChief) {
			this.setChief(new AmericanChief());
		}
	}

	public void showMenu() {
		System.out.println("Menu today: \n");
		chief.makeBreakfast();
		chief.makeDinner();
		chief.makeSupper();
		System.out.println("\n===========================================\n");
	}

}
