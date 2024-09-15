package L01;

public class _03_casting {
    /*
ישנם מקרים בהם אנחנו רוצים להמיר משתנה מטיפוס אחד לטיפוס אחר.
כאשר אנחנו ממירים מטיפוס קטן לטיפוס גדול אין בעיה. (מספר שלם למספר עשרוני)
אך כאשר אנחנו ממירים מטיפוס גדול לטיפוס קטן יש צורך להפעיל פעולת המרה ידנית.
     */

    public static void main(String[] args) {
        // ממירים מספר שלם למספר עשרוני
        int i = 10;
        double d = i; // 10.0
        System.out.println(d);

        // ממירים מספר עשרוני למספר שלם
        double d2 = 10.5;
        //  int i2 = d2; // Error
        int i2 = (int) d2; // 10
        System.out.println(i2);

        // ממירים מספר שלם למספר עשרוני
        int i3 = 10;
        double d3 = (double) i3; // 10.0
        System.out.println(d3);

        // ממירים מספר עשרוני למספר שלם
        double d4 = 10.5;
        int i4 = (int) d4; // 10
        System.out.println(i4);

        // ממירים מספר שלם למספר עשרוני
        int i5 = 10;
        double d5 = (double) i5; // 10.0
        System.out.println(d5);

        // ממירים מספר עשרוני למספר שלם
        double d6 = 10.5;
        int i6 = (int) d6; // 10
        System.out.println(i6);
    }

}
