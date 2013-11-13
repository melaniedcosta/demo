
public class Task {
	int no_ofhrs;
	String name;
	Story story;
	
	public Task(Story s,String n,int hrs){
		this.story=s;
		this.name=n;
		this.no_ofhrs=hrs;
	}

	public int getNo_ofhrs() {
		return no_ofhrs;
	}

	public void setNo_ofhrs(int no_ofhrs) {
		this.no_ofhrs = no_ofhrs;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Story getStory() {
		return story;
	}

	public void setStory(Story story) {
		this.story = story;
	}
	
}
