
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sprint sprint1=new Sprint(5);
		Story story1=new Story(sprint1,"As an admin, I want to write rules.....",2,10);
		Story story2=new Story(sprint1,"As a customer, I want to register.....",1,7);
		Task task=new Task(story1,"Designing",3);
		Task task1=new Task(story2,"Designing",3);
		Project project1=new Project(sprint1,"scrum");
		TeamMember sm=new ScrumMaster("Roy");
		TeamMember po=new ProductOwner("Sam");
		TeamMember member1=new Member(task,"Pam");
		TeamMember member2=new Member(task1,"Kim");
		Team team1=new Team(20,4,project1,sm,po,member1,member2);
		System.out.println("Project Name: "+project1.getName());
		System.out.println("Sprint1 duration: "+sprint1.getNo_ofdays()+" days");
		System.out.println("Scrum Master: "+sm.getName());
		System.out.println("Product Owner: "+po.getName());
		System.out.println("Sprint1 \n\tStory1: "+story1.getStory()+"\n\tPriority: "+story1.getPriority()+"\tStory Point: "+story1.getStorypt());
		System.out.println("\tTask1: "+task.getName()+"\tNo of hrs: "+task.getNo_ofhrs());
		System.out.println("\tTeam member: "+member1.getName());
		System.out.println("\nSprint1 \n\tStory2: "+story2.getStory()+"\n\tPriority: "+story2.getPriority()+"\tStory Point: "+story2.getStorypt());
		System.out.println("\tTask1: "+task1.getName()+"\tNo of hrs: "+task1.getNo_ofhrs());
		System.out.println("\tTeam member: "+member2.getName());
	}

}
