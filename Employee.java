package collection1;

public class Employee {

	private int id;
	private String name;
	private int age;
	private String gender;
	private int salary;
	private String designation;
	private int experience;
	
	public void setid(int id) {
		this.id= id;
		
	}
	public void setname(String name) {
		this.name= name;
	}
	public void setage(int age ) {
		this.age= age;
		
	}
	public void setgender(String gender) {
		this.gender = gender;
		
	}
	public void setsalary(int salary) {
		this.salary = salary;
	}
	public void setdesignation( String designation) {
		this.designation = designation;
		
	}
	public void setexperience(int experience) {
		this.experience = experience;
	}
	
	public int getid() {
		return this.id;
	}
	public String getname() {
		return this.name;
	}
	public int getage() {
		return this.age;
	}
	public String getgender() {
		return this.gender;
	}
	public int getsalary() {
		return this.salary;
	}
	public String getdesignation() {
		return this.designation;
	}
	public int getexperience() {
		return this.experience;
		
	}
	
	public Employee(int id,String name,int age,String gender,int salary,String designation,int experience) {
	           this.id= id;
		       this.name = name;
		       this.age= age;
		       this.gender=gender;
		       this.salary=salary;
		       this.designation= designation;
		       this.experience = experience;
		       
	}
	
	public String toString() {
		return id+","+name+","+age+","+gender+","+salary+","+designation+","+experience;
				
	}
	
	
	
	
	
	
}
