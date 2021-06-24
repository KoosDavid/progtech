package kitchen;

import meal.Meal;

import java.util.List;

public interface Kitchen {
    void addMeal(Meal meal);
    List<Meal> MealsInKitchen();

    void serveMeal(Meal meal);
}
