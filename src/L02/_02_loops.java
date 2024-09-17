package L02;

import java.util.Random;

public class _02_loops {

    /*
    לולאות מאפשרות לנו לחזור על קוד מסוים כמה פעמים עד שתנאי מסוים מתקיים.

    ישנם 3 סוגי לולאות בשפת ג'אווה:
    1. לולאת while
    2. לולאת do-while
    3. לולאת for
     */

    public static void main(String[] args) {

        /*
        דוגמא ללמה אנחנו צריכים לולאות:
        נגיד ואנחנו רוצים להדפיס את המספרים מ 1 עד ל 10

        דוגמא לקוד בלי לולאה:
         */

//        System.out.println(1);
//        System.out.println(2);
//        System.out.println(3);
//        System.out.println(4);
//        // ...
//        System.out.println(10);
//
//        // זה יעבוד אבל זה לא נוח בכלל
//
//
//        // לולאת while
//        // כל עוד התנאי מתקיים הלולאה תמשיך לרוץ
//        int i = 1;
//        while (i <= 10) {
//            System.out.println(i);
//            i++; // i = i+1
//        }

        // לולאת do-while
        // הלולאה תרוץ לפחות פעם אחת ורק אז תבדוק את התנאי
//        int j;
//        Scanner sc = new Scanner(System.in);
//        do {
//            j = sc.nextInt();
//            System.out.println(j);
//        } while (j < 5);

//         לולאת for
//         נועדה ללולאות עם מספר פעמים קבוע
//        for ( int k = 0; k < 5; k++) {
//            System.out.println(k);
//        }
//
        // הדפסה של משולש הפוך
//        for (int k = 5; k > 0; k--) {
//            for (int l = 0; l < k; l++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        /*
//        לולאות for בנויות משלושה חלקים:
//        1. חלק התחלה - כאן אנחנו מאתחלים משתנים
//        2. חלק תנאי - כאן אנחנו מציינים את התנאי שבו נמשיך לרוץ בלולאה
//        3. חלק צעד - כאן אנחנו מגדילים או מקטנים את המשתנה שבתנאי
//
//        החלקים מופרדים ב- ;
//         */
//
//
        // הדפסה של מספרים זוגיים בלבד
//        for (int k = 0; k < 10; k += 2) { // k = k + 2
//            System.out.println(k);
//        }
//
        // הדפסת כל האותיות באנגלית
//        for (char c = 'a'; c <= 'z'; c++) {
//            System.out.println(c);
//        }
//
//        // הדפסת 10 מספרים רנדומליים
//        /*
//        הפונקציה Math.random() מחזירה מספר רנדומלי בין 0 ל-1
//         */
//        for (int k = 0; k < 10; k++) {
//            System.out.println(Math.random());
//        }
//
//        // הדפסת 10 מספרים רנדומליים בטווח
//        int min = 5;
//        int max = 10;
//        for (int k = 0; k < 10; k++) {
//            System.out.println((int) (Math.random() * (max - min + 1) + min));
//        }
//        /*
//        Math.random() - יחזיר מספר בין 0 ל-1
//        max - min + 1 - יחזיר את הטווח של המספרים שאנחנו רוצים
//
//        המספר הכי גדול שנוכל לקבל יהיה
//        (max - min + 1) * MAX(Math.random()) = (max - min + 1) * 1 = max - min + 1
//        כלומר את גודל טווח המספרים שאנחנו רוצים
//
//        והכי קטן יהיה 0(אם נכפיל ב-0)
//
//
//        כדי להביא את המספר שיהיה בטווח שאנחנו רוצים נצטרך להוסיף את המינימום
//         */
//
//
//        // אובייקט Random
//        // ישנה גם אפשרות ליצור אובייקט מסוג Random ולהשתמש בו כדי לקבל ערכים רנדומליים
        Random random = new Random();
//        for (int k = 0; k < 10; k++) {
//            System.out.println(random.nextInt(6) + 5); // יחזיר מספר בין 5 ל-10
//        }

//
//        // המילה השמורה break משמשת לצאת מלולאה
//        for (int k = 0; k < 10; k++) {
//            if (k == 5) {
//                break;
//            }
//            System.out.println(k);
//        }
//
        // נמשיך להגריל מספרים רנדומליים עד שנקבל 5
        while (true) {
            int r = random.nextInt(10);
            System.out.println(r);
            if (r == 5) {
                break;
            }
        }


    }


    // תרגיל:
    // חישוב עצרת
    static void factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i; // result = result * i
        }
        System.out.println(result);
    }

    /*
    תרגיל:
    כתבו קוד שמשחק במשחק FizzBazz עד מספר מסוים.
    המשחק עובד כך:
    1. אם המספר מתחלק ב-3 נדפיס Fizz
    2. אם המספר מתחלק ב-5 נדפיס Bazz
    3. אם המספר מתחלק ב-3 וגם ב-5 נדפיס FizzBazz
     */
    static void fizz_bazz(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) { // ! חשוב לבדוק קודם את המקרה הכללי (אם נבודק את אחד מהוקדמים קודם זה לא ייכנס לפה)
                System.out.println("FizzBazz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Bazz");
            } else {
                System.out.println(i);
            }
        }
    }
}
