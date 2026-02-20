package learnjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SudheerAR {

	public static void main(String[] args) {
		
		ArrayList ar = new ArrayList();
		// Garbage values we won't be use this concept
		ar.add(100);
		ar.add(200);
		ar.add(300);
		System.out.println(ar);
		
		ArrayList<String> browserList = new ArrayList <>();
		browserList.add("chrome");
		browserList.add("edge");
		browserList.add("firefox");
		browserList.add("Safari");
		System.out.println(browserList.size());// Size of the array list
		System.out.println(browserList);
		System.out.println(browserList.get(0));// Particular index value
		System.out.println(browserList.get(3));
		for (int i=0; i<=browserList.size()-1; i++) {
			System.out.println(browserList.get(i));
		}
		ArrayList<Object> list = new ArrayList <>();
		list.add(22);
		list.add("sudheer");
		list.add(33);
		list.add(53);
		list.add(null);
		list.add(true);
		System.out.println(list.size());
		System.out.println(list);
		// For the next VC 
		// VC = pc/2, Deafault VC =10 , we can intialise the VC
		// ( print the values with for each loop
		for (Object e: list) {
			System.out.println(e);
		}
		ArrayList<String> login = new ArrayList <>();
	   login.add("login");
	   login.add("forgot");
	   login.add("wishlist");
	   login.add("footer");
	   System.out.println(login);
	   System.out.println(login.size());
	   login.add(0,"sudheer");
	   login.add(5,"tanya");// add the value at particular index
	   System.out.println(login);
	   //login.add(8,"rasha");// iob bcz index was not present
	   
	   login.set(0,"macbook");// update the value on particular index
	   System.out.println(login);
		   System.out.println(login.size());
		   System.out.println(login.get(1));
		   login.remove(1);// value will be removed from the particular index
		   System.out.println(login.size());
		   System.out.println(login);
		   
		   
		   ArrayList<String> file = new ArrayList <>(Arrays.asList("chrome", "firefox","linke","edge"));
		   System.out.println(file.size());
		   System.out.println(file);
		   file.add("IE");
		   System.out.println(file.size());
		   System.out.println(file);
		   file.add(5,"IE1");
		   System.out.println(file);
		   System.out.println(file.get(5));
		   System.out.println(file.indexOf("chrome"));
		   System.out.println(file.indexOf("sudheer"));// if its not available will give -1
		   if (file.indexOf("sudheer")==-1) {
			   System.out.println("please pass the correct browser");
		   }
		   
		  System.out.println(file.size());
		  //file.removeAll(file);/// Remove the all values 
		  System.out.println(file.size());
		  ArrayList<String> oslist= new ArrayList<String>(Arrays.asList("android","macbook","windows"));
		  System.out.println(oslist.size());
		  file.addAll(oslist);// we can add the multiple list with addall method
		  System.out.println(file);
		  System.out.println(oslist); 
		  
		  file.removeAll(oslist);// remove all the oslist from file list
		  System.out.println(file);
		  
		  oslist.add(0,"unix");
		  System.out.println(oslist);
		  
		  if(oslist.contains("macbook")) {
			  System.out.println("test is passed");
		  }
		  else {
			  System.out.println("failed");
		  }
		  ArrayList<String> sublist= new ArrayList<String>(Arrays.asList("macbook","windows"));
		  System.out.println(oslist.containsAll(sublist));// it will check the values from both the list
		  
		  ArrayList<Integer>numlist = new ArrayList<Integer>(Arrays.asList(10,30,20,60,5));
		  //Collections.sort(numlist);
		  System.out.println(numlist);
		  Collections.swap(numlist, 0 , 4);
		  System.out.println(numlist);
		  
		  
		 List<Object> testList= Collections.emptyList();//empty-Imutable List
		 System.out.println(testList.size());
		 // we can't add any element in the empty list// unsupported exception
	}

}
