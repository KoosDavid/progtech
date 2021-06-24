package worker;

import kitchen.Kitchen;
import meal.Meal;
import order.Order;
import java.util.List;

public class Waiter extends BasicWorker{
    public Waiter(int id, String name) {
        super(id, name);
    }

    public void CompleteOrder(Order order, Kitchen kitchen)
    {
        List<Meal> meals = order.getOrderList();
        for (int i =0; i < meals.size();i++)
        {
            kitchen.serveMeal(meals.get(i));
        }
    }
}
