package ex_08_IncrementDecrementOperator;

public class Task_06 {
    public static void main(String[] args) {
        int x = 5;

        int y = x++ + ++x + x++ + ++x;
       //5+7+7+9=28
        System.out.println("x = " + x + ", y = " + y);
        //y=28
        //x=9
    }
}
