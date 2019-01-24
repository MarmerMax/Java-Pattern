package Singleton;

/**
 * The 'classic' Singleton implementation - NOT thread safe
 */
public class Singleton 
{
	private static Singleton onlyInstance = null;

	private Singleton() 
	{
	}

	public static Singleton getInstance()
	{
		if(onlyInstance == null)
		{
			onlyInstance = new Singleton();
			System.out.println("Object was created");
		}		
		
		return onlyInstance;
	}
}