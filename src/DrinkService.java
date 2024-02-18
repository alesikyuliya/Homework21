import EnumHelper.DrinksMachine;

import static EnumHelper.DrinksMachine.*;

public class DrinkService {
    private int totalCounter;
    private double totalPrice;

    public int getTotalCounter() {
        return totalCounter;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void drinksMenu(){
        DrinksMachine[] drinks = DrinksMachine.values();
        System.out.println("Please choose number ot type of a drink to make order: ");

        for (DrinksMachine drink:
        drinks){
            System.out.printf("\t %d, Drink %s price = %.2f\n", drink.ordinal() + 1, drink.name(), drink.getPrice());
        }
        System.out.println("\t 0. EXIT");
    }

    public void orderDrink(String choice){
        switch (choice){
            case "1":
            case "COFFEE":
                totalCounter++;
                totalPrice += COFFEE.getPrice();
                prepareDrink(COFFEE);
                COFFEE.setCount(COFFEE.getCount() + 1);
                break;
            case "2":
            case "TEA":
                totalCounter++;
                totalPrice += TEA.getPrice();
                prepareDrink(TEA);
                TEA.setCount(TEA.getCount() + 1);
                break;
            case "3":
            case " LEMONADE":
                totalCounter++;
                totalPrice +=  LEMONADE.getPrice();
                prepareDrink( LEMONADE);
                LEMONADE.setCount( LEMONADE.getCount() + 1);
                break;
            case "4":
            case " MOJITO":
                totalCounter++;
                totalPrice +=  MOJITO.getPrice();
                prepareDrink( MOJITO);
                MOJITO.setCount( MOJITO.getCount() + 1);
                break;
            case "5":
            case " SODA":
                totalCounter++;
                totalPrice +=  SODA.getPrice();
                prepareDrink( SODA);
                SODA.setCount( SODA.getCount() + 1);
                break;
            case "6":
            case "COLA":
                totalCounter++;
                totalPrice += COLA.getPrice();
                prepareDrink(COLA);
                COLA.setCount(COLA.getCount() + 1);
                break;
            default:
                System.out.println("Invalid choice, please try again:");
                break;
        }
    }

    public void prepareDrink(DrinksMachine drink){
        System.out.printf("Preparing drink %s. . . .\n", drink);
    }
}
