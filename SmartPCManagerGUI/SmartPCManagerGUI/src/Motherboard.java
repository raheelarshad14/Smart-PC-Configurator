
public class Motherboard extends Component {
    private String socket;
    private String formFactor;
    private String ramType;
    String specs;

    public Motherboard(String name, int price, String socket, String formFactor, String ramType, String specs){
        super(name, price);
        this.socket = socket;
        this.formFactor = formFactor;
        this.ramType = ramType;
        this.specs = specs;
    }

    public String getSocket() {
        return socket;
    }

    public String getFormFactor() {
        return formFactor;
    }

    public String getRamType() {
        return ramType;
    }

    @Override
    public String getDetails(){
        return name + "\n" + socket + "\n" + specs + " \nPrice: " + price;
    }
}
