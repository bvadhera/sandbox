package org.bhanu.hanscon.shape;

public class Rectangle implements Shape {
	private final double length;
	private final double width;


	public Rectangle(double length, double width) {
		this.length = length;
		this.width  = width;
	}
	
	public double getArea() {
		return width * length;
	}

	public double getPerimeter() {
		return 2 *(width + length);
	}

}