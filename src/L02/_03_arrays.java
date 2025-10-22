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
        Scanner scanner = new Scanner(System.in);
        //<type>[] <name> = new <type>[<number of vars>];
        int[] grades = new int[30];
        // int grades[] = new int[30]; // C-style
        // השמה למערך
        //[][][][]...[]
       for (int i = 0; i < 30; i++) {
         grades[i] = i + 1;
      }
        //תרגיל, איך נדפיס?
        for (int i = 0; i < 30; i++) {
            System.out.print(grades[i] + " ");
        }
        System.out.println();

        /*
        נשים לב שכמו בסטרינגים גם במערכים האינדקס מתחיל מ-0
        כלומר במערך בגודל 30 האיבר הראשון יהיה באינדקס 0 והאחרון יהיה באינדקס 29
         */

//         שגיאות - אם ננסה לגשת לאינדקס שלא קיים נקבל שגיאת בזמן הרצת התוכנית
  //       System.out.println(grades[30]); // ArrayIndexOutOfBoundsException
  //       grades[-1] = 5; // ArrayIndexOutOfBoundsException


        // אורך של מערך
        // כדי לקבל את מספר האיברים שיש במערך נשתמש במאפיין length
        System.out.println("The length of the array is " + grades.length);
        int last = grades[grades.length - 1];


        /*
        אם ננסה לבצע השמה של מערך אחד למערך אחר נקבל התנהגות טיפה מוזרה.
         */
        //arr1 = [I@1be6f5c3 [91][82][73]
        int[] arr1 = {91, 82, 73}; // השמה של ערכים באתחול
        int[] arr2 = arr1; // {91,82,73}
        arr2[2] = 5; //91,82,5
        //int x = 73;
        //x = 5;
        System.out.println(arr1[0]);

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
        for (int num : arr2) {
            System.out.println(num);
        }
        //arr1 -> {5,82,73}
        //num = 5
        //num = 82


        // דרך נוחה להדפסת מערך
        // נוכל להעזר בפונקצייה מובנת שתדפיס את המערך בצורה יפה
        //מערך הוא בעצם סוג של אובייקט...
        String[] names = {"Alice", "Bob", "Charlie"};
        System.out.println(Arrays.toString(arr1));// [Alice, Bob, Charlie]
        int[] nums = {1, 2, 3, 4, 5};
        //5,1,2,3,4
        int[] nums2 = new int[nums.length];
        for (int i = 0; i < nums.length - 1; i++) {
            nums2[i + 1] = nums[i];
        }
        nums2[0] = nums[(nums.length - 1)];

        System.out.print("the array is: ");
        for (int num : nums2) {
            System.out.print(num + " ");
        }
    }
}
