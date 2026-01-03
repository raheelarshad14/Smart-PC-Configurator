
public class Casing extends Component {
    private String formFactor;

    public Casing(String name, int price, String formFactor) {
        super(name, price);
        this.formFactor = formFactor;
    }

    public String getFormFactor() {
        return formFactor;
    }

    @Override
    public String getDetails() {
        return name + "\n"  + formFactor + "\nPrice: " + price;
    }
}
