package cisco.java.programs;

import java.util.LinkedList;

public class MonthLinkedList {

	public static void main(String[] args) {
		 LinkedList<String> months = new LinkedList<>();
	        months.add("May");
	        months.add("June");
	        months.add("July");
	        months.add("August");
	        months.add("April");
	        months.add("November");
	        
	        months.addLast("December");
	        months.addFirst("January");
	        
	        months.add(2, "March"); 
	        months.add(3, "February");
	        
	        months.add(6, "September");
	        months.add(7, "October");
	        
	        System.out.println("Months in order: " + months);
	        
	        for( int i=0 ; i<months.size() ; i++)
	        {
	         if( i%2 ==0 )
	          {
	        	 
	             System.out.println("Even months: " + months.get(i));
	          }
	          else
	         {
	        	  System.out.println("Odd months: " + months.get(i));
	         }
	        }
	        
	        System.out.print("Even months = ");
	        for (String month : months) {
	            if (month.equals("April") || month.equals("June") || month.equals("August") || month.equals("October") || month.equals("December")) {
	                System.out.print(month + " ");
	            }
	        }
	        System.out.println();
	        
	        System.out.print("Odd months =  ");
	        for (String month : months) {
	            if (month.equals("January") || month.equals("March") || month.equals("May") || month.equals("July") || month.equals("September") || month.equals("November")) {
	                System.out.print(month + " ");
	            }
	        }
	        System.out.println();
	        
	        
	        System.out.println("First month = " + months.getFirst() + ", Last month = " + months.getLast());
	        
	        String birthdayMonth = "October"; 
	        if (months.remove(birthdayMonth)) {
	            System.out.println("Removed birthday month = " + birthdayMonth);
	        } else {
	            System.out.println("Birthday month not found = " + birthdayMonth);
	        }

	        boolean isWinterMonth = months.contains("December") || months.contains("January") || months.contains("February");
	        System.out.println("Contains winter month: " + isWinterMonth);
	        
	        
	        System.out.println("First month using pee = : " + months.peekFirst());
	        System.out.println("Last month using peek = " + months.peekLast());
	        
	        System.out.println("Removed first month =  " + months.pollFirst());
	        System.out.println("Removed last month = " + months.pollLast());
	        
	        System.out.println("Final months list = " + months);
	        

	}

}
