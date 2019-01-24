package Visitor;

import java.util.LinkedList;

public class ShapePainter implements Visitor
{
	LinkedList<Shape> shapes = new LinkedList<Shape>();
	
	public ShapePainter(LinkedList<Shape> shapes) 
	{
		this.shapes = shapes; //Notice - shallow copy..
	}
	
	public void draw()
	{
		for (Shape shape : shapes) 
		{
			shape.acceptVisitor(this);
			
//			if(shape instanceof Circle)             	//this if/else logic is usually BAD! 
//				draw((Circle)shape);					//Easy to forget to add when new shape is added
//			else if(shape instanceof Square)			//Ugly solution - not generic 
//				draw((Square)shape);					
//			else if(shape instanceof Triangle)			
//				draw((Triangle)shape);				
		}
	}
	
	public void draw(Circle e) 
	{	
		System.out.println("draw circle");
	}

	public void draw(Square e) 
	{
		System.out.println("draw square");
	}
	
	public void draw(Triangle e) 
	{
		System.out.println("draw triangle");
	}
	
}
