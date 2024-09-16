package L01;

public class _01_types {
    /*
    טיפוסים בשפת ג'אווה
    1. טיפוסים שלמים
    2. טיפוסים עשרוניים
    3. טיפוס תווים
    4. טיפוס בוליאני

    כדי להשתמש במשתנים עלינו להגדיר אותם ולהשתמש בהם.
    בשפת ג'אווה אנחנו צריכים לצהיר על כל משתנה מה סוגו.

    הצהרת על משתנה תראה כך:
    <var type> <var name> = <value>;
     */
    public static void main(String[] args) {
        // 1. Integer types (מספרים שלמים)
        byte b = 127; // 1 byte (-128 to 127)
        short s = 32767; // 2 bytes (-32768 to 32767)
        int i = 2147483647; // 4 bytes (-2147483648 to 2147483647)
        long l = 9223372036854775807L; // 8 bytes (-9223372036854775808 to 9223372036854775807) // make sure to add 'L' at the end

        // 2. Floating point types (מספרים עשרוניים)
        // E means 10^
        float f = 3.4028E8f; // 4 bytes // make sure to add 'f' at the end
        float f2 = 340280000; // same as above
        double d = 1.797E-5; // 8 bytes
        double d2 = 0.00001797; // same as above


        // 3. Character type (תווים)
        char c = 'A'; // 2 bytes (0 to 65535)
        char c2 = 65; // same as above

        char one = '1'; // 49
        char one_val = '1' - '0'; // 1

        // 4. Boolean type (בוליאני)
        boolean bool = true; // true or false


        // 5. String type (מחרוזת)
        String str = "Hello, World!";


        // קבועים
        /*
        קבוע הוא משתנה שלא ניתן לשנות את ערכו.
        הם משמשים להגדרת ערכים קבועים שיש להשתמש בהם במקומות שונים בקוד, ושלא ישתנו.
        בשפת ג'אווה קבועים מוגדרים באמצעות המילת המפתחית final.
        נהוג לתת למתשנים שמות שכוללים אותיות גדולות כאשר כל מילה מופרדת בקו תחתון.
         */
        final int MAX_VALUE = 100;
        final double PI = 3.14159;
        final String NAME = "Shay Gali";

//        PI = 3.14; // Error
    }
}
