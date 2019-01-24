package Observer;

import java.util.ArrayList;
import java.util.List;

public class MobileProvider implements Observable{

	private List<Observer> observers;
	private int price;
	
	public MobileProvider(int price) {
		observers = new ArrayList<>();
		this.price = price;
	}
	
    public void setPrice(int price) {
        this.price = price;
        notifyObservers();
    }
    
    public int getPrice() {
    	return price;
    }

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for(Observer observer : observers) {
			observer.update(price);
		}
	}
}
