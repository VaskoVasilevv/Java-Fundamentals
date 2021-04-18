package ConditionalStatements;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            sum = sum + num;
            if (num > max ){
                max = num;
            }
        }
        sum = sum - max;
        if (sum == max){
            System.out.println("Yes");
            System.out.printf("Sum = %d", sum);
        }else {
            int diff = sum - max;
            System.out.println("No");
            System.out.printf("Diff = %d",Math.abs(diff));
        }


    }
}
