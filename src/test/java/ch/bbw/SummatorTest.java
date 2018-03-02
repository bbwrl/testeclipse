package ch.bbw;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class SummatorTest {
	
	private Summator summator;
	
	@Before
	public void before() {
		summator = new Summator(20);
	}

	@Test
	public void test() {
		assertTrue(summator.getValue()==20);
	}
	
	@Test
	public void testSetter() {
		summator.setValue(50);
		assertTrue(summator.getValue()==50);
	}
	
	@Test
	public void testAdd() {
		summator.add(10);
		assertTrue(summator.getValue()==30);
	}

	@Test
	public void testSub() {
		summator.sub(10);
		assertTrue(summator.getValue()==10);
	}
}
