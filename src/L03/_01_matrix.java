package L03;

public class _01_matrix {
    /*
    מערך יכול להיות גם מערך של מערכים - מטריצה

    נוכל להעזר בזה כדי לייצג נתונים בצורה יותר מורכבת

    לדוגמא אם נרצה לשמור ציונים של 3 קורסים שונים

    המערך לא חייב להיות ריבועי - כלומר לא חייב להיות כמות תאים בכל שורה זהה

    הגדרה כללית תראה
    <type> [][] <name> = new <type>[<rows>][<cols>];
     */
    public static void main(String[] args) {
        // יצירת מטריצה
        int[][] grades = new int[3][3];

        // הכנסת ציונים
        grades[0][0] = 100;
        grades[0][1] = 90;
        grades[0][2] = 80;

        grades[1][0] = 95;
        grades[1][1] = 85;
        grades[1][2] = 75;

        grades[2][0] = 90;
        grades[2][1] = 80;
        grades[2][2] = 70;

        // הדפסת ציונים
        //יש כאן לולאה חיצונית ולולאה פנימית
        for (int i = 0; i < grades.length; i++) {
            System.out.print("Course number " + (i + 1) + ": ");
            for (int j = 0; j < grades[i].length; j++) {
                System.out.print(grades[i][j] + " ");
            }
            System.out.println();
        }

        // דרך נוספת
        int[][] grades2 = {
                {100, 90, 80},
                {95, 85, 75},
                {90, 80, 70}
        };
        //זה בעצם מערך של מערכים...
        int[][] grades3 = new int[4][];

        grades3[0] = new int[3];
        grades3[1] = new int[2];
        grades3[2] = new int[4];


    }
}
