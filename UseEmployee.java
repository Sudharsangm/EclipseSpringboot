package collection1;
import java.util.HashMap;
import java.util.Iterator;

public class UseEmployee {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee(100, "Sudharsan", 23, "Male", 40000, "Developer", 2);
		Employee e2 = new Employee(101, "Raja", 24, "Male", 30000,"Testing", 3);
		Employee e3 = new Employee(102,"Priya",25,"Female",50000,"Developer",4);
		Employee e4 = new Employee(103,"Sethu",27,"Male",35000,"Aws",5);
		Employee e5 = new Employee(104,"Varsha",26,"Female",45000,"Scrum team",6);
		Employee e6 = new Employee(105,"Rahul",21,"Male",20000,"Full stack",2);
		Employee e7 = new Employee(106,"Shirin",23,"Female",60000,"Dev",4);
		
		HashMap<Integer,Employee> a = new HashMap<>();
		a.put(e1.getid(), e1);
		a.put(e2.getid(), e2);
		a.put(e3.getid(), e3);
		a.put(e4.getid(), e4);
		a.put(e5.getid(), e5);
		a.put(e6.getid(), e6);
		a.put(e7.getid(), e7);
		
		System.out.println(a);
		
		System.out.println("***IN ENHANCED FOR LOOP BY PASSING THE KEY AND GET THE VALUES****");
		for(Integer i : a.keySet()) {
			System.out.println(a.get(i));
			
		}
		
		System.out.println("****IN FOR EACH LOOP BY PASSING THE KEY AND GET THE VALUES*****");
		a.keySet().forEach(x-> {
			System.out.println(a.get(x));
		});
		
		System.out.println("****IN FOR EACH LOOP BY PASSING THE values AND GET THE VALUES");
		a.values().forEach(x -> {
			System.out.println(x);
		});
		
		System.out.println("****BY ENHANCED ONLY GETTING FEMALE EMPLOYEES BY GIVING VALUES IN LOOP");
		for(Employee e: a.values()) {
			if(e.getgender().equalsIgnoreCase("FEMAle")) {
				System.out.println(e);
			}
		}
		
		System.out.println("******BY ENHANCED ONLY GETTING MALE EMPLOYEES VALUES BY GIVING KEYSET IN LOOP");
		for(Integer e : a.keySet()) {
				if(a.get(e).getgender().equalsIgnoreCase("Male")){
					System.out.println(a.get(e));
				}
		}
		System.out.println("****BY FOREACH GETTING MALE EMLOPYEES");
		a.keySet().forEach(x-> {
			if(a.get(x).getgender().equalsIgnoreCase("Male")) {
				System.out.println(a.get(x));
			}
		});
		
		System.out.println("****USING FOR to add only male employees and 3 yrs above exp");
		
		HashMap<Integer,Employee> male = new HashMap<>();
	    for(Integer e : a.keySet()) {
	    	if(a.get(e).getgender().equalsIgnoreCase("Male") && a.get(e).getexperience()>=3) {
	    	 male.put(e,a.get(e));
	    	
	    }
		
	    }
	    System.out.println(male);
	    
	    System.out.println("USING ITERATOR INTERFACE WE USE REMOVE  ");
	    Iterator<Employee> x = a.values().iterator();
	    while (x.hasNext()) {
	    	if (x.next().getexperience()<=4) {
				x.remove();
			}
		}
	    System.out.println(a);
	    System.out.println("-----------------------------------------------");
	
	    
	    
	    
	    	    
	    
	}
}
