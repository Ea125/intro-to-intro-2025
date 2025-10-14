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
        //it's all power of 2
        //-2^7 to 2^7 - 1
        byte b = 127; // 1 byte (-128 to 127)
        //-2^15 to 2^15 - 1
        short s = 32767; // 2 bytes (-32768 to 32767)
        //-2^31 to 2^31 - 1
        int i = 2147483647; // 4 bytes (-2147483648 to 2147483647)
        //-2^63 to 2^63 - 1
        long l = 9223372036854775807L; // 8 bytes (-9223372036854775808 to 9223372036854775807) // make sure to add 'L' at the end
        //* the default is int so long needs to be attached with L
        //remember, the risky part here is over the limit of the type

        // 2. Floating point types (מספרים עשרוניים)
        // E means 10^
        //the problem here is the accurate in very detailed number, so doing compression is risky won't
        //the default is double
        float f = 3.4028E8f; // 4 bytes // make sure to add 'f' at the end
        float f2 = 340280000; // same as above
        double d = 1.797E-5; // 8 bytes
        double d2 = 0.00001797; // same as above


        // 3. Character type (תווים)
        //no minus, there is no meaning to represent value in negative
        char c = 'A'; // 2 bytes (0 to 65535)
        char c2 = 65; // same as above
        char one = '1'; // 49
        char one_val = '1' - '0'; // 1

       // 4. Boolean type (בוליאני)
        boolean bool = true; // true or false
        boolean bool2 = false;

        // 5. String type (מחרוזת)
        //un primitive type
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
        final String NAME = "Evyatar Altman";

//        PI = 3.14; // Error
    }

}
