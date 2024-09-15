package L01;

public class _06_if_statement {
    /*
    משפטי תנאי הם אבן בסיס בכל תוכנה אמיתית.

    כאשר אנחנו רוצים לבצע פעולה רק אם תנאי מסוים מתקיים אנו משתמשים במשפטי תנאי.
     */

    public static void main(String[] args) {
        int x = 10;
        int y = 20;

//        Scanner scanner = new Scanner(System.in);
//        int x = scanner.nextInt();
//        int y = scanner.nextInt();

        // אם x גדול מ y
        if (x > y) {
            System.out.println("x is greater than y");
        }

        // אם x קטן מ y
        if (x < y) {
            System.out.println("x is less than y");
        }

        // אם x שווה ל y
        if (x == y) {
            System.out.println("x is equal to y");
        }

        // אם x לא שווה ל y
        if (x != y) {
            System.out.println("x is not equal to y");
        }

        // אם x גדול או שווה ל y
        if (x >= y) {
            System.out.println("x is greater than or equal to y");
        }

        // אם x קטן או שווה ל y
        if (x <= y) {
            System.out.println("x is less than or equal to y");
        }
    }

    static void is_even(int x) {
        if (x % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }


    static void sort_4(int a, int b, int c, int d) {
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        // a = min(a, b), b = max(a, b)

        if (c > d) {
            int temp = c;
            c = d;
            d = temp;
        }

        // c = min(c, d), d = max(c, d)

        if (a > c) {
            int temp = a;
            a = c;
            c = temp;
        }

        // a = min(a,b,c,d)

        if (b > d) {
            int temp = b;
            b = d;
            d = temp;
        }

        // d = max(a,b,c,d)

        if (b > c) {
            int temp = b;
            b = c;
            c = temp;
        }

        // now we need to sort b and c

        System.out.println(a + " " + b + " " + c + " " + d);
    }



}
