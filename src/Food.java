import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Currency;
import java.util.Locale;

public class Food {
    private String name;
    private String[] ingredients;
    private String serving_days;
    private double serving_price;

    public Food(String name, String[] ingredients, String serving_days, double serving_price) {
        this.name = name;
        this.ingredients = ingredients;
        this.serving_days = serving_days;
        this.serving_price = serving_price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }

    public String getServing_days() {
        return serving_days;
    }

    public void setServing_days(String serving_days) {
        this.serving_days = serving_days;
    }

    public double getServing_price() {
        return serving_price;
    }

    public void setServing_price(double serving_price) {
        this.serving_price = serving_price;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", ingredients=" + Arrays.toString(ingredients) +
                ", serving_days='" + serving_days + '\'' +
                ", serving_price=" + serving_price +
                '}';
    }
}
