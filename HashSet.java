package cisco.java.programs;

import java.util.LinkedHashSet;

public class HashSet {
    public static void main(String[] args) {
        
     LinkedHashSet hs = new LinkedHashSet();
     
     hs.add("Fruits");
     hs.add(true);
     hs.add(4500);
     hs.add(100.00f);
     hs.add(new String("Veggies"));
     hs.add('K');
     
     System.out.println(" Hashset is " + hs);
     
     System.out.println(hs.contains(4500));
     
     System.out.println("is hasset empty or not" + hs.isEmpty());
     
     System.out.println("is hasset size " +hs.size());
     
     hs.remove(true);
     System.out.println(" Hashset is " + hs);
     
     hs.clear();
     System.out.println(" Hashset is empties now " + hs);
    }
}

