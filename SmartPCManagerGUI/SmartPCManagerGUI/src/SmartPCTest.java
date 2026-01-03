
import java.util.ArrayList;

public class SmartPCTest {

    // --- STATIC LISTS (Connected to the GUI) ---
    public static ArrayList<CPU> budgetCPUs = new ArrayList<>();
    public static ArrayList<CPU> midCPUs = new ArrayList<>();
    public static ArrayList<CPU> highCPUs = new ArrayList<>();

    public static ArrayList<Motherboard> budgetMotherboard = new ArrayList<>();
    public static ArrayList<Motherboard> midMotherboard = new ArrayList<>();
    public static ArrayList<Motherboard> highMotherboard = new ArrayList<>();

    public static ArrayList<GPU> budgetGPUs = new ArrayList<>();
    public static ArrayList<GPU> midGPUs = new ArrayList<>();
    public static ArrayList<GPU> highGPUs = new ArrayList<>();

    public static ArrayList<RAM> budgetRAM = new ArrayList<>();
    public static ArrayList<RAM> midRAM = new ArrayList<>();
    public static ArrayList<RAM> highRAM = new ArrayList<>();

    public static ArrayList<Casing> budgetCasing = new ArrayList<>();
    public static ArrayList<Casing> midCasing = new ArrayList<>();
    public static ArrayList<Casing> highCasing = new ArrayList<>();

