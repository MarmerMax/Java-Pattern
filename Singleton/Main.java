package Singleton;

public class Main {

	public static void main(String[] args) 
	{
		//Singleton s = new Singleton(); //Not possible now - because its singleton..
		Singleton s = Singleton.getInstance(); //The way to get to only instance
		ThreadSaveSingleton t = ThreadSaveSingleton.getInstance();
	}

}
