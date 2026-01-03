
import java.io.FileWriter;
import java.io.IOException;

public class Builder {
    public CPU selectedCPU;
    public Motherboard selectedMotherboard;
    public GPU selectedGPU;
    public RAM selectedRAM;
    public Casing selectedCasing;

    public int calculateTotal(){
        return selectedCPU.getPrice() + selectedMotherboard.getPrice() + selectedGPU.getPrice()
                + selectedRAM.getPrice() + selectedCasing.getPrice();
    }

    public void printReceipt() {
        try {
            FileWriter writer = new FileWriter("PC_Receipt.txt");

            // Define a format pattern:
            // %-6s  = Label (Left aligned, width 6)
            // %-40s = Name (Left aligned, width 40)
            // %10s  = Price (Right aligned, width 10)
            // %n    = New line
            String format = "%-6s %-40s    %10s%n";
            String line = "-------------------------------------------------------------%n";

            writer.write(String.format(line));
            writer.write(String.format("                   Smart PC Configurator                     %n"));
            writer.write(String.format(line));

            // Use the format string for the items
            writer.write(String.format(format, "CPU:", selectedCPU.getName(), selectedCPU.getPrice()));
            writer.write(String.format(format, "MOBO:", selectedMotherboard.getName(), selectedMotherboard.getPrice()));
            writer.write(String.format(format, "RAM:", selectedRAM.getName(), selectedRAM.getPrice()));
            writer.write(String.format(format, "GPU:", selectedGPU.getName(), selectedGPU.getPrice()));
            writer.write(String.format(format, "CASE:", selectedCasing.getName(), selectedCasing.getPrice()));

            writer.write(String.format(line));
            // For the total, we align it to match the price column on the far right
            writer.write(String.format("%-45s Rs. %10s%n", "TOTAL:", calculateTotal()));
            writer.write(String.format(line));

            writer.close();
            System.out.println("\n[SUCCESS] Receipt saved to 'PC_Receipt.txt'");
        } catch (IOException e) {
            System.out.println("Error saving receipt.");
        }
    }


}