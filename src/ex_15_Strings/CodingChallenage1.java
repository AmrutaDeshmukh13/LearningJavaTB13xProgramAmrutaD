package ex_15_Strings;

public class CodingChallenage1 {
    public static void main(String[] args) {
        //string functions
        String s="Hello World";
        int len=s.length();
        char c=s.charAt(0);
        String part= s.substring(6,11);
        System.out.print("Length: "+len +" First char: "+ c+ " Substring: "+part);
    }
}
