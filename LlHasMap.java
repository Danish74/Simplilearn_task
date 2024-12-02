package cisco.java.programs;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LlHasMap {

	public static void main(String[] args) {

//		Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
//        
//        linkedHashMap.put(1, new String("Samsung"));
//        linkedHashMap.put(2, new String("Mi"));
//        linkedHashMap.put(3, new String("Toshiba"));
//        linkedHashMap.put(4, new String("HCL"));
//        linkedHashMap.put(5, new String("Wipro"));
//        linkedHashMap.put(6, "OPPO");
//               
//        System.out.println("Contents of LinkedHashMap : " + linkedHashMap);
//        System.out.println("\nValues of map after iterating over it : ");
//        
//        
//       
//        for (Integer key : linkedHashMap.keySet()) {
//            System.out.println(key + ":\t" + linkedHashMap.get(key));
//        }
//        
//        System.out.println("\nThe size of the LinkedHashMap is : " + linkedHashMap.size());
//        System.out.println("\nIs LinkedHashMap empty? : " + linkedHashMap.isEmpty());
//
//        System.out.println("\nLinkedHashMap contains 2 as key? : " + linkedHashMap.containsKey(2));
//        System.out.println("LinkedHashMap contains HCL as value? : " + linkedHashMap.containsValue("HCL"));
//        System.out.println("\nRemove entry for key 3 : " + linkedHashMap.remove(3));
//        System.out.println("Content of LinkedHashMap after removing key 2: " + linkedHashMap);
//        
//        linkedHashMap.replace(4, "DELL");
//        System.out.println("After replacing the key 4: " + linkedHashMap);
//        
//        
//        Map<Integer, String> salary = new LinkedHashMap<Integer, String>();
//        
//        salary.put(101, "Emp-1");
//        salary.put(102, "Emp-2");
//        salary.put(103, "Emp-3");
//        salary.put(104, "Emp-4");
//        
//        linkedHashMap.putAll(salary);
//        System.out.println("After merging the salary map into the existing map " + linkedHashMap);
//       
//        linkedHashMap.clear();
//        System.out.println("\nContent of LinkedHasmap " + linkedHashMap);
		
Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
        
        linkedHashMap.put(1, new String("India"));
        linkedHashMap.put(2, new String("Austrailia"));
        linkedHashMap.put(3, new String("England"));
        linkedHashMap.put(4, new String("Russia"));
        linkedHashMap.put(45, new String("USA"));
        linkedHashMap.put(5, new String("UAE"));
               
        System.out.println("Conuntry code : " + linkedHashMap.keySet());
        System.out.println("\nCountry name : " + linkedHashMap.values());
        
        boolean isIndia = linkedHashMap.containsValue("India");
        System.out.println("is India in this? " + isIndia);
        
        boolean hasKey45 = linkedHashMap.containsKey(45);
        System.out.println("Does the map contain key 45? " + hasKey45);
        
        linkedHashMap.remove(2);
        System.out.println("After removing : " + linkedHashMap);
        
        HashMap<Integer, String> stateMap = new HashMap<>();
        stateMap.put(5, "California");
        stateMap.put(6, "Texas");
        stateMap.put(7, "New York");

        
        linkedHashMap.putAll(stateMap);
        System.out.println("After merging with stateMap: " + linkedHashMap);

        
        linkedHashMap.remove(5);
        System.out.println("After removing key 5: " + linkedHashMap);

       
        boolean isEmpty = linkedHashMap.isEmpty();
        System.out.println("Is the map empty? " + isEmpty);

        
        linkedHashMap.clear();
        System.out.println("After clearing the map is it empty? " + linkedHashMap.isEmpty());
        
       	

	}

}
