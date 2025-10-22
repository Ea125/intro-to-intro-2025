package L03;

import java.util.Arrays;

public class _08_array_operations {
    /*
    כמו מחרוזות גם למערכים יש פעולות מובנות שעוזרות לנו לעבוד איתם
     */

    public static void main(String[] args) {
        // יצירת מערך
        int[] arr = {1, 2, 3, 4, 5};

        // אורך מערך
        System.out.println(arr.length);

        // לקיחת ערך ממקום מסוים במערך
        System.out.println(arr[0]); // מתחיל מ-0
        System.out.println(arr[2]); // הערך השלישי - 3

        // שינוי ערך במערך
        arr[0] = 10;
        System.out.println(arr[0]);

        /*
        הסיפרייה Arrays
        בג'אווה יש סיפרייה שנקראת Arrays שמכילה פעולות נוספות שאפשר לבצע על מערכים

        כדי לייבא (להשתמש) בסיפרייה צריך לכתוב את השורה הבאה בראש הקוד
        import java.util.Arrays;
         */

        // יצירת מערך
        int[] array = {1, 2, 3, 4, 5};
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // הדפסת מערך
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.deepToString(matrix));


        // מיון מערך - סידור הערכים מהקטן לגדול
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        // חיפוש במערך
        // אם הערך נמצא במערך יחזיר את האינדקס שבו הוא נמצא
        // אם הערך לא נמצא במערך יחזיר -1
        System.out.println(Arrays.binarySearch(array, 3));
        System.out.println(Arrays.binarySearch(array, 6));

        // העתקת מערך
        // מקבל מערך ומספר שאומר כמה תאים להעתיק
        // ומחזיר מערך חדש עם הערכים האותו ערכים
        int[] copy = Arrays.copyOf(array, array.length); // מעתיק את כל המערך
        int[] copy_range = Arrays.copyOfRange(array, 1, 3); // מעתיק מהאינדקס 1 כולל עד האינדקס 3 לא כולל

        System.out.println(Arrays.toString(copy));
        System.out.println(Arrays.toString(copy_range));

        // השוואת מערכים
        int[] a1 = {1, 2, 3};
        int[] a2 = {1, 2, 3};

        System.out.println(Arrays.equals(a1, a2));

        a1[0] = 10;
        System.out.println(Arrays.equals(a1, a2));

        // יצירת מערך חדש עם ערכים חוזרים
        int[] repeat = new int[5];
        Arrays.fill(repeat, 10);
        System.out.println(Arrays.toString(repeat));
    }
}
