package interview.Java.Programs;

public class VovelsAndConsonantCount {

	public static void main(String[] args) {
		String str = "automation";

		int vovels = 0;
		int consonant = 0;
        for(int i=0; i<str.length(); i++) {
        char ch= 	str.charAt(i); 
        if(ch=='a'|| ch=='e'|| ch=='i'||ch=='o'||ch=='u') {
        	vovels++; 
        }
        else {
        	consonant++;
        }
        }
        System.out.println("original string ::"+ str);
        System.out.println("count of vovels::"+vovels);
        System.out.println("count of Consonant  ::"+ consonant);
	}
	

}
