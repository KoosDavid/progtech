package order;

import customer.Customer;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import meal.Meal;
import java.util.List;

@RequiredArgsConstructor
@ToString
public class Order {
    private final List<Meal> orderList;
    private final int id;
    private final Customer customer;

    public List<Meal> getOrderList()
    {
        return this.orderList;
    }
}
