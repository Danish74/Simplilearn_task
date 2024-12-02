package cisco.java.programs;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class LinkedHashSetTask {

	    public static void main(String[] args) {
	        
//	        LinkedHashSet<Object> L1 = new LinkedHashSet<>();
//	        L1.add(100);          // Integer
//	        L1.add(200);          // Integer
//	        L1.add(1.1f);      // Float
//	        L1.add(2.2f);      // Float
//	        L1.add('A');        // Character
//	        L1.add('B');        // Character
//	        L1.add(true);       // Boolean
//
//	        LinkedHashSet<String> L2 = new LinkedHashSet<>();
//	        L2.add("Jodhpur");          
//	        L2.add("Delhi");          
//	        L2.add("Jaipur");          
//	        L2.add("Udaipur");         
//	        L2.add("Banglore");          
//	        L2.add("Ajmer");          
//
//	        
//	        System.out.println("Size of L2 = " + L2.size());
//
//	      
//	        boolean isDelhi = L2.contains("Delhi");
//	        System.out.println("Is Delhi in L2? " + isDelhi);
//
//	       
//	        boolean isEmpty = L2.isEmpty();
//	        System.out.println("Is L2 empty? " + isEmpty);
	    	
	    	
	    	ArrayList<String> al = new ArrayList<String>();
	        
//	        al.add("Java");
//	        al.add("HTML");
//	        al.add("CSS");
//	        al.add("Jquery");
//	        al.add("VueJS");
//	        al.add("python");
//	        
//	        System.out.println(al);
//	        
//	        al.add(3, "JS"); 
//	        System.out.println(al);
//	        al.add(1, "Java");
//	        System.out.println(al);
//	        
//	        System.out.println(al.contains("CSS"));
//	        
//	        System.out.println(al.get(4));
//	        
//	        al.remove(2);
//	        al.remove("VueJS");
//	        System.out.println(al);
//	        
//	        System.out.println(al.size());
//	        
//	        al.toArray();
//	        System.out.println(al);
//	        
//	        ArrayList<String> ob = new ArrayList<String>();
//	        ob.add("Delhi");
//	        ob.add("Mumbai");
//	        ob.add("Chennai");
//	        ob.add("Kolkata");
//	        
//	        al.addAll(ob);
//	        System.out.println(al);
	    	
	    	
	    	al.add("Mango");
	        al.add("Apple");
	        al.add("Banana");
	        al.add("Watermelon");
	        al.add("Mosambi");
	        al.add("Strawberry")
	        System.out.println(al);
	        
	        
	        
	        al.add("Jodhpur"); 
	        al.add("Jaipur");
	        System.out.println(al);
	        
	        al.add("Cricket"); 
	        al.add("only Cricket");
	        System.out.println(al);
	        
	        System.out.println(al.contains("Cricket"));
	        
	        
	        al.remove("Mango");
	        al.remove("Jaipur");
	        System.out.println(al);
	        
	        System.out.println(al.get(4));
	        System.out.println(al.get(6));
	        
	        
	        System.out.println(al.size());
	        
	       
	        al.add(4, "Kerala");
	        al.add(2, "Mango");
	        System.out.println(al);
	        
	        
	       
	        
	    }
	}