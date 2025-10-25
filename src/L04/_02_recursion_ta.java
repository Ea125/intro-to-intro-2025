package L04;

public class _02_recursion_ta {

    /*
    כתוב פונקציה רקורסיבית שמחשבת סכום של שני מספרים חיוביים, כאשר מותר להשתמש ב+1 וב-1.


    האתגר כאן זה איך לפרק את הבעיה לבעיות קטנות יותר.
    כלומר איך לחשב את הסכום של שני מספרים חיוביים באמצעות קסם.
    אז אפשר להגיד ש
    a + b = a + (b-1) + 1

    מקרה הבסיס כאן הוא כאשר b=0, אז הסכום של a ו0 הוא a.
     */
    public static int add(int a, int b) {
        //a - 1
        //a + 1
        //b - 1
        //b + 1
        //b = 1 + 1 +....+1
        if(b == 1){
            return 1;
        }
        return a + add(a, b - 1) + 1;
    }


    public static int mul(int a, int b) {
        //a - 1
        //a + 1
        //b - 1
        //b + 1
        if(b == 0){
            return 0;
        }
        if(b == 1){
            return a;
        }

        //a * b = a + a * (b-1)
        //
        return mul(a, b - 1) + a;
    }

    public static int power(int a, int b) {
        if(b == 0){
            return 1;
        }
        if(b == 1){
            return a;
        }
        return power(a, b - 1) * a;
    }
    public static void main(String[] args) {
        System.out.println(add(1,2));
        System.out.println(add(10,2));
        System.out.println(mul(10,2));
        System.out.println(mul(1,10));
        System.out.println(power(2,3));


    }



    /*
    כתוב פונקציה רקורסיבית שמחשבת את הכפל של שני מספרים חיוביים, כאשר מותר להשתמש ב+ ו- בלבד


    גם כאן, נצטרך לראות איך מפרקים את הבעיה לבעיות קטנות יותר.

    כלומר איך לחשב את הכפל של שני מספרים חיוביים באמצעות קסם.

    אפשר להגיד ש
    a * b = a * (b-1) + a

    כלומר אם נצליח לחשב את הכפל של a וb-1, אז נוכל לחשב את הכפל של a וb.

    מקרה הבסיס כאן הוא כאשר b=0, אז הכפל של a ו0 הוא 0.
     */



    /*
    תכתבו פונקציות רקורסיביות שמחשבות את החזקה של מספר חיובי.
    כתבו פונקציה שמחשבת מודולו של מספר חיובי.
    כתבו פונקציה חילוק של מספרים חיוביים.
     */

}

/*


public static int sum(int a, int b) {
        if (b == 0) {
            return a;
        }
        return sum(a, b - 1) + 1;
    }



    public static int multiply(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return multiply(a, b - 1) + a;
    }
*/
