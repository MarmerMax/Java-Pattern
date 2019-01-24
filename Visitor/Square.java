package Visitor;

public class Square implements Shape
{
	@Override
	public void acceptVisitor(Visitor v)
	{
		v.draw(this);
	}
}
