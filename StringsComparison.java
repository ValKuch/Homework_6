package org.JavaHW;

import java.util.Scanner;

public class StringsComparison {   //Task1
    static Scanner scanner = new Scanner(System.in);

    public static boolean isEqual(String str1, String str2) {
        return str1.equals(str2);
    }

    public static void main(String[] args) {

        System.out.println("Enter a string of characters");
        String str1 = scanner.nextLine();
        System.out.println("Enter another string of characters");
        String str2 = scanner.nextLine();
        System.out.println("Case-sensitive comparison:");
        System.out.println("Are these strings equal? " + isEqual(str1, str2));
    }
}

/* Task2
public class StringExtractor {
static Scanner scanner = new Scanner(System.in);
public static String getSubstring(String str, int firstIndex, int lastIndex){
        return str.substring (firstIndex,lastIndex);
    }
    public static void main(String[] args) {
        System.out.println("Enter a string of characters");
        String str = scanner.nextLine();
        System.out.println("Enter the first index");
        int firstIndex = scanner.nextInt();
        System.out.println("Enter the last index");
        int lastIndex = scanner.nextInt();
        String receivedSubstring = getSubstring(str, firstIndex, lastIndex);
        System.out.println("Substring between indices " + firstIndex + " and " + lastIndex + ": " + receivedSubstring);
    }
}

Task3
public class SubstringIndex {
    static Scanner scanner = new Scanner(System.in);

    public static int getSubstringIndex(String str1, String str2) {
        int index = str1.indexOf(str2);
        return index;
    }
    public static void main(String[] args) {
        System.out.println("Enter a string of characters");
        String str1 = scanner.nextLine();
        System.out.println("Enter a substring to be found");
        String str2 = scanner.nextLine();

        int index = getSubstringIndex(str1, str2);
        if (index != -1) {
            System.out.println("Substring '" + str2 + "' found at index " + index);}
            else {
            System.out.println("Substring '" + str2 + "' is not found");}

    }

        }

Task4
public class StringModifier {
    static Scanner scanner = new Scanner(System.in);

    public static String replaceSubstring(String wholeString, String oldSubstring, String newSubstring) {
        String modifiedString = wholeString.replace(oldSubstring,newSubstring);
        return modifiedString;
    }
    public static void main(String[] args) {
        System.out.println("Enter a string of characters");
        String wholeString = scanner.nextLine();
        System.out.println("Enter a substring that has to be replaced");
        String oldSubstring = scanner.nextLine();
        System.out.println("Enter a substring to replace with");
        String newSubstring = scanner.nextLine();

        String modifiedString = replaceSubstring(wholeString, oldSubstring, newSubstring);
            System.out.println("The new modified string: " + modifiedString);}

    }
 */