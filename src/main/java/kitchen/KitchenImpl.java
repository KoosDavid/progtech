package kitchen;

import customer.CustomerFactory;
import customer.CustomerFactoryImpl;
import meal.Meal;

import java.util.ArrayList;
import java.util.List;

public class KitchenImpl implements Kitchen{

    private static final KitchenImpl kitchen = new KitchenImpl();

    public static KitchenImpl getInstance()
    {
        return kitchen;
    }


    public KitchenImpl()
    {
        meals = new ArrayList<>();
    }
    private List<Meal> meals;

    @Override
    public void addMeal(Meal meal) {
        meals.add(meal);
    }

    @Override
    public List<Meal> MealsInKitchen() {
        return this.meals;
    }

    @Override
    public void serveMeal(Meal meal) {
        meals.remove(meal);
    }
}
