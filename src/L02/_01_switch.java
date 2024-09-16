package L02;

public class _01_switch {
    /*
    לפעמים נרצה לבדוק ערך מסוים ולפיו לבצע פעולה מסוימת.
    כאשר יש לנו רשימה של אפשרויות קבועות נוכל להשתמש במבנה switch-case.

    המבנה מקבל ערך ובודק אותו נגד רשימת אפשרויות.
     */

    public static void main(String[] args) {
        int x = 2;

        switch (x) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Other");
        }

        /*
        כאשר התוכן של המשתנה x הוא 2 נדפיס את המחרוזת "Two".
        כאשר התוכן של המשתנה x הוא 1 נדפיס את המחרוזת "One".
        כאשר התוכן של המשתנה x הוא 3 נדפיס את המחרוזת "Three".
        כל ערך אחר ידפיס את המחרוזת "Other".
         */
    }
}
