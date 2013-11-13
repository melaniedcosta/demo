import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class ProjectTest {
	Project project1;
	Sprint sprint1;

	@Before
	public void setUp() throws Exception {
		project1=new Project(sprint1,"scrum");
	}

	@Test
	public void testGetName() {
		assertEquals("scrum",project1.getName());
	}

}
