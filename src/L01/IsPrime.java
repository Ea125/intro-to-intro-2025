package L01;

import java.util.Scanner;

public class IsPrime {
    private static boolean isPrime(Long number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        long number = input.nextLong();
        if (isPrime(number)) {
            System.out.println("Prime number");
        }else{
            System.out.println("Not Prime number");
        }
    }
}
