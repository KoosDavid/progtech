package order;

import customer.Customer;
import meal.BasicMeal;
import meal.Meal;
import meal.prototype.BasicMealImpl;
import meal.prototype.DrinkMenuMeal;
import meal.prototype.ToyMenuMeal;

import java.util.ArrayList;
import java.util.List;



public class OrderBuilderImpl implements OrderBuilder{

    List<Meal> mealList = new ArrayList<>();

    @Override
    public OrderBuilder addBasicMeal() {
        mealList.add(new BasicMealImpl());
        return this;
    }

    @Override
    public OrderBuilder addDrinkMenuMeal(String drink) {
        mealList.add(new DrinkMenuMeal());
        return this;
    }

    @Override
    public OrderBuilder addToyMenuMeal(String toy) {
        mealList.add(new ToyMenuMeal());
        return this;
    }

    @Override
    public Order build(int id, Customer customer) {
        return new Order(mealList,id,customer);

    }
}
