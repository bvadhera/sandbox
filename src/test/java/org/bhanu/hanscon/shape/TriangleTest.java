package org.bhanu.hanscon.shape;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {

	
	@Test
	public void testRightAngle() {
		Triangle t1 = new Triangle(new Point(0.0, 0.0), new Point(0.0, 1.0), new Point(1.0, 0));
		Assert.assertEquals(0.5, t1.getArea(), 0.00001);
		Assert.assertEquals(2*1.0+Math.sqrt(2.0), t1.getPerimeter(), 0.0001);
	}
	
	
}
