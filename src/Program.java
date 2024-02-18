import EnumHelper.DrinksMachine;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DrinkService service = new DrinkService();
        DrinksMachine[] drinks = DrinksMachine.values();
        while (true){
            service.drinksMenu();
            String choice = scanner.nextLine().toUpperCase();
            if (choice.equals("EXIT") || choice.equals("0")){
                scanner.close();
                break;
            }
            service.orderDrink(choice);
        }

        for (DrinksMachine drink:
        drinks){
            if(drink.getCount() > 0){
                System.out.printf("Drink %s was ordered %d times\n", drink, drink.getCount());
            }
        }
        System.out.println("Total drinks ordered = " + service.getTotalCounter() + " with total price payment = " + service.getTotalPrice());
    }
}
