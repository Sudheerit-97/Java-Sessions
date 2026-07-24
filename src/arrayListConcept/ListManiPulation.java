package arrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListManiPulation {

	public static void main(String[] args) {
     ArrayList<String> browserList= new ArrayList<String>(Arrays.asList("firefox","chrome","sfari")); 
     System.out.println(browserList);
     browserList.add("Opera"); 
     System.out.println(browserList);
     
     System.out.println(browserList.get(0));
     
     System.out.println(browserList.indexOf("chrome"));
     
     ArrayList<String> osList= new ArrayList<String>(Arrays.asList("android","linux","macOS")); 
     browserList.addAll(osList); 
     System.out.println(browserList);
     
     browserList.removeAll(osList); 
     System.out.println(browserList);
     
     ArrayList<String> subList= new ArrayList<String>(Arrays.asList("android","macOS"));
     
     System.out.println(osList.containsAll(subList));
     

     ArrayList<Integer> numList= new ArrayList<Integer>(Arrays.asList(5,50,11,30,15,20));
     System.out.println(numList);
//     Collections.sort(numList);
//     System.out.println(numList);
     
     Collections.swap(numList, 0, 1);
     System.out.println(numList);
     
     List<Object>testList= Collections.emptyList();// we won't be able to add any data in emptyList
    // testList.add("sudheer");
   // System.out.println(testList);//java.lang.UnsupportedOperationException
    
    
    // Remove dupliate from ArrayList
    
     ArrayList<Integer> numlist = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 4, 4, 5, 6));

    LinkedHashSet<Integer> removeDup = new LinkedHashSet<>(numlist);
    ArrayList<Integer> num = new ArrayList<>(removeDup);

    System.out.println(num);
    // 2nd way
    
    ArrayList<Integer> nu = new ArrayList<>(Arrays.asList(10,10, 1, 1, 2, 3, 4, 4, 5, 6));
     Set<Integer> re= new TreeSet<Integer>();
     for(int i=0; i<nu.size(); i++) {
    	 re.add(nu.get(i));
     }
     
     
     
   System.out.println(re);
    
    String name = "ssudheer"; 
    ArrayList<Character> nameList= new ArrayList<>(); 
    
    for(char st: name.toCharArray()) {
  	  nameList.add(st);
  	  nameList.retainAll(Collections.singleton('d')); 
  	
    }
    System.out.println(nameList);
     
     
	}

}
