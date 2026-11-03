import java.util.Scanner;

public class PrintAAndB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        solution(scanner.nextInt() + " " + scanner.nextInt());
    }

    public static void solution(String n) {

        String[] split = n.split(" ");

        System.out.println("a = " + split[0]);
        System.out.println("b = " + split[1]);

    }
}
