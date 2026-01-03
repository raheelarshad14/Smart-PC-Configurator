
public class GPU extends Component {
    String specs;

    public GPU(String name, int Price, String specs) {
        super(name, Price);
        this.specs = specs;
    }

    @Override
    public String getDetails(){
        return name + "\n" + specs + " \nPrice: " + price;
    }
}