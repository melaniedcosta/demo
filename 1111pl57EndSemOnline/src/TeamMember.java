


abstract class TeamMember {
	static String name;
	static Task task;
	static TeamMember member(){ 
		 return _member; 
		 } 
	static TeamMember scrummaster(){ 
		 return _scrummaster; 
		 } 
	static TeamMember productowner(){ 
		 return _productowner; 
		 } 
	 private static TeamMember _member = new Member(task,name); 
	 private static TeamMember _scrummaster = new ScrumMaster(name); 
	 private static TeamMember _productowner=new ProductOwner(name);
	public String getName() {
		return name;
	}
	public void setName(String name) {
		TeamMember.name = name;
	}
	
	 
}
