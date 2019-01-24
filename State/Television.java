package State;

public class Television {
	
	private State state;
	
	public void setState(State state) {
		this.state = state;
	}
	
	private void changeState() {
		if(state instanceof TurnOn) {
			this.setState(new TurnOff());
		} else if (state instanceof TurnOff){
			this.setState(new TurnOn());
		}
	}
	
	public void doPress() {
		state.press();
		changeState();
	}

}
