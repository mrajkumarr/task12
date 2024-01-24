package task12;

import java.util.ArrayList;
import java.util.List;

public class ArrConversion {

	public static void main(String[] args) {
		
	        // Create a List
	        List<String> name = new ArrayList<>();
	        
	        name.add("raj");
	        name.add("kumar");
	        name.add("Orange");
	        
	        System.out.println("before conversion");
	        System.out.println(name);

	        // Convert List to Array
	        String[] nameArray = name.toArray(new String[name.size()]);

	        System.out.println("\n");
            System.out.println("after conversion");
	        // Print the Array
	        for (String name1 : nameArray) {
	        	
	            System.out.println(name1);
	        }
	    }
}
