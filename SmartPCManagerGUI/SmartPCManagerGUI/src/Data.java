
import java.util.ArrayList;
import java.util.Scanner;

public class Data {
    private ArrayList<Item> items = new ArrayList<>();

    // ==========================================
    //      PART 1: DATA ENTRY & LEGACY LOGIC
    // ==========================================
    public Data() {
        // --- CPUs ---
        items.add(new Item("\nAMD Ryzen 5 3600 – Socket: AM4\n", Things.CPU, 10));
        items.add(new Item("\nIntel Core i3-12100F – Socket: LGA1700", Things.CPU, 15));
        items.add(new Item("\nAMD Ryzen 5 5500 – Socket: AM4\n", Things.CPU, 20));
        items.add(new Item("\nAMD Ryzen 5 4600G – Socket: AM4\n", Things.CPU, 10));
        items.add(new Item("\nAMD Ryzen 5 2600 – Socket: AM4\n", Things.CPU, 15));

        items.add(new Item("\nAMD Ryzen 5 5600 – Socket: AM4\n", Things.CPU, 22));
        items.add(new Item("\nIntel Core i5-12400F – Socket: LGA1700\\n", Things.CPU, 20));
        items.add(new Item("\nAMD Ryzen 7 5700X – Socket: AM4\\n", Things.CPU, 16));
        items.add(new Item("\nAMD Ryzen 5 7500F – Socket: AM5\\n", Things.CPU, 12));
        items.add(new Item("\nAMD Ryzen 5 8600G – Socket: AM5\\n", Things.CPU, 8));

        items.add(new Item("\nIntel Core i5-14600K – Socket: LGA1700\n", Things.CPU, 10));
        items.add(new Item("\nAMD Ryzen 7 7800X3D – Socket: AM5\n", Things.CPU, 8));
        items.add(new Item("\nIntel Core i7-14700K – Socket: LGA1700\n", Things.CPU, 6));
        items.add(new Item("\nAMD Ryzen 9 7900X – Socket: AM5\n", Things.CPU, 5));
        items.add(new Item("\nIntel Core i9-14900K – Socket: LGA1700\n", Things.CPU, 4));

        // --- MOTHERBOARDS (UPDATED COMPLETE LIST) ---

        // Budget
        items.add(new Item("\nGigabyte B450M DS3H V2 – Socket: AM4 – Form Factor: Micro-ATX\n", Things.MOTHER_BOARD, 20));
        items.add(new Item("\nMSI B450M-A PRO MAX II – Socket: AM4 – Form Factor: Micro-ATX\n", Things.MOTHER_BOARD, 14));
        items.add(new Item("\nASUS Prime H610M-K D4 – Socket: LGA1700 – Form Factor: Micro-ATX\n", Things.MOTHER_BOARD, 15));
        items.add(new Item("\nBiostar B450MH – Socket: AM4 – Form Factor: Micro-ATX\n", Things.MOTHER_BOARD, 19));
        items.add(new Item("\nGigabyte H610M H V2 – Socket: LGA1700 – Form Factor: Micro-ATX\n", Things.MOTHER_BOARD, 12));

        // Mid-Range (Formatted to match)
        items.add(new Item("\nMSI B550M PRO-VDH WiFi – Socket: AM4 – Form Factor: Micro-ATX\n", Things.MOTHER_BOARD, 11));
        items.add(new Item("\nASUS Prime B760M-K D4 – Socket: LGA1700 – Form Factor: Micro-ATX\n", Things.MOTHER_BOARD, 15));
        items.add(new Item("\nGigabyte B760M DS3H AX – Socket: LGA1700 – Form Factor: Micro-ATX\n", Things.MOTHER_BOARD, 9));
        items.add(new Item("\nMSI PRO B650M-P – Socket: AM5 – Form Factor: Micro-ATX\n", Things.MOTHER_BOARD, 16));
        items.add(new Item("\nGigabyte B550M K – Socket: AM4 – Form Factor: Micro-ATX\n", Things.MOTHER_BOARD, 18));

        // High-End (Formatted to match)
        items.add(new Item("\nMSI MAG B650 Tomahawk WiFi – Socket: AM5 – Form Factor: ATX\n", Things.MOTHER_BOARD, 8));
        items.add(new Item("\nGigabyte Z790 UD AX – Socket: LGA1700 – Form Factor: ATX\n", Things.MOTHER_BOARD, 10));
        items.add(new Item("\nASUS ROG Strix B760-A Gaming – Socket: LGA1700 – Form Factor: ATX\n", Things.MOTHER_BOARD, 7));
        items.add(new Item("\nMSI MAG Z790 Tomahawk WiFi – Socket: LGA1700 – Form Factor: ATX\n", Things.MOTHER_BOARD, 5));
        items.add(new Item("\nGigabyte X670 Gaming X AX – Socket: AM5 – Form Factor: ATX\n", Things.MOTHER_BOARD, 6));

        // --- GPUs ---
        items.add(new Item("\nAMD Radeon RX 580 – 8GB", Things.GPU, 10));
        items.add(new Item("\nNVIDIA GTX 1660 SUPER – 6GB", Things.GPU, 8));
        items.add(new Item("\nAMD Radeon RX 5600 XT – 6GB", Things.GPU, 12));
        items.add(new Item("\nNVIDIA RTX 2060 – 6GB", Things.GPU, 7));
        items.add(new Item("\nAMD Radeon RX 5500 XT – 8GB", Things.GPU, 5));

        items.add(new Item("\nAMD Radeon RX 6600 – 8GB", Things.GPU, 8));
        items.add(new Item("\nNVIDIA GeForce RTX 3060 – 12GB", Things.GPU, 10));
        items.add(new Item("\nNVIDIA GeForce RTX 4060 – 8GB", Things.GPU, 12));
        items.add(new Item("\nAMD Radeon RX 6700 XT – 12GB", Things.GPU, 6));
        items.add(new Item("\nNVIDIA GeForce RTX 3060 Ti – 8GB", Things.GPU, 8));

        items.add(new Item("\nNVIDIA GeForce RTX 4070 SUPER – 12GB", Things.GPU, 5));
        items.add(new Item("\nAMD Radeon RX 7800 XT – 16GB", Things.GPU, 6));
        items.add(new Item("\nNVIDIA GeForce RTX 4080 SUPER – 16GB", Things.GPU, 3));
        items.add(new Item("\nAMD Radeon RX 7900 XTX – 24GB", Things.GPU, 2));
        items.add(new Item("\nNVIDIA GeForce RTX 4090 – 24GB", Things.GPU, 2));

        // --- RAM ---
        items.add(new Item("\nLexar Desktop Memory – DDR4", Things.RAM, 50));
        items.add(new Item("\nHikvision U10 / U100 – DDR4", Things.RAM, 40));
        items.add(new Item("\nAdata XPG Gammix D30 – DDR4", Things.RAM, 30));
        items.add(new Item("\nCorsair Vengeance LPX – DDR4", Things.RAM, 25));
        items.add(new Item("\nTeamGroup T-Force Vulcan Z – DDR4", Things.RAM, 35));

        items.add(new Item("\nCorsair Vengeance RGB PRO – DDR4", Things.RAM, 20));
        items.add(new Item("\nG.Skill Ripjaws V – DDR4", Things.RAM, 25));
        items.add(new Item("\nTeamGroup Delta RGB – DDR4", Things.RAM, 18));
        items.add(new Item("\nAdata XPG Lancer – DDR5", Things.RAM, 15));
        items.add(new Item("\nKingston Fury Beast – DDR5", Things.RAM, 20));

        items.add(new Item("\nG.Skill Trident Z5 Neo RGB – DDR5", Things.RAM, 10));
        items.add(new Item("\nCorsair Vengeance RGB – DDR5", Things.RAM, 12));
        items.add(new Item("\nTeamGroup Delta RGB White – DDR5", Things.RAM, 10));
        items.add(new Item("\nCorsair Dominator Platinum – DDR5", Things.RAM, 5));
        items.add(new Item("\nAdata XPG Lancer RGB – DDR5", Things.RAM, 8));

        // --- CASINGS ---
        items.add(new Item("\nThunder Furor TGC-225W", Things.CASING, 10));
        items.add(new Item("\n1st Player DK3", Things.CASING, 12));
        items.add(new Item("\nEASE EC144B Tempered Glass", Things.CASING, 8));
        items.add(new Item("\nBoost Wolf Series", Things.CASING, 15));
        items.add(new Item("\nAigo Darkflash A290", Things.CASING, 20));

        items.add(new Item("\nMontech Sky Two", Things.CASING, 8));
        items.add(new Item("\nDeepCool CH560 Digital", Things.CASING, 6));
        items.add(new Item("\nLian Li Lancool 216", Things.CASING, 7));
        items.add(new Item("\n1st Player Steampunk SP8", Things.CASING, 5));
        items.add(new Item("\nCorsair 3000D Airflow", Things.CASING, 10));

        items.add(new Item("\nLian Li O11 Dynamic EVO", Things.CASING, 4));
        items.add(new Item("\nHyte Y60", Things.CASING, 3));
        items.add(new Item("\nLian Li O11 Vision", Things.CASING, 3));
        items.add(new Item("\nNZXT H9 Flow", Things.CASING, 5));
        items.add(new Item("\nCorsair 5000D Airflow", Things.CASING, 6));
    }

