package L01;

public class _04_math_arithmetic {

    public static void main(String[] args) {
        int x = 123;
        int y = 7;

        // חיבור
        int sum = x + y;

        // חיסור
        int sub = x - y;

        // כפל
        int mul = x * y;

        // חילוק
        int div = x / y;

        // שארית
        // מה יישאר אם נחלק את x ב y
        int mod = x % y;


        System.out.println("x + y = " + sum);
        System.out.println("x - y = " + sub);
        System.out.println("x * y = " + mul);
        System.out.println("x / y = " + div);
        System.out.println("x % y = " + mod);


        // הדספת ספרת האחדות של מספר
        System.out.println("x % 10 = " + x % 10);


        // אופרטור השוואה
        /*
        // קיצורים שתבינו מה זה אומר
        // gt - greater than
        // lt - less than
        // eq - equal
        // ne - not equal
        // ge - greater or equal
        // le - less or equal
         */

        boolean x_gt_y = x > y;
        boolean x_lt_y = x < y;
        boolean x_eq_y = x == y;
        boolean x_ne_y = x != y;
        boolean x_ge_y = x >= y;
        boolean x_le_y = x <= y;

        System.out.println("x=" + x + " y=" + y);
        System.out.println("x > y: " + x_gt_y);
        System.out.println("x < y: " + x_lt_y);
        System.out.println("x == y: " + x_eq_y);
        System.out.println("x != y: " + x_ne_y);
        System.out.println("x >= y: " + x_ge_y);
        System.out.println("x <= y: " + x_le_y);



    }
}
