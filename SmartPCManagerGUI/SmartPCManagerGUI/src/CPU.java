
public class CPU extends Component {
    private String socket;
    String specs;

    public CPU(String name, int Price, String socket, String specs) {
        super(name, Price);
        this.socket = socket;
        this.specs = specs;
    }

    public String getSocket() {
        return socket;
    }

    @Override
    public String getDetails(){
        return name + "\n" + socket + "\n" + specs + " \nPrice: " + price;
    }
}
