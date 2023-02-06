package assessment;
import java.util.Scanner;

public class Encryption {
    public static String encryptString(String string1, String string2) {
        StringBuilder encryptedString = new StringBuilder();
        for (int i = 0; i < string1.length(); i++) {
            char char1 = string1.charAt(i);
            char char2 = string2.charAt(i);
            char encryptedChar = (char) ((char1 + char2 - 194) % 26 + 98);
            encryptedString.append(encryptedChar);
        }
        return encryptedString.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String string1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String string2 = scanner.nextLine();

        System.out.println("Encrypted string: " + encryptString(string1, string2));
    }
}

