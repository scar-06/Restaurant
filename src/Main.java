import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Currency;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
    Personnel personnel = new Personnel("Jack Daniel", "Chef", 34567876L, "jack.daniel@restaur.com");
        System.out.println("Personnel Name: " + personnel.getName());
        System.out.println("Personnel Profession: " + personnel.getProfession());
        System.out.println("Personnel Tally Number: " + personnel.getTally_number());
        System.out.println("Personnel Email: " + personnel.getEmail());
        System.out.println("\n");

    Food food = new Food("Fried Rice", new String[]{"rice", "beans", "chicken", "green peas"}, "Mondays, Wednesdays, Fridays", 25);
        Locale usa = new Locale("en", "US");
        Currency dollars = Currency.getInstance(usa);
        NumberFormat dollarFormat = NumberFormat.getCurrencyInstance(usa);
        System.out.println("Food name: " + food.getName());
        System.out.println("Food serving days: " + food.getServing_days());
        System.out.println("Food ingredients: " + Arrays.toString(food.getIngredients()));
        System.out.println("Food serving price: " + dollarFormat.format(food.getServing_price()));
        System.out.println("\n");

    Equipment equipment = new Equipment("Microwave", "Re-heating of meals", 4)
                



    }

}
