package collection1;
import java.util.HashMap;


public class Candidates_Hashmap {
	public static void main(String[] args) {
		HashMap<Integer,String> c = new HashMap<>();
		c.put(100,"Bala");
		c.put(101, "Sudharsan");
		c.put(102,"Adithya");
		c.put(103, "Godwin");
		c.put(104, "Shanthi");
		
		System.out.println("****TO PRINT THE OVERALL VALUE IN ARRAY FORMAT*****");
		System.out.println(c);
	    System.out.println("******TO PRINT THE SET VALUES****");
	    System.out.println(c.keySet());
	    System.out.println("*****TO PRINT ALL THE VALUES****");
	    System.out.println(c.values());
	    System.out.println("****TO GET THE PARTICULAR VALUE****");
	    System.out.println(c.get(101));
	    
	    
	    for(Integer x : c.keySet()) {
	    	System.out.println(x);
	    }
		for(String y : c.values()) {
			System.out.println(y);
		}
		for(Integer z : c.keySet()) {       //By passing the key and get the values
			System.out.println(c.get(z));    //syso name should be` passed in this format
		}
		
		System.out.println(c.remove(102));
		System.out.println(c);
		
	}

}
