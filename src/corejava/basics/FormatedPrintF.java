package corejava.basics;

/*
// .printf() --> Prints the data in a formatted way

// %d --> Represents an Integer
// %s --> Represents a String
// %f --> Represents a float value
// %c --> Represents a character
// %b --> Represents a boolean

System.out.printf("Value of the third variable is %d and value of fourth variable is %c", a4, b5);
*/

public class FormatedPrintF {
    public static void main(String[] args) {
        int a = 100;
        double d = 23.4444;
        String s = "Appu";
        char c = 'X';
        boolean b=true;
        System.out.printf("Value is %d %f %s %c %b", a, d, s, c,b);
    }
}
