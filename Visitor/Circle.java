package Visitor;

public class Circle implements Shape
{
	@Override
	public void acceptVisitor(Visitor v)
	{
		v.draw(this);
	}

}
