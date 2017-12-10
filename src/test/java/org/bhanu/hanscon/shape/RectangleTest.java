package org.bhanu.hanscon.shape;

import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {

	
	@Test
	public void testzeroedges() {
		Rectangle r = new Rectangle(new Point(0,0), 0.0, 0.0);
		Assert.assertEquals(0.0, r.getArea(), 0.00001);
		Assert.assertEquals(0.0, r.getPerimeter(), 0.00001);
	}
	
	@Test
	public void testrectangle() {
		Rectangle r = new Rectangle(new Point(0,0), 1.0, 2.0);
		Assert.assertEquals(2.0, r.getArea(), 0.00001);
		Assert.assertEquals(1*2+2+2, r.getPerimeter(), 0.00001);
	}
	
}
