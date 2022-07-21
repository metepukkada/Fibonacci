import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int n;
        int first = 1;
        int second = 0;
        int result;
        System.out.print("Fibonacci Serisinin Eleman Sayısını Giriniz: ");
        n = scanner.nextInt();

        for (int i = 0; i <= n; i++) {
            System.out.print(total + " ");
            total = first + second;
            first = second;
            second = total;

        }
    }
}
