package cisco.java.programs;

public class StringDemo {

	public static void main(String[] args) {

		String s = "Sachin";  // String Literal---> objects are created in string pool
	       String p = "Ravi";
	       
	       if(s.equals(p))
	       {
	           System.out.println("true....>>>>>");
	       }
	       else{
	           System.out.println("false....>>>>");
	       }
	       
	       s.concat(" Tendulkar");       //concat() method appends the string at the end  
	       s = s.concat(" Tendulkar");       
	       System.out.println(s);       
	       
	       if(s.equals(p))
	       {
	           System.out.println("true....");
	       }
	       else{
	           System.out.println("false....");
	       }

	}

}
