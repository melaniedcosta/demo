
public class Member extends TeamMember{
	String name;
	Task task;
	 public Member(Task t,String n){
		 this.task=t;
		 this.name=n;
	 }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Task getTask() {
		return task;
	}
	public void setTask(Task task) {
		this.task = task;
	}
}
