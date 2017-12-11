package org.bhanu.hanscon.shape;


/**
 * Class to represent Circle.
 * @author bhanu Vadhera
 * @date 12/11/2017
 *
 */
public class Circle implements Shape{
	private final double radius;
	private final Point center;



    /**
     * The Constructor.
     * @param arg1 point
     * @param arg2 radius
     */
    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

	/**
	 * Gets the Radius of the circle
	 * @return radius as double .
	 */
	public double getRadius() {
		return radius;
	}


    /**
     * Gets the Area of the circle
     * @return Area as double .
     */
	public double getArea() {
		return Math.PI * radius * radius;
	}

    /**
     * Gets the Perimeter of the circle
     * @return Perimeter as double .
     */
	public double  getPerimeter() {
		return 2 * Math.PI * radius;
	}

    /**
     * Gets the Center of the circle
     * @return Center as double .
     */
	public Point getCenter() {
		return center;
	}

}
