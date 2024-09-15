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


    }
}
