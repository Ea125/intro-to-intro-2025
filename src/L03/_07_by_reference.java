package L03;

public class _07_by_reference {
    /*
    בג'אווה אנחנו מחלקים את המשתנים לשני סוגים:
    1. פרימיטיביים - כמו int, double, char,boolean וכדומה
    2. אובייקטים - כמו String, Scanner, Random מערכים וכדומה

    כשאנחנו שומרים משנתה פרמיטיבים אנחנו שומרים את הערך שלהם בזיכרון.

    אבל כשאנחנו שומרים אובייקטים אנחנו שומרים רק את הכתובת שלהם בזיכרון.
    כתובת זה בעצם הפנייה לאובייקט בזיכרון.

    כאשר אנחנו מעבירים אובייקט לפונקציה אנחנו מעבירים את הכתובת שלו בזיכרון ולא את האובייקט עצמו.
    לכן אם נשנה את האובייקט בתוך הפונקציה זה ישפיע על האובייקט מחוץ לפונקציה.

    (יוצא דופן הוא String שהוא אובייקט אבל נתייחס אליו כפרימיטיבי)
     */


    /*
    דומגאה:
     השמה של כל הערכים במערך לערך חדש
      */
    public static void setAll(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = value;
        }
    }

    public static void addMorning(String s){
        s = s.concat(" Morning!");
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(arr);
        setAll(arr, 8);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        String s = "Good";
        addMorning(s);
        System.out.println(s);

    }
}
