
public abstract class Component {
    protected String name;
    protected int price;

    public Component(String name, int Price) {
        this.name = name;
        this.price = Price;
    }

    public int getPrice(){
        return price;
    }

    public String getName() {
        return name;
    }

    public abstract String getDetails();

}
