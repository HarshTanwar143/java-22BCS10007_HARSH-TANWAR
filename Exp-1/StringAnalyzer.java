import java.util.Scanner;

public class StringAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String st = scanner.nextLine(); // Take input from user

        int vowels = 0;
        int consonants = 0;
        int digits = 0;

        st = st.toLowerCase(); 
        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                ++vowels;
            } 
            else if (ch >= 'a' && ch <= 'z') {
                ++consonants;
            } 
            else if (ch >= '0' && ch <= '9') {
                ++digits;
            }
        }

        System.out.println("Total number of vowels: " + vowels);
        System.out.println("Total number of consonants: " + consonants);
        System.out.println("Total number of digits: " + digits);
    }
}
