package L02;

import java.util.Arrays;
import java.util.Scanner;

public class _03_arrays {

    /*
    מערכים הם כלי חשוב בתכנות שמאפשר לנו לשמור סדרה של ערכים מאותו הסוג במשתנה אחד.

    לדוגמא אם נרצה לשמור את ציוני תלמידים בכיתה נוכל להשתמש במערך.


    המערך נשמר ברצף בזכרון ולכל תא במערך יש מספר שלם שמיוצג על ידי אינדקס.

    כאשר אנחנו מקצים משנה מסוג מערך אנחנו צריכים להגיד לו באיזה גודל הוא יהיה, וjava אוטומטית תאתחל את כל הערכים לערך הברירתי של הטיפוס.

    ערכי ברירת מחדל של טיפוסים שונים:
    int - 0
    double - 0.0
    boolean - false
    char - 0 (/u0000)
    String - null
     */

    public static void main(String[] args) {
        // צורה לא טובה לשמירת 30 ערכים
        int grade1, grade2, grade3 /*...*/, grade30;

        // יצירת מערך
        int[] grades = new int[30];
        // int grades[] = new int[30]; // C-style
        Scanner scanner = new Scanner(System.in);
        // השמה למערך
//        for (int i = 0; i < 30; i++) {
//            System.out.println("Enter grade number " + (i + 1));
//            grades[i] = scanner.nextInt();
//        }

        /*
        נשים לב שכמו בסטרינגים גם במערכים האינדקס מתחיל מ-0
        כלומר במערך בגודל 30 האיבר הראשון יהיה באינדקס 0 והאחרון יהיה באינדקס 29
         */

        // שגיאות - אם ננסה לגשת לאינדקס שלא קיים נקבל שגיאת בזמן הרצת התוכנית
        // System.out.println(grades[30]); // ArrayIndexOutOfBoundsException
        // grades[-1] = 5; // ArrayIndexOutOfBoundsException


        // אורך של מערך
        // כדי לקבל את מספר האיברים שיש במערך נשתמש במאפיין length
        System.out.println("The length of the array is " + grades.length);


        /*
        אם ננסה לבצע השמה של מערך אחד למערך אחר נקבל התנהגות טיפה מוזרה.
         */
        int[] arr1 = {1, 2, 3}; // השמה של ערכים באתחול
        int[] arr2 = arr1;
        arr2[0] = 5;
        System.out.println(arr1[0]); // 5

        /*
        אם נריץ את התוכנית נקבל 5 ולא 1, למרות שהשינוי נעשה על ידי המערך arr2 ולא arr1.

        זה בגלל הדרך שבה מערכים מאוחסנים בזיכרון.

        כשאני מכריז על מערך חדש כמו arr1 מה שאני מקבל זה כתובת שבה המערך מאוחסן בזיכרון.
         */
        System.out.println(arr1); // [I@37a71e93

        /*
        בעצם מה שהודפס זה הכתובת שבה המערך מאוחסן בזיכרון.

        אז כאשר אני מבצע השמה של מערך למערך אחר אני מעביר את הכתובת שבה המערך מאוחסן בזיכרון ולא את הערכים שבתוך המערך.
         */

        System.out.println(arr2); // [I@37a71e93

        // השוואה בין כתובות המערכים
        System.out.println(arr1 == arr2); // true

        /*
        אז נעתיק מערכים?
        ניצור מערך חדש ונעתיק את כל הערכים מהמערך הישן למערך החדש.
         */
        int[] arr3 = new int[arr1.length]; // יצירת מערך חדש באותו הגודל
        // העתקת ערכים
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        arr3[0] = 10;
        System.out.println(arr1[0]); // 5

        System.out.println(arr1 == arr3); // false


        // לולאת for מיוחדת על מערכים
        // לסוג לולאה הזאת קוראים לולאת for-each
        // היא חוסכת לנו את כל העבודה ה"מלוכלכת" ונותנת לנו רק את הערכים שמעניינים אותנו
        for (int num : arr1) {
            System.out.println(num);
        }


        // דרך נוחה להדפסת מערך
        // נוכל להעזר בפונקצייה מובנת שתדפיס את המערך בצורה יפה
        String[] names = {"Alice", "Bob", "Charlie"};
        System.out.println(Arrays.toString(names)); // [Alice, Bob, Charlie]

    }
}
