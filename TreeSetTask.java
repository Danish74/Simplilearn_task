package cisco.java.programs;
import java.util.TreeSet;

public class TreeSetTask {

		public static void main(String[] args) {
			
			TreeSet<String> languages = new TreeSet<String>();
	        languages.add("Python");
	        languages.add("JavaScript");
	        languages.add("C++");
	        languages.add("Java");
	        languages.add("Ruby");
	        languages.add("Go");

	        
	        languages.remove("C++");
	        languages.remove("Ruby");

	        
	        languages.add("Angular");
	        languages.add("Mysql");
	        languages.add("PHP");

	       
	        boolean isJava = languages.contains("Java");
	        System.out.println("Is 'Java' part of the TreeSet? " + isJava);

	       
	        languages.clear();

	        
	        System.out.println("TreeSet after removal of all elements: " + languages);
	    }
	}


