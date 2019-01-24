package State;

public class Test {

	public static void main(String[] args) {

		State state = new TurnOn();
		
		Television tv = new Television();
		tv.setState(state);
		
		for(int i = 0; i < 5; i++) {
			tv.doPress();
		}

	}

}
