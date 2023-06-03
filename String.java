import java.util.*;
import java.lang.*;



public class String {
    public static boolean canConstruct(java.lang.String ransomNote, java.lang.String magazine) {
        Map<Character, Integer> charCount = new HashMap<>();
        
        // Count the frequency of each character in the magazine
        for (char c : magazine.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        
        // Check if we can construct the ransomNote
        for (char c : ransomNote.toCharArray()) {
            if (charCount.containsKey(c)) {
                int count = charCount.get(c);
                if (count > 0) {
                    charCount.put(c, count - 1);
                } else {
                    return false;  // Not enough occurrences of the character in the magazine
                }
            } else {
                return false;  // Character not found in the magazine
            }
        }
        
        return true;  // All characters of ransomNote found in magazine
    }
    public static void main(String[] args) {
        java.lang.String ransomNote = "aabbcc";
        java.lang.String magazine = "aabbcdef";
        System.out.println(canConstruct(ransomNote, magazine));  


    }
    
}
