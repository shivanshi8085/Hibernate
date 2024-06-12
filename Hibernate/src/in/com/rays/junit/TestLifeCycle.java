package in.com.rays.junit;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

public class TestLifeCycle {
	
	public static void beforeClass() throws Exception {
		System.out.println("before class");
	}

	@Before
	public void before() throws Exception {
		System.out.println("before");
	}

	@Test
	public void testFindMax() {
		System.out.println("Test 01");
		assertEquals(6, Calculation.findMax(new int[] { 1, 3, 4, 2, 6 }));
		assertEquals(1, Calculation.findMax(new int[] { -12, 1, -3, -4, -2 }));
	}

	@Test
	public void testFindMax1() {
		System.out.println("Test 02");
		assertEquals(6, Calculation.findMax(new int[] { 1, 3, 4, 2, 6 }));
		assertEquals(1, Calculation.findMax(new int[] { -12, 1, -3, -4, -2 }));
	}

	@After
	public void after() throws Exception {
		System.out.println("after");
	}

	@AfterClass
	public static void afterClass() throws Exception {
		System.out.println("after class");
	}

}
	
	


