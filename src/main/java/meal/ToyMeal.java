package meal;

public abstract class ToyMeal extends BasicMeal{
    public ToyMeal(String name, int price, String toy) {
        super(name, price);
        setToy(toy);
    }

    public ToyMeal() {}
    private String toy;
    public String getToy()
    {
        return toy;
    }
    public void setToy(String toy)
    {
      if(toy == null)
          throw new RuntimeException("A menühöz játékot kell választani!");
      this.toy = toy;
    }

    public abstract ToyMeal copy();
}
