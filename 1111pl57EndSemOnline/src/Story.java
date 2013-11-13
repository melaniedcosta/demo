
public class Story {
	Sprint sprint1;
	String story;
	int priority;
	int storypt;
	
	public Story(Sprint sprint, String story, int priority, int storypt){
		this.sprint1=sprint;
		this.story=story;
		this.priority=priority;
		this.storypt=storypt;
	}
	
	public Sprint getSprint1() {
		return sprint1;
	}
	public void setSprint1(Sprint sprint1) {
		this.sprint1 = sprint1;
	}
	public String getStory() {
		return story;
	}
	public void setStory(String story) {
		this.story = story;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public int getStorypt() {
		return storypt;
	}
	public void setStorypt(int storypt) {
		this.storypt = storypt;
	}
	

}
