import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class SprintTest {
	Sprint sprint1;
	@Before
	public void setUp() throws Exception {
		sprint1=new Sprint(5);
	}

	@Test
	public void testSprintDays() {
		assertEquals(5,sprint1.getNo_ofdays());
	}

}
