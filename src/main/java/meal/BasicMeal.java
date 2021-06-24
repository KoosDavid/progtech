package meal;


public abstract class BasicMeal implements Meal{

    public BasicMeal(String name, int price)
    {
        setName(name);
        setPrice(price);
    }

    public BasicMeal(){}

    private String name;
    private int price, amount;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        if(name == null)
            throw new RuntimeException("Az étel nevét kötelező megadni!");
        this.name = name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void setPrice(int price) {
        if(price < 1)
            throw new RuntimeException("Az árnak többnek kell lennie mint 0!");
        this.price = price;
    }

    public abstract BasicMeal copy();
}