    // --- LEGACY METHODS (Kept for Group Member) ---
    public void stockDisplay() {
        System.out.println("----* STOCK OVERVIEW *----");
        for (Things t : Things.values()) {
            System.out.println();
            System.out.println(" " + t + ": ");
            for (Item i : items) {
                if (i.getThings() == t) {
                    i.showRecord();
                }
            }
            System.out.println(" ------------- ");
        }
    }

    public void restock() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select Category to Restock:");
        Things[] cats = Things.values();
        for (int i = 0; i < cats.length; i++) {
            System.out.println(i + ". " + cats[i]);
        }
        int catIndex = sc.nextInt();
        Things selected = cats[catIndex];

        System.out.println("Items in " + selected + ":");
        ArrayList<Item> temp = new ArrayList<>();
        for (Item i : items) {
            if (i.getThings() == selected) temp.add(i);
        }
        for (int i = 0; i < temp.size(); i++) {
            System.out.println(i + " -- " + temp.get(i).getName() + " (" + temp.get(i).getUnit() + ")");
        }
        System.out.print("Select Item index: ");
        int itemIdx = sc.nextInt();
        System.out.print("Enter amount to add: ");
        int amount = sc.nextInt();
        temp.get(itemIdx).addStock(amount);
    }

    // ==========================================
    //      PART 2: GUI HELPER METHODS
    // ==========================================

    public ArrayList<Item> getItems() {
        return items;
    }

    public void restockItem(int index, int amount) {
        if (index >= 0 && index < items.size()) {
            Item i = items.get(index);
            i.setUnit(i.getUnit() + amount);
        }
    }

    public boolean deductStock(String componentName) {
        for (Item item : items) {
            // "Fuzzy" match to handle extra details like "\n" or "Socket: AM4"
            String cleanItemName = item.getName().replace("\n", "").trim();
            if (cleanItemName.contains(componentName) || componentName.contains(cleanItemName)) {
                if (item.getUnit() > 0) {
                    item.setUnit(item.getUnit() - 1);
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }
}