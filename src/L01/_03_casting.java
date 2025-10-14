package L01;

public class _03_casting {
    /*
ישנם מקרים בהם אנחנו רוצים להמיר משתנה מטיפוס אחד לטיפוס אחר.
כאשר אנחנו ממירים מטיפוס קטן לטיפוס גדול אין בעיה. (מספר שלם למספר עשרוני)
אך כאשר אנחנו ממירים מטיפוס גדול לטיפוס קטן יש צורך להפעיל פעולת המרה ידנית.
אם לא, יכול להווצר איבוד של מידע, לדוגמא מעשרוני לשלם
     */

    public static void main(String[] args) {
        // ממירים מספר שלם למספר עשרוני
        int i = 10;
        double d = i; // 10.0
        System.out.println(d);

        // ממירים מספר עשרוני למספר שלם
        double d2 = 10.5;
        //         int i2 = d2; // Error
        int i2 = (int) d2; // 10

        System.out.println(i2);
        char c2 = (char) 97;
        //print a
        System.out.println(c2);
       // String s2 = (String) i2; Error
      //  System.out.println(s2);
        //המרה לטקסט דורשת פונקציה, נשים לב שזה אובייקט ולא טיפוס פרימיטיבי
        String s2 = String.valueOf(d2);
        System.out.println(s2);

    }

}
