import java.util.Scanner;

public class TouristShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String name = scanner.nextLine();
        double totalPrice = 0;
        int numberOfProduct = 0;

        while (!name.equals("Stop")){
            double courrentPrice = Double.parseDouble(scanner.nextLine());
            numberOfProduct++;
            if (numberOfProduct % 3 == 0){
                courrentPrice = courrentPrice * 0.5;
            }
            totalPrice += courrentPrice;

            if (budget < totalPrice){
                System.out.println("You don't have enough money!");
                System.out.printf("You need %.2f leva!",totalPrice - budget);
                break;
            }

            name = scanner.nextLine();
        }
        if (budget >= totalPrice){
            System.out.printf("You bought %d products for %.2f leva.",numberOfProduct,totalPrice);
        }
    }
}
