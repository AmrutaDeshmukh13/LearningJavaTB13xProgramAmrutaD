package ex_09_If_Condition;
import java.util.Scanner;
public class TriangleWithIf {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();

        if (a==b&&a==c)
        {
            System.out.println("equilateral");
        }
        else if((a==b )||(b==c) ||(a==c)){
            System.out.println("isosceles ");
        }
        else
            System.out.println("scalene ");
    }
}
