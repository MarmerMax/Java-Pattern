package Adapter;


/**
 * Project represent Adapter pattern including kind of State pattern.
 * @author Max Marmer
 *
 */
public class RestauranRunner {

	public static void main(String[] args) {

		Chief chief = new IsraeliChief();
		
		Restauran restauran = new Restauran();
		
		restauran.setChief(chief);
		restauran.showMenu();
		
		restauran.changeChief();
		restauran.showMenu();
	}

}
