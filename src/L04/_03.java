package L04;

public class _03 {

    static boolean doSomething1() {
        System.out.println("itzik");
        return true;
    }

    static boolean doSomething2() {
        System.out.println("yossi");
        return false;
    }

    public static void main(String[] args) {
        if (doSomething1() & doSomething2()) {
            System.out.println("ghghg");
        }
    }
}
