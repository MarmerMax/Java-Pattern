package Singleton;

public class ThreadSaveSingleton 
{
	private static ThreadSaveSingleton onlyInstance = null;

	private ThreadSaveSingleton() 
	{
	}

	public static ThreadSaveSingleton getInstance()
	{
		if(onlyInstance == null) 
		{
			synchronized (ThreadSaveSingleton.class) 
			{	
				if(onlyInstance == null)
				{
					onlyInstance = new ThreadSaveSingleton();
					System.out.println("Thread Save Singleton was created");
				}
			}
		}
				
		return onlyInstance;
	}
}
