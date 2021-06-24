package meal.prototype;

import meal.MenuMeal;

public class DrinkMenuMeal extends MenuMeal {


    public DrinkMenuMeal(String name, int price, String drink) {
        super(name, price, drink);
    }

    public DrinkMenuMeal() {

    }

    @Override
    public MenuMeal copy() {
        DrinkMenuMeal drinkmenu = new DrinkMenuMeal();
        return drinkmenu;
    }

    @Override
    public String toString() {
        if(getName() == null)
            return "Üdítős menü, "+getDrink()+"-val/vel";
        else return getName()+", "+getPrice()+"Ft";
    }
}
