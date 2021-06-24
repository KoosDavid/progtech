package worker;

import kitchen.Kitchen;
import meal.Meal;

public class Chef extends BasicWorker{

    public Chef(int id, String name) {
        super(id, name);
    }

    public void Cook(Meal meal, Kitchen kitchen)
    {
        kitchen.addMeal(meal);
    }
}
