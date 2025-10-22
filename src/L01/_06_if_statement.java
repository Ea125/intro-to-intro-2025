package L01;

import java.util.Scanner;

public class _06_if_statement {
    /*
    משפטי תנאי הם אבן בסיס בכל תוכנה אמיתית.

    כאשר אנחנו רוצים לבצע פעולה רק אם תנאי מסוים מתקיים אנו משתמשים במשפטי תנאי.
    עוזר לשלוט על ה"זרימה" של התוכנית
    או במילים יותר פשוטות, לבצע החלטות על בסיס מידע שקיבלנו תוך כדי הפעולה של התוכנית
     */

    public static void main(String[] args) {

          Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
/*
if()
 */
        // אם x גדול מ y
        if (x > y) {
            System.out.println("x is greater than y");
        }

        // אם x קטן מ y
        if (x < y) {
            System.out.println("x is less than y");
        }

        // אם x שווה ל y
        if (x == y) {
            System.out.println("x is equal to y");
        }

        // אם x לא שווה ל y
        if (x != y) {
            System.out.println("x is not equal to y");
        }

        // אם x גדול או שווה ל y
        if (x >= y) {
            System.out.println("x is greater than or equal to y");
        }

        // אם x קטן או שווה ל y
        if (x <= y) {
            System.out.println("x is less than or equal to y");
        }

        int age = 51;
        if ( (age >= 18) && (age <= 67)){ // 18 <= age <= 67
            System.out.println("You can work");
        }
        else if (age > 50){
            System.out.println("You have experience");
        }
        else {
            System.out.println("You can't work");
        }
    }



}
