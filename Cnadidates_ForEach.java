package collection1;
import java.util.HashMap;

public class Cnadidates_ForEach {
	public static void main(String[] args) {
		
    HashMap<Integer,String> c = new HashMap<>();
		c.put(100,"Bala");
		c.put(101, "Sudharsan");
		c.put(102,"Adithya");
		c.put(103, "Godwin");
		c.put(104, "Shanthi");
		System.out.println("*****TO GET BOTH KEY AND VALUE*****");
	    c.forEach((x,y)-> {
	    	System.out.println(x+","+y);
	    });
	    
	    System.out.println("***BY PASSING THE KEY AND GET THE VALUES****");
	    c.keySet().forEach(x-> {
	    	System.out.println(c.get(x));
	    });
	    
	    System.out.println("****BY PASSING THE VALUES AND GET VALUES*****");
	    c.values().forEach(x-> {
	    	System.out.println(x);
	    });
	}

}
