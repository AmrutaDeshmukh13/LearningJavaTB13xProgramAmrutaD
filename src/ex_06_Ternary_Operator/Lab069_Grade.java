package ex_06_Ternary_Operator;

public class Lab069_Grade {
    public static void main(String[] args) {
        byte marks = 70;
         //Description: Marks 90 = A+, 75 = A, 60 = B, 40 = C, below 40 Fail.
        //90=A+
        //75 to 89=A
       // 60 to 74= B
        //40 to59 = C
        // below 40 fail



        String grade = (marks >= 90) ? "A+" : (marks >= 75 && marks < 90) ? "A" : (marks >= 60 && marks < 75) ? "B" : (marks >= 40 && marks < 60) ? "C" : "Fail";

        System.out.println(grade);
    }
}
