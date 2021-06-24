package customer;

public interface CustomerFactory {
    Customer createCustomer(String name, String phonenumber, String address);
}
