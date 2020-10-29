package methods;

import java.util.Scanner;

public class Operations {
    Scanner scanner = new Scanner(System.in);

    String firstMsg = "set the first number: ";
    String secondMsg = "set the second number: ";

    private int sumNumber1;
    private int sumNumber2;

    public void sum() {
        System.out.print(firstMsg);
        sumNumber1 = scanner.nextInt();

        System.out.print(secondMsg);
        sumNumber2 = scanner.nextInt();

        System.out.printf("%s %d", "el resultado es igual a:  ", sumNumber1 + sumNumber2);
    }

    public void rest() {
        System.out.print("set the number to rest it: ");
        sumNumber1 = scanner.nextInt();

        System.out.print("set the rest number: ");
        sumNumber2 = scanner.nextInt();

        System.out.printf("%s %d", "el resultado es igual a:  ", sumNumber1 - sumNumber2);
    }

    public void multiply() {
        System.out.print(firstMsg);
        sumNumber1 = scanner.nextInt();

        System.out.print(secondMsg);
        sumNumber2 = scanner.nextInt();

        System.out.printf("%s %d", "el resultado es igual a:  ", sumNumber1 * sumNumber2);
    }

    public void divide() {
        System.out.print(firstMsg);
        sumNumber1 = scanner.nextInt();

        System.out.print(secondMsg);
        sumNumber2 = scanner.nextInt();

        System.out.printf("%s %d", "el resultado es igual a:  ", sumNumber1 / sumNumber2);
    }
}
