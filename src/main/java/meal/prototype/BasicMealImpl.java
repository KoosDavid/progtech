package meal.prototype;

import meal.BasicMeal;


public class BasicMealImpl extends BasicMeal {
    public BasicMealImpl(String name, int price) {
        super(name, price);
    }

    public BasicMealImpl() {

    }

    @Override
    public BasicMeal copy() {
        BasicMealImpl basicmeal = new BasicMealImpl();
        return basicmeal;
    }

    @Override
    public String toString() {
        if(getName() == null)
            return "Sima menü";
        else return getName()+", "+getPrice()+"Ft";
    }
}
