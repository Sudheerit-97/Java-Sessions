package interviewArrayN;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ReverseInarrayInPlace {

	public static void main(String[] args) {
		List<Integer>rev= new LinkedList<>(); 
		rev.add(4); 
		rev.add(10);
		rev.add(15); 
		rev.add(58); 
		System.out.println(rev);
		Collections.sort(rev, Collections.reverseOrder());
		System.out.println(rev);
		for(int i=0; i<rev.size(); i++) {
			System.out.println(rev.get(i));
			
		}
}
	
}