package org.example;

import customer.BasicCustomer;
import customer.Customer;
import kitchen.KitchenImpl;
import meal.BasicMeal;
import meal.Meal;
import meal.prototype.BasicMealImpl;
import meal.prototype.DrinkMenuMeal;
import meal.prototype.ToyMenuMeal;
import order.Order;
import order.OrderBuilderImpl;
import worker.Chef;
import worker.Waiter;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Chef chef = new Chef(1,"Jozsi");
        Chef chef2 = new Chef(2,"Bela");
        Waiter waiter = new Waiter(3,"Bela");
        Waiter waiter2 = new Waiter(4,"Feri");

        BasicMeal bm = new BasicMealImpl("Sima menü",50);
        DrinkMenuMeal dm = new DrinkMenuMeal("Üdítős menü",180,"Kóla");
        ToyMenuMeal tm = new ToyMenuMeal("Játékos menü",200,"Dínó");

        KitchenImpl konyha = KitchenImpl.getInstance();

        Customer customer = new BasicCustomer("Jani","0620101010101","Valami utca 2.");
        Customer customer2 = new BasicCustomer("Zoli","0620102420101","Valami utca 3.");

        Order order = new OrderBuilderImpl().addBasicMeal().addDrinkMenuMeal("Fanta").addToyMenuMeal("Autó").build(1,customer);
        Order order2 = new OrderBuilderImpl().addDrinkMenuMeal("fanta").build(2,customer2);

        chef.Cook(bm.copy(),konyha);
        chef2.Cook(dm.copy(),konyha);
        chef.Cook(tm.copy(),konyha);

        waiter.CompleteOrder(order,konyha);





    }
}
