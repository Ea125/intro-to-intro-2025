package L01;

public class _05_boolean_expression {
    /*
    תנאים בוליאניים הם תנאים שמחזירים ערך בוליאני - אמת או שקר.

    יש לנו כמו אופרטורים בוליאניים:
    1. וגם - &&
    2. או - ||
    3. לא - !

    נוכל להשתמש באופרטורים אלו כדי לבנות תנאים מורכבים.
     */

    public static void main(String[] args) {
        boolean t = true;
        boolean f = false;

        // וגם
        // תנאי זה יחזיר אמת רק אם שני התנאים מתקיימים
        System.out.println("T and T: " + (true && t)); // t
        System.out.println("T and F: " + (t && f)); // f
        System.out.println("F and T: " + (f && t)); // f
        System.out.println("F and F: " + (f && f)); // f

        // או
        // תנאי זה יחזיר אמת אם לפחות אחד מהתנאים מתקיים
        System.out.println("T or T: " + (t || t)); // t
        System.out.println("T or F: " + (t || f)); // t
        System.out.println("F or T: " + (f || t)); // t
        System.out.println("F or F: " + (f || f)); // f

        // לא
        // תנאי זה יחזיר אמת אם התנאי לא מתקיים
        System.out.println("Not T: " + !t);
        System.out.println("Not F: " + !f);

        /* סדר קדימות

        ישנם סדר קדימות בין האופרטורים בוליאניים:
        1. וגם
        2. או
        3. לא
         */
        System.out.println(t && t || !f);
    }
}
