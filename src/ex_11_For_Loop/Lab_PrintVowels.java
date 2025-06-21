package ex_11_For_Loop;
import java.util.Scanner;
public class Lab_PrintVowels {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.next();

        for (int i=0;i<name.length();i++){
            if (name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(0)=='u'){
                System.out.println(name.charAt(i));
            }
        }
    }
}
