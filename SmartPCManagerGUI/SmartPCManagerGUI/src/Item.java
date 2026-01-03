
class Item {
    private String name;
    private Things things;
    private int unit;

    Item(String name, Things things, int unit){
        this.name = name;
        this.things = things;
        this.unit = unit;

    }

    public void setName(String name){
        this.name = name;

    }

    public String getName(){
        return name;

    }

    public void setThings(Things things){
        this.things = things;

    }
    public Things getThings(){
        return things;
    }

    public void setUnit(int unit){
        this.unit = unit;

    }

    public int getUnit(){
        return unit;

    }

    public void addStock(int amount) {
        unit += amount;
        System.out.println(amount + " units added to: " + name);
    }

    public void showRecord()
    {

        System.out.println(name+ " "+" units: " + unit);
    }
}