package L03;


public class _06_by_value {
    /*
    כאשר אנחנו מעבירים לפונקציה פרמטר, הוא משוכפל, ולא נוכל לעשות עליו שינויים
     */
    /*
    int,double,float,long,byte,boolean,short,char
    1 name
    2 type
    3 address
    4 value

    */
    public static void toUpper(String s){
        s = s.toUpperCase();
    }
    public static int increment(int x){
        x++;
        return x;
    }

    public static void main(String[] args) {
        int x = 5;
        int xFuc = x;


        System.out.println("x in func before: " + x); // 5

        System.out.println("x in main after inc: " + increment(x));
        x = _03_functions.add(x,x);// 10
        String lower = "a";
        toUpper(lower);
        System.out.println(lower);
    }

    /*
    אפשר לראות בדוגמא שהערך של x אומנם השתנה בתוך הפוקנציה increment אבל הוא לא השתנה בmain.

    בעצם כשהעברנו את x לפונקציה increment נוצר משתנה x חדש שהוא לוקאלי לפונקציה הזאת, ולמרות שיש לו אותו שם כמו של המשתנה בmain
    זה לא אותו משתנה בזכרון.
     */
}
