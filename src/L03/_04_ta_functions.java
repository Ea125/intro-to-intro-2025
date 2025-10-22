package L03;

public class _04_ta_functions {

    //כתוב פונקצייה שמקבלת שני מספרים ממשיים (double או float) ומחזירה את התוצאה של החילוק שלהם.
    // אם המחלק הוא 0 החזר 0
    public static float div(float num, float divider) {
        if (divider == 0) {
            return 0;
        }
        return num / divider;
    }



    // כתוב פונקציה שמקבלת תו (char) ומספר שלם חיובי n ומדפיסה את התו n פעמים
    public static void printChar(char ch, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(ch + " ");
        }
    }

    // כתוב פונקציה שמחשבת עצרת עבור מספר טבעי n
    // אם n קטן מ0 החזר -1
    public static int factorial(int n) {
        int i = 1;
        int fact = 1;
        while (i <= n) {
            fact  = i * fact;
            i++;
        }
        return fact;
    }




    public static void main(String[] args) {
        float result = div(2, 3);
        System.out.println(result);
        result = div(2, 0);
        System.out.println(result);
        printChar('A', 5);
        int factorial = factorial(5);
        System.out.println(factorial);



    }



}





//cheat sheet
/*//כתוב פונקצייה שמקבלת שני מספרים ממשיים (double או float) ומחזירה את התוצאה של החילוק שלהם.
    // אם המחלק הוא 0 החזר 0

    public static double div(double x, double y) {
        if (y == 0) {
            return 0;
        }
        return x / y;
    }

    // כתוב פונקציה שמקבלת תו (char) ומספר שלם חיובי n ומדפיסה את התו n פעמים
    public static void printNTimes(char ch, int n) {
        if (n <= 0) {
            // אם העבירו מספר שהוא לא חיובי, אין לנו מה לעשות בפונקציה
            // אז המילה השמורה return עוזרת לנו לסיים אותה
            return;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(ch);
        }
    }


    // כתוב פונקציה שמחשבת עצרת עבור מספר טבעי n
    // אם n קטן מ0 החזר -1
    public static int factorial(int n) {
        if (n < 0) {
            return -1;
        }

        if (n == 0) {
            return 1;
        }

        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i; // result = result * i;
        }

        return result;
    }
* */
