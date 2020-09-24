import methods.Divide;
import methods.Multiply;
import methods.Rest;
import methods.Sum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int result;
        Scanner sc = new Scanner(System.in);
        String operation = sc.nextLine();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        switch(operation){
            case "sum":
                result = Sum.sum(n1, n2);
                System.out.println(result);
                break;
            case "rest":
                result = Rest.rest(n1, n2);
                System.out.println(result);
                break;
            case "multiply":
                result = Multiply.multiply(n1, n2);
                System.out.println(result);
                break;
            case "divide":
                result = Divide.divide(n1, n2);
                System.out.println(result);
                break;
        }
    }
}
