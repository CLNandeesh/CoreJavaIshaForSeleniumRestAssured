package corejava.basics;

import java.lang.constant.Constable;

public class StringAndItsFunctions {
    public static void main(String[] args) {
        String s = "Lorem ipsum dolor sit amet, consectetur adipiscing";

        System.out.println(s.length());
        System.out.println(s.substring(1, 10));
        System.out.println(s.substring(45));
        System.out.println(s.compareToIgnoreCase("appu"));
        System.out.println(s.trim());
        System.out.println(s.getBytes());
        System.out.println(s.contains("sit"));
        System.out.println(s.replace('o', '1'));
        System.out.println(s.indexOf("amet"));
        System.out.println("  ".isBlank());
        System.out.println("".isEmpty());
        System.out.println("appu".concat(" raj"));
        System.out.println(s.split(" "));
        System.out.println(s.matches("^.{50}$"));

        System.out.println("Sai Ram ".repeat(4));
        System.out.println(s.charAt(10));

        //first and last occurence
        System.out.println(s.lastIndexOf('i'));
        System.out.println(s.indexOf('i'));

        //Provides the ASCII value
        System.out.println(s.codePointAt(0));

        //ASCII value of the character
        int a='L';
        System.out.println(a);

        System.out.println("*".repeat(50));
        //Trim
        System.out.println("  appu".stripLeading());
        System.out.println("   appu   ".stripTrailing());
        System.out.println("  appu  ".strip());
        System.out.println("  ap p u   ".strip());
        System.out.println("  ap p u   ".trim());

        //To convert string to constant value - Cannot perform any string operations
        Constable c=s.describeConstable().get();
        System.out.println(c.describeConstable());
        System.out.println(c);

    }
}
