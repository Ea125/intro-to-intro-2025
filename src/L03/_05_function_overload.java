package L03;

public class _05_function_overload {
    /*
    בג'אווה יש לנו מגנון נחמד של העמסת פונקציות.
    זה אומר שאנחנו יכולים שיהיו לנו פונקציות עם אותו שם ואותו ערך החזרה וההבדל בינהן יהיה הערך החזרה
     */

    public static int min(int x, int y) {
        if (x < y) {
            return x;
        }

        // אם אנחנו פה אז y קטן יותר
        return y;
    }

    public static int min(int x, int y, int z) {
        if (x < y && x < z) {
            return x;
        }

        // אם אנחנו פה x בטוח לא המינימום אז צריך לבדוק אם y או z הוא המינימום
        if (y < z) {
            return y;
        }

        // אם אנחנו פה אז בטוח z המינימום

        return z;
    }


}
