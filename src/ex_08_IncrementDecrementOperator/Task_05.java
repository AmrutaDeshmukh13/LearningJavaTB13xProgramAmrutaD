package ex_08_IncrementDecrementOperator;

public class Task_05 {
    public static void main(String[] args) {
        int a = 5;

        int b = a++ + ++a;

        System.out.println("a: " + a); // Output: ?
        //7
        System.out.println("b: " + b); // Output: ?
        //5+7=12
    }
}
