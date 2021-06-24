package meal;

public abstract class MenuMeal extends BasicMeal {
    public MenuMeal(String name, int price, String drink) {
        super(name, price);
        setDrink(drink);
    }
    public MenuMeal(){}

    private String drink;
    public String getDrink()
    {
        return drink;
    }

    public void setDrink(String drink)
    {
        if(drink == null)
            throw new RuntimeException("A menühöz választani kell innivalót!");
        this.drink = drink;
    }

    public abstract MenuMeal copy();
}

