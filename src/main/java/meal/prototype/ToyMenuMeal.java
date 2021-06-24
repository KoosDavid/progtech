package meal.prototype;

import meal.ToyMeal;

public class ToyMenuMeal extends ToyMeal{
    public ToyMenuMeal(String name, int price, String toy) {
        super(name, price, toy);
    }
    public ToyMenuMeal(){}

    @Override
    public ToyMeal copy() {
        ToyMenuMeal toymenu = new ToyMenuMeal();
        return toymenu;
    }

    @Override
    public String toString() {
        if(getName() == null)
            return "Játékos menü, "+getToy()+"-val/vel";
        else return getName()+", "+getPrice()+"Ft";
    }
}
