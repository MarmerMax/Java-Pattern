package Visitor;

public class Triangle implements Shape
{
	@Override
	public void acceptVisitor(Visitor v)
	{
		v.draw(this);
	}
}
