package order;

import customer.Customer;

public interface OrderBuilder {

    OrderBuilder addBasicMeal();
    OrderBuilder addDrinkMenuMeal(String drink);
    OrderBuilder addToyMenuMeal(String toy);

    Order build(int id, Customer customer);
}
