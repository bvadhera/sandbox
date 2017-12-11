package org.bhanu.hanscon.shape;


/**
 /**
 * Class to represent Rectangle.
 * @author bhanu Vadhera
 * @date 12/11/2017
 *
 */
public class Rectangle implements Shape {
	private final double length;
	private final double width;


	/**
	 * The Constructor.
	 * @param arg1 length
	 * @param arg2 width
	 */
	public Rectangle(double length, double width) {
		this.length = length;
		this.width  = width;
	}

	/**
	 * Gets the Area of the Rectangle
	 * @return Area as double .
	*/
	public double getArea() {
		return width * length;
	}

	/**
	 * Gets the Perimeter of the Rectangle
	 * @return Perimeter as double .
	 */
	public double getPerimeter() {
		return 2 *(width + length);
	}

}
