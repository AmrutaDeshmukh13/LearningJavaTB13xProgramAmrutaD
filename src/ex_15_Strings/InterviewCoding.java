package ex_15_Strings;
import java.util.Scanner;

public class InterviewCoding {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Name");
        String name=scanner.next();
        //String name = "mdam";
        String RevString = "";

        for (int i = name.length() - 1; i >= 0; i--) {
            RevString = RevString + name.charAt(i);
        }
        if (name.equalsIgnoreCase(RevString)) {
            System.out.println(name + " is palindrome");
        } else {
            System.out.println(name + " is not palindrome");
        }

    }

}
