package customer;

public class CustomerFactoryImpl implements CustomerFactory{
    private static final CustomerFactory customerfactory = new CustomerFactoryImpl();

    public static CustomerFactory getInstance()
    {
        return customerfactory;
    }



    @Override
    public Customer createCustomer(String name, String phonenumber, String address) {
        return new BasicCustomer(name, phonenumber,address);
    }

}
