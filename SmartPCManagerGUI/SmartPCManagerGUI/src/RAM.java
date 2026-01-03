
public class RAM extends Component {
    private String type;
    String specs;

    public RAM(String name, int Price, String type, String specs) {
        super(name, Price);
        this.type = type;
        this.specs = specs;
    }

    public String getType() {
        return type;
    }

    @Override
    public String getDetails() {
        return name + type + "\n" + specs + " \nPrice: " + price;
    }
}
