package L01;

import java.util.Scanner;

public class _02_input_output {
    public static void main(String[] args) {
        // הדפסת טקסט למסך
        System.out.println("Hello, World!");
        System.out.println(1+1);
        System.out.println(1 + "1");
        System.out.println("1" + 1 + 1 + 1);

        // הדפסת טקסט ללא ירידת שורה
        System.out.print("Hello");
        System.out.print(", World!\n"); // ירידת שורה

        // קליטת קלט מהמשתמש
        Scanner scanner = new Scanner(System.in);

        // קליטת מספר שלם
        System.out.println("Enter an integer:");
        int num = scanner.nextInt();
        System.out.println("You entered: " + num);

        // קליטת מספר עשרוני
        System.out.println("Enter a double:");
        double d = scanner.nextDouble();
        System.out.println("You entered: " + d);

        // קליטת טקסט
        System.out.println("Enter a string:");
        String str = scanner.next();
        System.out.println("You entered: " + str);

        // clear buffer
        // אנחנו מנקים את מה שיכול להיות שנשאר מהקריאות הקודמות
        scanner.nextLine();


        // קליטת טקסט עם רווחים
        System.out.println("Enter a string with spaces:");
        String str2 = scanner.nextLine();
        System.out.println("You entered: " + str2);
    }

}
