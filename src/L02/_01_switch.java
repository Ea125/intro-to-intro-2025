package L02;

import java.util.Scanner;

public class _01_switch {
    /*
    לפעמים נרצה לבדוק ערך מסוים ולפיו לבצע פעולה מסוימת.
    כאשר יש לנו רשימה של אפשרויות קבועות נוכל להשתמש במבנה switch-case.

    המבנה מקבל ערך ובודק אותו נגד רשימת אפשרויות.
     */

    public static void main(String[] args) {
        int x = 2;

        switch (x) {
            //if (x == 1)
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
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
        System.out.println("Please enter day in the week");
        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();
        switch (day) {
            case "Sunday":
                System.out.println("First day of the week");
                break;
            case "Monday":
                System.out.println("Second day of the week");
                break;
            case "tuesday":
            case "Tuesday":
                System.out.println("Third day of the week");
                break;
            case "Wednesday":
                System.out.println("Fourth day of the week");
                break;
            case "Thursday":
                System.out.println("Fifth day of the week");
                break;
            case "Friday":
                System.out.println("Sixth day of the week");
                break;
            case "Saturday":
                System.out.println("Seventh day of the week");
                break;
            default:
                System.out.println("Invalid day");
        }

    }
    //if there is a time, calculator
}
