import methods.*;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Operations operations = new Operations();

        int result;
        Scanner sc = new Scanner(System.in);
        System.out.print("write type  of operation: ");
        String operation = sc.nextLine();

        switch (operation) {
            case "sum":
                operations.sum();
                break;
            case "rest":
                operations.rest();
                break;
            case "divide":
                operations.divide();
                break;
            case "multiply":
                operations.multiply();
                break;

        }
    }
}
