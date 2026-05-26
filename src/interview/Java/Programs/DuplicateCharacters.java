package interview.Java.Programs;

public class DuplicateCharacters {

    public static void main(String[] args) {
        String str = "programming"; 
        char ch[] = str.toCharArray();
        int count=0;
        System.out.println("Duplicate characters in the string '" + str + "':");
        
        // Outer loop: Select a character
        for(int i = 0; i < ch.length; i++) {
            count = 1; 
            
            // Inner loop: Compare it with the REST of the characters
            for(int j = i + 1; j < ch.length; j++) {
                if(ch[i] == ch[j] && ch[i] != '0') {
                    count++;
                    // Set ch[j] to '0' to avoid printing the same duplicate again
                    ch[j] = '0'; 
                }
            }
            
            // If the character appeared more than once and isn't marked as visited
            if(count > 1 && ch[i] != '0') {
                System.out.println(ch[i] + " appears " + count + " times");
            }
        }
        
    }
}