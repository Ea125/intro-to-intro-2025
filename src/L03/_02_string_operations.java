package L03;

import java.util.Scanner;

public class _02_string_operations {
    /*
    עד עכשיו לא ממש התעסקנו עם אובייקטים שונים חוץ מהטיפוסים הפרימיטיביים (וScanner)

    ראינו גם את הטיפוס String שהוא טיפוס שמיועד לשמירת מחרוזות.

    עכשיו נלמד איזה פעולות אפשר לבצע עם הטיפוס הזה
     */

    public static void main(String[] args) {
        /*
        // יצירת מחרוזת
        String s = "Hello, World!";

        // השוואה של שתי מחרוזות
        // הפעם לא נשתמש ב== אלא בפעולת equals
        // (כנראה שאם נשתמש ב== זה יעבוד אבל זה לא תמיד יעבוד)
        System.out.println("Enter a string:");
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        System.out.println("Enter another string:");
        String b = scanner.nextLine();

        // השוואת מחרוזות
        if (a.equals(b)) {
            System.out.println("The strings are equal");
        } else {
            System.out.println("The strings are not equal");
        }

        // השוואת מחרוזות בלי קשר לאותיות גדולות וקטנות
        if (a.equalsIgnoreCase(b)) {
            System.out.println("The strings are equal ignoring case");
        } else {
            System.out.println("The strings are not equal ignoring case");
        }

        // בדיקה האם מחרוזת מתחילה במחרוזת אחרת
        if (a.startsWith("Hello")) {
            System.out.println("The string starts with Hello");
        } else {
            System.out.println("The string does not start with Hello");
        }


        // הדפסת מחרוזת
        System.out.println(s);

        // אורך מחרוזת
        System.out.println(s.length());

        // לקיחת תו ממקום מסוים במחרוזת
        System.out.println(s.charAt(0)); // מתחיל מ-0
        System.out.println(s.charAt(2)); // התו השלישי - l

        // חיתוך מחרוזת - לקבל חלק מהמחרוזת
        // מהאינדקס 0 כולל עד האינדקס 5 לא כולל
        System.out.println(s.substring(0, 5)); // Hello (אינקס 5 זה כבר הרווח, מתחיל מ-0)

        // חיפוש מחרוזת בתוך מחרוזת
        // יחיזר את האינדקס שבו מתחילה המחרוזת שאנחנו מחפשים או -1 אם לא נמצא
        System.out.println(s.indexOf("World"));
        System.out.println(s.indexOf("Java"));

        // החלפת מחרוזת במחרוזת
        // מחזיר מחרוזת חדשה שתכיל את המחרוזת החדשה במקום המחרוזת הישנה
        System.out.println(s.replace("World", "Java"));

        // המרת מחרוזת לאותיות גדולות
        System.out.println(s.toUpperCase());

        // המרת מחרוזת לאותיות קטנות
        System.out.println(s.toLowerCase());

        // המרת מספר למחרוזת
        int x = 10;
        String x_str = String.valueOf(x);
        String x_str2 = x + "";

        System.out.println(x_str);

        // המרת מחרוזת למספר
        String y_str = "20";
        int y = Integer.parseInt(y_str);
        System.out.println(y);
        */
        // פיצול מחרוזת למערך מחרוזות - עדיין לא ראינו מערכים
        String s = "10+5+6";
        String[] parts = s.split("\\+");
        for (String part : parts) {
            System.out.println(part);
        }
    }

}
