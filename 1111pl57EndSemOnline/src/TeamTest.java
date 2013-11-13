import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TeamTest {
	Team team1;
	Project p;
	TeamMember sm1,po,m1,m2;

	@Before
	public void setUp() throws Exception {
		team1=new Team(20,4,p,sm1,po,m1,m2);
	}

	@Test
	public void testVelocity() {
		assertEquals(20,team1.getVelocity());
	}
	
	@Test
	public void testSize() {
		assertEquals(4,team1.getSize());
	}

}
