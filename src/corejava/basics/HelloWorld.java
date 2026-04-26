package corejava.basics;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Sai Ram.........!");
        System.out.println(200-300*55/9);
        System.out.print("Hello \t APPU SIR, I am Comming SOON"); //Tab space
        System.out.println("\b"); //Backspace
        System.err.println("ERROR 1"); //Second Last statement printed in the console after all the statements
        System.out.println("After ERROR message I will not be printed, I will be " +
                "printed before the error message");
        System.err.println("ERROR 2"); //Last statement to be printed
    }
}
