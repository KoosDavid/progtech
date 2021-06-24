package worker;

public abstract class BasicWorker implements Worker{

    private int id;
    private String name;

    public BasicWorker(int id, String name)
    {
        setId(id);
        setName(name);
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        if(id < 0)
            throw new RuntimeException("A dolgozó azonosítója nem lehet negatív!");
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        if(name == null)
            throw new RuntimeException("A dolgozó nevét kötelező kitölteni!");
        this.name = name;
    }
}
