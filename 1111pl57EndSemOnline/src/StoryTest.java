import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class StoryTest {
	Story story1;
	Sprint sprint1;

	@Before
	public void setUp() throws Exception {
		story1=new Story(sprint1,"As an admin, I want to write rules.....",2,10);
	}

	@Test
	public void testStory() {
		assertEquals("As an admin, I want to write rules.....",story1.getStory());
	}
	
	@Test
	public void testPriority() {
		assertEquals(2,story1.getPriority());
	}

	@Test
	public void testStorypt() {
		assertEquals(10,story1.getStorypt());
	}
}
