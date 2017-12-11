package org.bhanu.hanscon.shape;

/**
 * Class to represent Triangle.
 * @author    Bhanu Vadhera
 */
public class Triangle implements Shape {

	private final double sideAB;
    private final double sideBC;
    private final double sideAC;

	/**
	 * The Constructor.
	 * @param arg1 A point
	 * @param arg2 A point
	 * @param arg3 A point
	 */
	public Triangle(Point p1, Point p2, Point p3) {
		sideAB= Math.abs(Math.sqrt(Math.pow(p1.getX()-p2.getX(),  2)+
				Math.pow(p1.getY()-p2.getY(), 2)));
        sideBC= Math.abs(Math.sqrt(Math.pow(p2.getX()-p3.getX(),  2)+
        		Math.pow(p2.getY()-p3.getY(), 2)));
        sideAC= Math.abs(Math.sqrt(Math.pow(p3.getX()-p1.getX(),  2)+
        		Math.pow(p3.getY()-p1.getY(), 2)));
	}

	/**
	 * Gets the area of the triangle
	 * @return area of the triangle as double .
	 */
	public double getArea() {
		double s = (sideAB + sideBC + sideAC)/2;
        double area = Math.sqrt(s*(s - sideAB)*(s - sideBC)*(s - sideAC));
        return area;
	}

	/**
	 * Gets the Perimeter of the triangle
	 * @return Perimeter of the triangle as double .
	 */
	public double getPerimeter() {
		  double perimeter = sideAB + sideBC + sideAC;
	      return perimeter;
	}

}
