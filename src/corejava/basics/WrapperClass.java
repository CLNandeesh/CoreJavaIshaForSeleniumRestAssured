package corejava.basics;

public class WrapperClass {
    public static void main(String[] args) {
        String a="11";
        String b="11.11";
        String c="X";
        String d="true";

        System.out.println(Integer.parseInt(a)+" "+Double.parseDouble(b)+" "+Boolean.parseBoolean(d));


    }
}
