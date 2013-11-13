
public class Team {
	int velocity;
	int size;
	Project project1;
	TeamMember sm,po,m1,m2;
	
	public Team(int v, int s, Project p, TeamMember sm1, TeamMember po,
			TeamMember member1, TeamMember member2){
		this.velocity=v;
		this.size=s;
		this.project1=p;
		this.sm=sm1;
		this.po=po;
		this.m1=member1;
		this.m2=member2;
	}

	

	public int getVelocity() {
		return velocity;
	}

	public void setVelocity(int velocity) {
		this.velocity = velocity;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}
