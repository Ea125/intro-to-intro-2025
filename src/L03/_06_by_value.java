package L03;


public class _06_by_value {
    /*
    כאשר אנחנו מעבירים לפונקציה פרמטר, הוא משוכפל, ולא נוכל לעשות עליו שינויים
     */

    public static void increment(int x){
        System.out.println("x in func before: " + x); // 5
        x++;
        System.out.println("x in func after: " + x); // 6
    }

    public static void main(String[] args) {
        int x = 5;
        System.out.println("x in main before: " + x); // 5
        increment(x);
        System.out.println("x in main before: " + x);
        x = _03_functions.add(x,x);// 10
    }

    /*
    אפשר לראות בדוגמא שהערך של x אומנם השתנה בתוך הפוקנציה increment אבל הוא לא השתנה בmain.

    בעצם כשהעברנו את x לפונקציה increment נוצר משתנה x חדש שהוא לוקאלי לפונקציה הזאת, ולמרות שיש לו אותו שם כמו של המשתנה בmain
    זה לא אותו משתנה בזכרון.
     */
}
