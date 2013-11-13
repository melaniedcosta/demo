
public class Team {
	int velocity;
	int size;
	Project project1=new Project("scrum");
	
	public Team(int v, int s, Project p){
		this.velocity=v;
		this.size=s;
		this.project1=p;
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
