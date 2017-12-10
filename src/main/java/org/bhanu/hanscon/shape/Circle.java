package org.bhanu.hanscon.shape;


/**
 * 
 * @author bhanu
 *
 */
public class Circle implements Shape{
	private final double radius;
	private final Point center;
	
	
	public double getRadius() {
		return radius;
	}

	public Circle(Point center, double radius) {
		this.center = center;
		this.radius = radius;
	}
	public double getArea() {
		return Math.PI * radius * radius;
	}
	public double  getPerimeter() {
		return 2 * Math.PI * radius;
	}
	public Point getCenter() {
		return center;
	}

}
