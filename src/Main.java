import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("3");
        Thread.sleep(1000);
        System.out.println("2");
        Thread.sleep(1000);
        System.out.println("1");
        Thread.sleep(1000);

        System.out.println("GO!!!!");
        long startTime = System.currentTimeMillis();

        Scanner scanner = new Scanner(System.in);
        scanner.next();
        long stopTime = System.currentTimeMillis();

        long reactionTime = stopTime-startTime;
        System.out.println(reactionTime+" ms");
    }
}