
public class Project {
	Sprint sprint;
	String name;

	public Project(Sprint sp,String n){
		this.sprint=sp;
		this.name=n;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
