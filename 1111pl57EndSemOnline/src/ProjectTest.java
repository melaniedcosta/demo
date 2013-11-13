import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class ProjectTest {
	Project project1;

	@Before
	public void setUp() throws Exception {
		project1=new Project("scrum");
	}

	@Test
	public void testGetName() {
		assertEquals("scrum",project1.getName());
	}

}
