package hw;

import static org.junit.Assert.*;

import org.junit.Test;

public class triangleTest {
	
	triangle t = new triangle();
	
	@Test
	public void test() {
		int f = t.tri(1,1,1);
		assertEquals( 1 , f );
		f = t.tri(2,2,3);
		assertEquals( 2 , f );
		f = t.tri(2,3,4);
		assertEquals( 3 , f );
		f = t.tri(1,1,4);
		assertEquals( -1 , f );
	}

}
