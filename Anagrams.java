package anagrams;
import java.util.Arrays;
import java.util.Scanner;
public class Anagrams {


public static String Korektor(String string) {
int len = string.length();
StringBuilder white = new StringBuilder(len);
char c;
for (int i = (len - 1); i >= 0; i--) {
c = string.charAt(i);
if (Character.isLetter(c)) {
white.append(c);
}
}

return white.toString();
}

public static String sort(String string) {
char[] charArray = string.toCharArray();

java.util.Arrays.sort(charArray);

return new String(charArray);
}
public static boolean areAnagrams(String string1, String string2) {

String wCopy1 = Korektor(string1);
String wCopy2 = Korektor(string2);

wCopy1 = wCopy1.toLowerCase();
wCopy2 = wCopy2.toLowerCase();

wCopy1 = sort(wCopy1);
wCopy2 = sort(wCopy2);

return wCopy1.equals(wCopy2);
}

public static void main(String[] args) {
Scanner input = new Scanner(System.in);
String string1 = input.nextLine();
String string2 = input.nextLine();
input.close();
System.out.println();
System.out.println("Testing whether the following strings are anagrams:");
System.out.println("    String 1: " + string1);
System.out.println("    String 2: " + string2);
System.out.println();

if (areAnagrams(string1, string2)) {
System.out.println("YES!");
} else {
System.out.println("NO!");
}
System.out.println();
}
}


