package bg.softuni.fundamentals.Basyc.Syntax;

import java.math.BigDecimal;
import java.util.Scanner;

public class PoundsToUsd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        BigDecimal sum = new BigDecimal(0);

        for (int i = 0; i < n; i++) {
            String numberAsString = scanner.nextLine();
            BigDecimal number = new BigDecimal(numberAsString);
            sum = sum.add(number);

        }
        System.out.println(sum);
    }
}
