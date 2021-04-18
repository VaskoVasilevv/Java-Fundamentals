package bg.softuni.fundamentals.AssociativeArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> collect = Arrays.stream(scanner.nextLine().split(" "))
                .map(e -> Integer.parseInt(e))
                .sorted((a, b) -> Integer.compare(b, a))
                .limit(3)
                .collect(Collectors.toList());

        for (Integer integer : collect) {
            System.out.print(integer+ " ");
        }

    }
}
