package State;

public class TurnOn implements State{

	@Override
	public void press() {
		System.out.println("Tv works...");
	}

}
