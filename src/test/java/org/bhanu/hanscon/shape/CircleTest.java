package org.bhanu.hanscon.shape;

import org.junit.Assert;
import org.junit.Test;

public class CircleTest {

	
	@Test
	public void testRadiuszero() throws Exception{
		Circle circle = new Circle(new Point(0.1, 1.0), 0.0);
		Assert.assertEquals(0.0, circle.getArea(), 0.0);
		Assert.assertEquals(0.0, circle.getPerimeter(), 0.0);
	}
	
	@Test
	public void testRedius1() throws Exception{
		Circle circle = new Circle(new Point(0.1, 1.0), 1.0);
		Assert.assertEquals(Math.PI, circle.getArea(), 0.000001);
		Assert.assertEquals(2*Math.PI, circle.getPerimeter(), 0.000001);
	}
	@Test
	public void testRedius3() throws Exception{
		Circle circle = new Circle(new Point(0.1, 1.0), 3.0);
		Assert.assertEquals(9*Math.PI, circle.getArea(), 0.000001);
		Assert.assertEquals(6*Math.PI, circle.getPerimeter(), 0.000001);
	}
	
}