    public static void stockItems() {
        // 1. Clear lists to prevent duplicates if this is called multiple times
        budgetCPUs.clear(); midCPUs.clear(); highCPUs.clear();
        budgetMotherboard.clear(); midMotherboard.clear(); highMotherboard.clear();
        budgetGPUs.clear(); midGPUs.clear(); highGPUs.clear();
        budgetRAM.clear(); midRAM.clear(); highRAM.clear();
        budgetCasing.clear(); midCasing.clear(); highCasing.clear();

        // ==========================================
        //             BUDGET SEGMENT
        // ==========================================
        budgetCPUs.add(new CPU("AMD Ryzen 5 3600", 19000, "AM4",
                "Cores/Threads: 6 / 12" +
                        "\nBase Clock: 3.6 GHz" +
                        "\nBoost Clock: 4.2 GHz" +
                        "\nCache (L3): 32 MB" +
                        "\nTDP: 65W\nSocket: AM4" +
                        "\nPCIe Version: PCIe 4.0" +
                        "\nMemory Support: DDR4-3200" +
                        "\nIntegrated Graphics: None"));

        budgetCPUs.add(new CPU("Intel Core i3-12100F", 24000, "LGA1700",
                "Cores/Threads: 4 / 8" +
                        "\nBase Clock: 3.3 GHz" +
                        "\nBoost Clock: 4.3 GHz" +
                        "\nCache (L3): 12 MB" +
                        "\nTDP: 58W" +
                        "\nSocket: LGA1700" +
                        "\nPCIe Version: PCIe 5.0 / 4.0" +
                        "\nMemory Support: DDR4-3200 / DDR5-4800" +
                        "\nIntegrated Graphics: None"));

        budgetCPUs.add(new CPU("AMD Ryzen 5 5500", 31000, "AM4",
                "Cores/Threads: 6 / 12" +
                        "\nBase Clock: 3.6 GHz" +
                        "\nBoost Clock: 4.2 GHz" +
                        "\nCache (L3): 16 MB" +
                        "\nTDP: 65W\nSocket: AM4" +
                        "\nPCIe Version: PCIe 3.0" +
                        "\nMemory Support: DDR4-3200" +
                        "\nIntegrated Graphics: None"));

        budgetCPUs.add(new CPU("AMD Ryzen 5 4600G", 36000, "AM4",
                "Cores/Threads: 6 / 12" +
                        "\nBase Clock: 3.7 GHz" +
                        "\nBoost Clock: 4.2 GHz" +
                        "\nCache (L3): 8 MB" +
                        "\nTDP: 65W\nSocket: AM4" +
                        "\nPCIe Version: PCIe 3.0" +
                        "\nMemory Support: DDR4-3200" +
                        "\nIntegrated Graphics: Radeon Vega 7"));

        budgetCPUs.add(new CPU("AMD Ryzen 5 2600", 15000, "AM4",
                "Cores/Threads: 6 / 12" +
                        "\nBase Clock: 3.4 GHz" +
                        "\nBoost Clock: 3.9 GHz" +
                        "\nCache (L3): 16 MB" +
                        "\nTDP: 65W\nSocket: AM4" +
                        "\nPCIe Version: PCIe 3.0" +
                        "\nMemory Support: DDR4-2933" +
                        "\nIntegrated Graphics: None"));


        budgetMotherboard.add(new Motherboard("Gigabyte B450M DS3H V2", 25000, "AM4", "Micro-ATX", "DDR4",
                "The \"National Board\" of Pakistan. Reliable, has 4 RAM slots (rare for budget), and decent features."));

        budgetMotherboard.add(new Motherboard("MSI B450M-A PRO MAX II", 21000, "AM4", "Micro-ATX", "DDR4",
                "Budget-friendly AM4 board with B450 chipset, supports DDR4 up to 64GB, 1× PCIe x16 + 1× PCIe x1 slots, M.2 + SATA storage and 2.5G LAN."));

        budgetMotherboard.add(new Motherboard("ASUS Prime H610M-K D4", 26500, "LGA1700", "Micro-ATX", "DDR4",
                "Intel H610 chipset mATX board, 2x DDR4 DIMM up to 64 GB, PCIe 4.0 x16, M.2 + SATA, HDMI + D-Sub, good for 12th–14th Gen Intel builds."));

        budgetMotherboard.add(new Motherboard("Biostar B450MH", 19000, "AM4", "Micro-ATX", "DDR4",
                "Budget AM4 B450 board — 2× DDR4 DIMM (up to 32 GB), 1× PCIe x16 + PCIe x1 slots, M.2 + 4× SATA, HDMI/VGA outputs, Realtek Gigabit LAN & HD-Audio."));

        budgetMotherboard.add(new Motherboard("Gigabyte H610M H V2", 28000, "LGA1700", "Micro-ATX", "DDR4",
                "Entry-level Intel H610 chipset mATX board, 2× DDR4 DIMM up to 64 GB, PCIe 4.0 x16, M.2 + SATA, basic I/O — good for budget Intel 12th/13th-gen builds."));


        budgetGPUs.add(new GPU("AMD Radeon RX 580", 28000, "Cores: 2304\n" +
                "Base Clock: 1257 MHz\n" +
                "Boost Clock: 1340 MHz\n" +
                "VRAM: 8 GB GDDR5\n" +
                "Memory Bus: 256-bit\n" +
                "TDP: 185 W\n" +
                "Interface: PCIe 3.0 x16"));

        budgetGPUs.add(new GPU("NVIDIA GeForce GTX 1660 SUPER", 48000,
                "Cores: 1408\n" +
                        "Base Clock: 1530 MHz\n" +
                        "Boost Clock: 1785 MHz\n" +
                        "VRAM: 6 GB GDDR6\n" +
                        "Memory Bus: 192-bit\n" +
                        "TDP: 125 W\n" +
                        "Interface: PCIe 3.0 x16"));

        budgetGPUs.add(new GPU("AMD Radeon RX 5600 XT", 45000,
                "Cores: 2304\n" +
                        "Base Clock: 1130 MHz\n" +
                        "Boost Clock: 1560 MHz\n" +
                        "VRAM: 6 GB GDDR6\n" +
                        "Memory Bus: 192-bit\n" +
                        "TDP: 150 W\n" +
                        "Interface: PCIe 4.0 x16"));

        budgetGPUs.add(new GPU("NVIDIA GeForce RTX 2060", 55000,
                "Cores: 1920\n" +
                        "Base Clock: 1365 MHz\n" +
                        "Boost Clock: 1680 MHz\n" +
                        "VRAM: 6 GB GDDR6\n" +
                        "Memory Bus: 192-bit\n" +
                        "TDP: 160 W\n" +
                        "Interface: PCIe 3.0 x16"));

        budgetGPUs.add(new GPU("AMD Radeon RX 5500 XT", 38000,
                "Cores: 1408\n" +
                        "Base Clock: 1607 MHz\n" +
                        "Boost Clock: 1845 MHz\n" +
                        "VRAM: 4/8 GB GDDR6\n" +
                        "Memory Bus: 128-bit\n" +
                        "TDP: 130 W\n" +
                        "Interface: PCIe 4.0 x8"));

        budgetRAM.add(new RAM("Lexar Desktop Memory", 4500, "DDR4",
                "The most common \"Green PCB\" RAM. No heatsink, ugly look, but works perfectly. Ideal for ultra-tight budgets."));

        budgetRAM.add(new RAM("Hikvision U10 / U100", 5000, "DDR4",
                "Surprisingly reliable. Comes with a basic black heat spreader, so it looks better than the raw green chips."));

        budgetRAM.add(new RAM("Adata XPG Gammix D30", 6000, "DDR4",
                "The entry-level \"Gaming\" RAM. Has a nice red/black heatsink and decent overclocking potential."));

        budgetRAM.add(new RAM("Corsair Vengeance LPX", 6500, "DDR4",
                "The legendary low-profile RAM. Fits under any CPU cooler. Very high resale value in Lahore."));

        budgetRAM.add(new RAM("TeamGroup T-Force Vulcan Z", 5500, "DDR4",
                "Excellent value. Often cheaper than Corsair but performs identically. Comes in Grey or Red."));

        budgetCasing.add(new Casing("Thunder Furor TGC-225W", 14500, "ATX"));
        budgetCasing.add(new Casing("1st Player DK3", 12000, "ATX"));
        budgetCasing.add(new Casing("EASE EC144B Tempered Glass", 13500, "ATX"));
        budgetCasing.add(new Casing("Boost Wolf Series", 10500, "Micro-ATX"));
        budgetCasing.add(new Casing("Aigo Darkflash A290", 9500, "Micro-ATX"));


        // ==========================================
        //             MID-RANGE SEGMENT
        // ==========================================
        midCPUs.add(new CPU("AMD Ryzen 5 5600", 36000, "AM4",
                "Cores/Threads: 6 / 12" +
                        "\nBase Clock: 3.5 GHz" +
                        "\nBoost Clock: 4.4 GHz" +
                        "\nCache (L3): 32 MB" +
                        "\nTDP: 65W\nSocket: AM4" +
                        "\nPCIe Version: PCIe 4.0" +
                        "\nMemory Support: DDR4-3200" +
                        "\nIntegrated Graphics: None"));

        midCPUs.add(new CPU("Intel Core i5-12400F", 41000, "LGA1700",
                "Cores/Threads: 6 / 12" +
                        "\nBase Clock: 2.5 GHz" +
                        "\nBoost Clock: 4.4 GHz" +
                        "\nCache (L3): 18 MB" +
                        "\nTDP: 65W" +
                        "\nSocket: LGA1700" +
                        "\nPCIe Version: PCIe 5.0 / 4.0" +
                        "\nMemory Support: DDR4-3200 / DDR5-4800" +
                        "\nIntegrated Graphics: None"));

        midCPUs.add(new CPU("AMD Ryzen 7 5700X", 45000, "AM4",
                "Cores/Threads: 8 / 16" +
                        "\nBase Clock: 3.4 GHz" +
                        "\nBoost Clock: 4.6 GHz" +
                        "\nCache (L3): 32 MB" +
                        "\nTDP: 65W\nSocket: AM4" +
                        "\nPCIe Version: PCIe 4.0" +
                        "\nMemory Support: DDR4-3200" +
                        "\nIntegrated Graphics: None"));

        midCPUs.add(new CPU("AMD Ryzen 5 7500F", 50000, "AM5",
                "Cores/Threads: 6 / 12" +
                        "\nBase Clock: 3.7 GHz" +
                        "\nBoost Clock: 5.0 GHz" +
                        "\nCache (L3): 32 MB" +
                        "\nTDP: 65W\nSocket: AM5" +
                        "\nPCIe Version: PCIe 5.0" +
                        "\nMemory Support: DDR5-5200" +
                        "\nIntegrated Graphics: None"));

        midCPUs.add(new CPU("AMD Ryzen 5 8600G", 55000, "AM5",
                "Cores/Threads: 6 / 12" +
                        "\nBase Clock: 4.3 GHz" +
                        "\nBoost Clock: 5.0 GHz" +
                        "\nCache (L3): 16 MB" +
                        "\nTDP: 65W\nSocket: AM5" +
                        "\nPCIe Version: PCIe 4.0" +
                        "\nMemory Support: DDR5-5200" +
                        "\nIntegrated Graphics: Radeon 760M (High End APU)"));

        midMotherboard.add(new Motherboard("MSI B550M PRO-VDH WiFi", 37000, "AM4", "Micro-ATX", "DDR4",
                "Best Value AM4 board. Features Wi-Fi AC/Bluetooth, Core Boost, PCIe 4.0, and M.2 Shield Frozr cooling."));

        midMotherboard.add(new Motherboard("ASUS Prime B760M-K D4", 38000, "LGA1700", "Micro-ATX", "DDR4",
                "Solid mid-range Intel board for 12th/13th/14th Gen. Supports DDR4, PCIe 4.0, and dual M.2 slots."));

        midMotherboard.add(new Motherboard("Gigabyte B760M DS3H AX", 46000, "LGA1700", "Micro-ATX", "DDR5",
                "Great entry to DDR5 Intel builds. Includes Wi-Fi 6E, Hybrid Digital VRM, and PCIe 4.0 support."));

        midMotherboard.add(new Motherboard("MSI PRO B650M-P", 40000, "AM5", "Micro-ATX", "DDR5",
                "The cheapest reliable way to get onto the new AM5 platform. DDR5 support, 2.5G LAN, and core boost."));

        midMotherboard.add(new Motherboard("Gigabyte B550M K", 32000, "AM4", "Micro-ATX", "DDR4",
                "Cost-effective B550 alternative. Supports PCIe 4.0 NVMe, Smart Fan 5, and GbE LAN without WiFi tax."));


        midGPUs.add(new GPU("AMD Radeon RX 6600", 75000,
                "Cores: 1792\nBase Clock: 2044 MHz\nBoost Clock: 2491 MHz\n" +
                        "VRAM: 8 GB GDDR6\nBus: 128-bit\nTDP: 132 W\nInterface: PCIe 4.0 x8"));

        midGPUs.add(new GPU("NVIDIA GeForce RTX 3060", 95000,
                "Cores: 3584\nBase Clock: 1320 MHz\nBoost Clock: 1777 MHz\n" +
                        "VRAM: 12 GB GDDR6\nBus: 192-bit\nTDP: 170 W\nInterface: PCIe 4.0 x16"));

        midGPUs.add(new GPU("NVIDIA GeForce RTX 4060", 110000,
                "Cores: 3072\nBase Clock: 1830 MHz\nBoost Clock: 2460 MHz\n" +
                        "VRAM: 8 GB GDDR6\nBus: 128-bit\nTDP: 115 W\nInterface: PCIe 4.0 x8 (DLSS 3.0 Support)"));

        midGPUs.add(new GPU("AMD Radeon RX 6700 XT", 90000,
                "Cores: 2560\nBase Clock: 2321 MHz\nBoost Clock: 2581 MHz\n" +
                        "VRAM: 12 GB GDDR6\nBus: 192-bit\nTDP: 230 W\nInterface: PCIe 4.0 x16"));

        midGPUs.add(new GPU("NVIDIA GeForce RTX 3060 Ti", 90000,
                "Cores: 4864\nBase Clock: 1410 MHz\nBoost Clock: 1665 MHz\n" +
                        "VRAM: 8 GB GDDR6\nBus: 256-bit\nTDP: 200 W\nInterface: PCIe 4.0 x16"));

        midRAM.add(new RAM("Corsair Vengeance RGB PRO", 16500, "DDR4",
                "The King of RGB. Dynamic Multi-Zone RGB Lighting, optimized for peak performance and iCUE software."));

        midRAM.add(new RAM("G.Skill Ripjaws V", 26000, "DDR4",
                "Best performance-per-rupee for high capacity. Classic Black heat spreader, no RGB, just raw speed."));

        midRAM.add(new RAM("TeamGroup Delta RGB", 15000, "DDR4",
                "Best White RAM option. Features 120° ultra-wide angle lighting and aluminum alloy heat spreader."));

        midRAM.add(new RAM("Adata XPG Lancer", 32000, "DDR5",
                "Entry-level DDR5. Built-in PMIC for power stability and ECC. Good for budget AM5 builds."));

        midRAM.add(new RAM("Kingston Fury Beast", 22000, "DDR5",
                "One of the few 16GB DDR5 kits available. Low-profile heat spreader design."));

        midCasing.add(new Casing("Montech Sky Two", 38000, "ATX"));
        midCasing.add(new Casing("DeepCool CH560 Digital", 41000, "E-ATX"));
        midCasing.add(new Casing("Lian Li Lancool 216", 34000, "E-ATX"));
        midCasing.add(new Casing("1st Player Steampunk SP8", 36500, "ATX"));
        midCasing.add(new Casing("Corsair 3000D Airflow", 24000, "ATX"));


        // ==========================================
        //             HIGH-END SEGMENT
        // ==========================================
        highCPUs.add(new CPU("Intel Core i5-14600K", 78000, "LGA1700",
                "Cores/Threads: 14 (6P+8E) / 20" +
                        "\nBase Clock: 3.5 GHz" +
                        "\nBoost Clock: 5.3 GHz" +
                        "\nCache (L3): 24 MB" +
                        "\nTDP: 125W\nSocket: LGA1700" +
                        "\nPCIe Version: PCIe 5.0" +
                        "\nMemory Support: DDR5-5600" +
                        "\nIntegrated Graphics: UHD 770"));

        highCPUs.add(new CPU("AMD Ryzen 7 7800X3D", 105000, "AM5",
                "Cores/Threads: 8 / 16" +
                        "\nBase Clock: 4.2 GHz" +
                        "\nBoost Clock: 5.0 GHz" +
                        "\nCache (L3): 96 MB (3D V-Cache)" +
                        "\nTDP: 120W\nSocket: AM5" +
                        "\nPCIe Version: PCIe 5.0" +
                        "\nMemory Support: DDR5-5200" +
                        "\nIntegrated Graphics: Radeon Graphics"));

        highCPUs.add(new CPU("Intel Core i7-14700K", 120000, "LGA1700",
                "Cores/Threads: 20 (8P+12E) / 28" +
                        "\nBase Clock: 3.4 GHz" +
                        "\nBoost Clock: 5.6 GHz" +
                        "\nCache (L3): 33 MB" +
                        "\nTDP: 125W\nSocket: LGA1700" +
                        "\nPCIe Version: PCIe 5.0" +
                        "\nMemory Support: DDR5-5600" +
                        "\nIntegrated Graphics: UHD 770"));

        highCPUs.add(new CPU("AMD Ryzen 9 7900X", 92000, "AM5",
                "Cores/Threads: 12 / 24" +
                        "\nBase Clock: 4.7 GHz" +
                        "\nBoost Clock: 5.6 GHz" +
                        "\nCache (L3): 64 MB" +
                        "\nTDP: 170W\nSocket: AM5" +
                        "\nPCIe Version: PCIe 5.0" +
                        "\nMemory Support: DDR5-5200" +
                        "\nIntegrated Graphics: Radeon Graphics"));

        highCPUs.add(new CPU("Intel Core i9-14900K", 135000, "LGA1700",
                "Cores/Threads: 24 (8P+16E) / 32" +
                        "\nBase Clock: 3.2 GHz" +
                        "\nBoost Clock: 6.0 GHz" +
                        "\nCache (L3): 36 MB" +
                        "\nTDP: 125W (253W Boost)\nSocket: LGA1700" +
                        "\nPCIe Version: PCIe 5.0" +
                        "\nMemory Support: DDR5-5600" +
                        "\nIntegrated Graphics: UHD 770"));

        highMotherboard.add(new Motherboard("MSI MAG B650 Tomahawk WiFi", 72000, "AM5", "ATX", "DDR5",
                "The Gold Standard for AM5. Premium build, all-black aesthetic, robust 14+2+1 VRM design, and Wi-Fi 6E."));

        highMotherboard.add(new Motherboard("Gigabyte Z790 UD AX", 68000, "LGA1700", "ATX", "DDR5",
                "Entry-level Z790. Allows K-series overclocking. Features PCIe 5.0, triple M.2 slots, and VisionLINK."));

        highMotherboard.add(new Motherboard("ASUS ROG Strix B760-A Gaming", 76000, "LGA1700", "ATX", "DDR5",
                "Beautiful White Motherboard with silver heatsinks. SupremeFX audio, WiFi 6E, and pre-mounted I/O shield."));

        highMotherboard.add(new Motherboard("MSI MAG Z790 Tomahawk WiFi", 94000, "LGA1700", "ATX", "DDR5",
                "Heavy-duty board for i7/i9. Server-grade PCB, Lightning Gen 5 PCIe, and extensive thermal solutions."));

        highMotherboard.add(new Motherboard("Gigabyte X670 Gaming X AX", 85000, "AM5", "ATX", "DDR5",
                "Enthusiast X670 chipset. Offers more PCIe lanes, 4x M.2 slots, and advanced thermal design for overclocking."));


        highGPUs.add(new GPU("NVIDIA GeForce RTX 4070 SUPER", 225000,
                "Cores: 7168\nBase Clock: 1980 MHz\nBoost Clock: 2475 MHz\n" +
                        "VRAM: 12 GB GDDR6X\nBus: 192-bit\nTDP: 220 W\nInterface: PCIe 4.0 x16"));

        highGPUs.add(new GPU("AMD Radeon RX 7800 XT", 185000,
                "Cores: 3840\nBase Clock: 2124 MHz\nBoost Clock: 2430 MHz\n" +
                        "VRAM: 16 GB GDDR6\nBus: 256-bit\nTDP: 263 W\nInterface: PCIe 4.0 x16"));

        highGPUs.add(new GPU("NVIDIA GeForce RTX 4080 SUPER", 350000,
                "Cores: 10240\nBase Clock: 2295 MHz\nBoost Clock: 2550 MHz\n" +
                        "VRAM: 16 GB GDDR6X\nBus: 256-bit\nTDP: 320 W\nInterface: PCIe 4.0 x16"));

        highGPUs.add(new GPU("AMD Radeon RX 7900 XTX", 360000,
                "Cores: 6144\nBase Clock: 2300 MHz\nBoost Clock: 2500 MHz\n" +
                        "VRAM: 24 GB GDDR6\nBus: 384-bit\nTDP: 355 W\nInterface: PCIe 4.0 x16"));

        highGPUs.add(new GPU("NVIDIA GeForce RTX 4090", 700000,
                "Cores: 16384\nBase Clock: 2235 MHz\nBoost Clock: 2520 MHz\n" +
                        "VRAM: 24 GB GDDR6X\nBus: 384-bit\nTDP: 450 W\nInterface: PCIe 4.0 x16"));

        highRAM.add(new RAM("G.Skill Trident Z5 Neo RGB", 45000, "DDR5",
                "The Best for Ryzen (EXPO Tuned). Streamlined RGB bar and premium heatsink."));

        highRAM.add(new RAM("Corsair Vengeance RGB DDR5", 40000, "DDR5",
                "Safe and Beautiful. Ten-zone dynamic RGB lighting with iCUE control."));

        highRAM.add(new RAM("TeamGroup Delta RGB White", 39000, "DDR5",
                "Aesthetic Choice. 6400MHz. Full frame 120° ultra-wide angle lighting, perfect for white builds."));

        highRAM.add(new RAM("Corsair Dominator Platinum", 55000, "DDR5",
                "Luxury RAM. 6200MHz. Features patented DHX cooling and ultra-bright Capellix LEDs."));

        highRAM.add(new RAM("Adata XPG Lancer RGB", 36000, "DDR5",
                "Value High-End. 6000MHz CL30. Customizable RGB and PMIC for power stability."));

        highCasing.add(new Casing("Lian Li O11 Dynamic EVO", 60000, "E-ATX"));
        highCasing.add(new Casing("Hyte Y60", 55000, "E-ATX"));
        highCasing.add(new Casing("Lian Li O11 Vision", 48000, "E-ATX"));
        highCasing.add(new Casing("NZXT H9 Flow", 65000, "ATX"));
        highCasing.add(new Casing("Corsair 5000D Airflow", 52000, "ATX"));
    }
}