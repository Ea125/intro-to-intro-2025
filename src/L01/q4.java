package L01;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        //get input int
        int input = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        input = sc.nextInt();

        //var sum
        int sum = 0;
        int first = 0;
        int second = 0;
        int third = 0;

        //123
        third = input % 10;
        input = input/10;
        //12
        second = input % 10;
        input = input / 10;
        //1
        first = input % 10;


        sum = first + second + third;
        System.out.println(sum);
    }
}
