import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class MainGUI extends JFrame {

    // Theme Colors
    private final Color SIDEBAR_BG = new Color(33, 37, 41);
    private final Color TEXT_COLOR = Color.WHITE;
    private final Color ACCENT_COLOR = Color.DARK_GRAY;
    private final Color LOGIN_BG = new Color(240, 242, 245);

    private JPanel contentPanel;
    private CardLayout cardLayout;

    // Builder State
    private Builder currentBuild = new Builder();
    private Data storeData = new Data();

    private boolean isFiltering = false;
    private DefaultTableModel inventoryModel;

    // Login Fields
    private JTextField userField;
    private JPasswordField passField;

    public MainGUI() {
        setTitle("Smart PC Configurator");
        setSize(1000, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // --- Sidebar ---
        JPanel sidebar = new JPanel(new GridLayout(10, 1, 0, 5));
        sidebar.setBackground(SIDEBAR_BG);
        sidebar.setPreferredSize(new Dimension(200, 0));
        sidebar.setBorder(new EmptyBorder(20, 10, 20, 10));

        JLabel title = new JLabel("PC MANAGER", SwingConstants.CENTER);
        title.setForeground(TEXT_COLOR);
        title.setFont(new Font("Segoe UI", Font.BOLD, 18));
        sidebar.add(title);
        sidebar.add(Box.createVerticalStrut(20));

        sidebar.add(createNavButton("Home"));
        sidebar.add(createNavButton("PC Builder"));
        sidebar.add(createNavButton("Inventory"));
        sidebar.add(createNavButton("Exit"));

        add(sidebar, BorderLayout.WEST);

        // --- Content Area ---
        cardLayout = new CardLayout();
        contentPanel = new JPanel(cardLayout);

        contentPanel.add(createHomePanel(), "Home");
        contentPanel.add(createBuilderPanel(), "PC Builder");
        contentPanel.add(createLoginPanel(), "Login");
        contentPanel.add(createInventoryPanel(), "Inventory");

        add(contentPanel, BorderLayout.CENTER);
    }

    private JButton createNavButton(String name) {
        JButton btn = new JButton(name);
        btn.setBackground(SIDEBAR_BG);
        btn.setForeground(TEXT_COLOR);
        btn.setFocusPainted(false);
        btn.setBorderPainted(false);
        btn.setHorizontalAlignment(SwingConstants.LEFT);
        btn.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));

        btn.addActionListener(e -> {
            if (name.equals("Exit")) {
                System.exit(0);
            }
            else if (name.equals("Inventory")) {
                userField.setText("");
                passField.setText("");
                cardLayout.show(contentPanel, "Login");
            }
            else {
                cardLayout.show(contentPanel, name);
            }
        });
        return btn;
    }

    // --- LOGIN PANEL (Full Screen) ---
    private JPanel createLoginPanel() {
        JPanel mainPanel = new JPanel(new GridBagLayout());
        mainPanel.setBackground(LOGIN_BG);

        // The "Card" Box
        JPanel loginBox = new JPanel();
        loginBox.setLayout(new BoxLayout(loginBox, BoxLayout.Y_AXIS));
        loginBox.setBackground(Color.WHITE);
        loginBox.setBorder(new CompoundBorder(
                new LineBorder(new Color(200, 200, 200), 1),
                new EmptyBorder(40, 40, 40, 40)
        ));

        JLabel title = new JLabel("Admin Login");
        title.setFont(new Font("Segoe UI", Font.BOLD, 24));
        title.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        title.setForeground(Color.DARK_GRAY);

        JLabel sub = new JLabel("Access Inventory System");
        sub.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        sub.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        sub.setForeground(Color.GRAY);

        userField = new JTextField(15);
        passField = new JPasswordField(15);

        Dimension fieldSize = new Dimension(250, 40);
        userField.setMaximumSize(fieldSize);
        passField.setMaximumSize(fieldSize);

        // --- BUTTON STYLING ---
        JButton loginBtn = new JButton("LOGIN");
        loginBtn.setBackground(ACCENT_COLOR);
        loginBtn.setForeground(Color.DARK_GRAY);
        loginBtn.setFocusPainted(false);
        loginBtn.setFont(new Font("Segoe UI", Font.BOLD, 14));
        loginBtn.setMaximumSize(new Dimension(250, 40));
        loginBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        loginBtn.setAlignmentX(JComponent.CENTER_ALIGNMENT);

        JLabel uLabel = new JLabel("Username");
        uLabel.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        uLabel.setFont(new Font("Segoi UI", Font.PLAIN, 12));
        uLabel.setForeground(Color.darkGray);

        JLabel pLabel = new JLabel("Password");
        pLabel.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        pLabel.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        pLabel.setForeground(Color.darkGray);

        // --- ADDING TO BOX WITH ADJUSTED SPACING ---
        loginBox.add(title);

        // Added space here to push "Access Inventory System" down
        loginBox.add(Box.createVerticalStrut(7));

        loginBox.add(sub);

        // Adjusted space here to keep it centered between title and fields
        loginBox.add(Box.createVerticalStrut(18));

        loginBox.add(uLabel);
        loginBox.add(Box.createVerticalStrut(3));

        loginBox.add(userField);
        loginBox.add(Box.createVerticalStrut(9));
        loginBox.add(pLabel);
        loginBox.add(Box.createVerticalStrut(3));

        loginBox.add(passField);
        loginBox.add(Box.createVerticalStrut(25));
        loginBox.add(loginBtn);

        loginBtn.addActionListener(e -> {
            String user = userField.getText();
            String pass = new String(passField.getPassword());

            if (user.equals("AlphaBros") && pass.equals("alpha@cuilahore")) {
                cardLayout.show(contentPanel, "Inventory");
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Credentials", "Access Denied", JOptionPane.ERROR_MESSAGE);
            }
        });

        mainPanel.add(loginBox);
        return mainPanel;
    }

    private JPanel createHomePanel() {
        JPanel p = new JPanel(new GridBagLayout());
        p.setBackground(Color.WHITE);
        JLabel l = new JLabel("Welcome to Smart PC Configurator");
        l.setFont(new Font("Segoe UI", Font.BOLD, 28));
        l.setForeground(Color.DARK_GRAY);
        p.add(l);
        return p;
    }

    private JPanel createInventoryPanel() {
        JPanel p = new JPanel(new BorderLayout());
        p.setBorder(new EmptyBorder(35,20,20,20));
        p.setBackground(Color.WHITE);

        JLabel head = new JLabel("Store Inventory (Admin Access)");
        head.setFont(new Font("Consolas", Font.BOLD, 26));
        head.setHorizontalAlignment(SwingConstants.CENTER);
        head.setForeground(Color.DARK_GRAY);
        p.add(head, BorderLayout.NORTH);

        String[] cols = {"Category", "Name", "Stock Units"};
        inventoryModel = new DefaultTableModel(cols, 0);
        refreshInventoryTable();

        JTable table = new JTable(inventoryModel);
        table.setRowHeight(30);

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        table.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);

        p.add(new JScrollPane(table), BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        bottomPanel.setBackground(Color.WHITE);

        JButton restockBtn = new JButton("Restock Selected Item");
        restockBtn.setBackground(ACCENT_COLOR);
        restockBtn.setForeground(ACCENT_COLOR);

        restockBtn.addActionListener(e -> {
            int selectedRow = table.getSelectedRow();
            if (selectedRow == -1) {
                JOptionPane.showMessageDialog(this, "Please select an item from the table to restock.");
                return;
            }

            String input = JOptionPane.showInputDialog(this, "Enter quantity to add:");
            if (input != null && !input.isEmpty()) {
                try {
                    int qty = Integer.parseInt(input);
                    if (qty > 0) {
                        storeData.restockItem(selectedRow, qty);
                        refreshInventoryTable();
                        JOptionPane.showMessageDialog(this, "Restocked successfully!");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(this, "Invalid number entered.");
                }
            }
        });

        bottomPanel.add(restockBtn);
        p.add(bottomPanel, BorderLayout.SOUTH);

        return p;
    }

    private void refreshInventoryTable() {
        inventoryModel.setRowCount(0);
        for(Item i : storeData.getItems()) {
            inventoryModel.addRow(new Object[]{
                    " " + i.getThings(),
                    " " + i.getName().replace("\n", "").trim(),
                    " " + i.getUnit()
            });
        }
    }

    // --- BUILDER LOGIC ---
    private JComboBox<String> budgetBox;
    private JComboBox<String> cpuBox, moboBox, ramBox, gpuBox, caseBox;
    private JTextArea detailsArea;

    private ArrayList<CPU> currentCPUs;
    private ArrayList<Motherboard> currentMobos;
    private ArrayList<RAM> currentRAMs;
    private ArrayList<GPU> currentGPUs;
    private ArrayList<Casing> currentCasings;

    private ArrayList<Motherboard> masterMobos;
    private ArrayList<RAM> masterRAMs;
    private ArrayList<Casing> masterCasings;

    private JLabel createOptionLabel(String text) {
        JLabel label = new JLabel(text);
        label.setFont(new Font("Arial", Font.BOLD, 14));
        label.setForeground(Color.DARK_GRAY);
        return label;
    }

    private JPanel createBuilderPanel() {
        JPanel main = new JPanel(new BorderLayout(10, 40));
        main.setBorder(new EmptyBorder(35,35,20,35));
        main.setBackground(Color.WHITE);

        JLabel head = new JLabel("Configuration");
        head.setFont(new Font("Consolas", Font.BOLD, 26));
        head.setHorizontalAlignment(SwingConstants.CENTER);
        head.setForeground(Color.DARK_GRAY);
        main.add(head, BorderLayout.NORTH);

        JPanel form = new JPanel(new GridLayout(6, 2, 10, 20));
        form.setBackground(Color.WHITE);

        budgetBox = new JComboBox<>(new String[]{"Select...", "Budget (100k-200k)", "Mid-Range (200k-400k)", "High-End (400k+)"});
        form.add(createOptionLabel("Select Budget:"));
        form.add(budgetBox);

        cpuBox = new JComboBox<>();
        moboBox = new JComboBox<>();
        ramBox = new JComboBox<>();
        gpuBox = new JComboBox<>();
        caseBox = new JComboBox<>();

        form.add(createOptionLabel("Processor (CPU):")); form.add(cpuBox);
        form.add(createOptionLabel("Motherboard:")); form.add(moboBox);
        form.add(createOptionLabel("Memory (RAM):")); form.add(ramBox);
        form.add(createOptionLabel("Graphics Card (GPU):")); form.add(gpuBox);
        form.add(createOptionLabel("Casing:")); form.add(caseBox);

        main.add(form, BorderLayout.CENTER);

        JPanel bottom = new JPanel(new BorderLayout());
        detailsArea = new JTextArea(8, 40);
        detailsArea.setEditable(false);
        detailsArea.setFont(new Font("Arial", Font.PLAIN, 12));
        detailsArea.setBorder(BorderFactory.createTitledBorder("Details"));
        bottom.add(new JScrollPane(detailsArea), BorderLayout.CENTER);

        JButton printBtn = new JButton("Generate Receipt");
        printBtn.setBackground(ACCENT_COLOR);
        printBtn.setForeground(Color.DARK_GRAY);

        printBtn.setFont(new Font("Segoe UI", Font.BOLD, 14));
        bottom.add(printBtn, BorderLayout.EAST);

        main.add(bottom, BorderLayout.SOUTH);

        budgetBox.addActionListener(e -> loadComponentsForBudget(budgetBox.getSelectedIndex()));

        cpuBox.addActionListener(e -> {
            if (isFiltering) return;
            if(cpuBox.getSelectedIndex() >= 0 && currentCPUs != null) {
                CPU c = currentCPUs.get(cpuBox.getSelectedIndex());
                currentBuild.selectedCPU = c;
                detailsArea.setText(c.getDetails());
                filterMotherboards(c.getSocket());
            }
        });

        moboBox.addActionListener(e -> {
            if (isFiltering) return;
            if(moboBox.getSelectedIndex() >= 0 && currentMobos != null) {
                Motherboard m = currentMobos.get(moboBox.getSelectedIndex());
                currentBuild.selectedMotherboard = m;
                detailsArea.setText(m.getDetails());
                filterRAM(m.getRamType());
                filterCasing(m.getFormFactor());
            }
        });

        ramBox.addActionListener(e -> {
            if (isFiltering) return;
            if(ramBox.getSelectedIndex() >= 0 && currentRAMs != null) {
                currentBuild.selectedRAM = currentRAMs.get(ramBox.getSelectedIndex());
                detailsArea.setText(currentBuild.selectedRAM.getDetails());
            }
        });

        gpuBox.addActionListener(e -> {
            if (isFiltering) return;
            if(gpuBox.getSelectedIndex() >= 0 && currentGPUs != null) {
                currentBuild.selectedGPU = currentGPUs.get(gpuBox.getSelectedIndex());
                detailsArea.setText(currentBuild.selectedGPU.getDetails());
            }
        });

        caseBox.addActionListener(e -> {
            if (isFiltering) return;
            if(caseBox.getSelectedIndex() >= 0 && currentCasings != null) {
                currentBuild.selectedCasing = currentCasings.get(caseBox.getSelectedIndex());
                detailsArea.setText(currentBuild.selectedCasing.getDetails());
            }
        });

        // --- UPDATED ACTION LISTENER WITH COMMAS AND INTEGER CASTING ---
        printBtn.addActionListener(e -> {
            if(currentBuild.selectedCPU != null && currentBuild.selectedMotherboard != null && currentBuild.selectedRAM != null && currentBuild.selectedGPU != null && currentBuild.selectedCasing != null) {

                // 1. Get the total from your Builder class
                double totalAmount = currentBuild.calculateTotal();

                // 2. Show Confirmation Dialog (Used String.format to add commas to the integer)
                int choice = JOptionPane.showConfirmDialog(
                        this,
                        "Total Bill: Rs " + String.format("%,d", (int)totalAmount) + "\nDo you want to proceed and generate the receipt?",
                        "Confirm Order",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.INFORMATION_MESSAGE
                );

                // 3. Only proceed if user clicked YES
                if (choice == JOptionPane.YES_OPTION) {
                    currentBuild.printReceipt();
                    storeData.deductStock(currentBuild.selectedCPU.getName());
                    storeData.deductStock(currentBuild.selectedMotherboard.getName());
                    storeData.deductStock(currentBuild.selectedRAM.getName());
                    storeData.deductStock(currentBuild.selectedGPU.getName());
                    storeData.deductStock(currentBuild.selectedCasing.getName());
                    refreshInventoryTable();
                    JOptionPane.showMessageDialog(this, "Receipt saved and Inventory updated!");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Please select all components first.");
            }
        });

        return main;
    }

    private void loadComponentsForBudget(int index) {
        if(index < 1) return;
        isFiltering = true;
        try {
            cpuBox.removeAllItems(); gpuBox.removeAllItems();
            moboBox.removeAllItems(); ramBox.removeAllItems(); caseBox.removeAllItems();
            currentBuild.selectedCPU = null; currentBuild.selectedMotherboard = null;
            currentBuild.selectedRAM = null; currentBuild.selectedGPU = null;
            currentBuild.selectedCasing = null;
            detailsArea.setText("");

            if(index == 1) {
                currentCPUs = SmartPCTest.budgetCPUs; currentGPUs = SmartPCTest.budgetGPUs;
                masterMobos = SmartPCTest.budgetMotherboard; masterRAMs = SmartPCTest.budgetRAM;
                masterCasings = SmartPCTest.budgetCasing;
            } else if (index == 2) {
                currentCPUs = SmartPCTest.midCPUs; currentGPUs = SmartPCTest.midGPUs;
                masterMobos = SmartPCTest.midMotherboard; masterRAMs = SmartPCTest.midRAM;
                masterCasings = SmartPCTest.midCasing;
            } else {
                currentCPUs = SmartPCTest.highCPUs; currentGPUs = SmartPCTest.highGPUs;
                masterMobos = SmartPCTest.highMotherboard; masterRAMs = SmartPCTest.highRAM;
                masterCasings = SmartPCTest.highCasing;
            }

            currentMobos = new ArrayList<>(masterMobos);
            currentRAMs = new ArrayList<>(masterRAMs);
            currentCasings = new ArrayList<>(masterCasings);

            for(CPU c : currentCPUs) cpuBox.addItem(c.getName());
            for(GPU g : currentGPUs) gpuBox.addItem(g.getName());

            cpuBox.setSelectedIndex(-1);
            gpuBox.setSelectedIndex(-1);
        } finally {
            isFiltering = false;
        }
    }

    private void filterMotherboards(String socket) {
        isFiltering = true;
        try {
            moboBox.removeAllItems();
            ArrayList<Motherboard> filtered = new ArrayList<>();
            if(masterMobos != null) {
                for(Motherboard m : masterMobos) {
                    if(m.getSocket().equals(socket)) {
                        filtered.add(m);
                        moboBox.addItem(m.getName());
                    }
                }
            }
            currentMobos = filtered;
            moboBox.setSelectedIndex(-1);
        } finally {
            isFiltering = false;
        }
    }

    private void filterRAM(String type) {
        isFiltering = true;
        try {
            ramBox.removeAllItems();
            ArrayList<RAM> filtered = new ArrayList<>();
            if(masterRAMs != null) {
                for(RAM r : masterRAMs) {
                    if(r.getType().contains(type) || type.contains(r.getType())) {
                        filtered.add(r);
                        ramBox.addItem(r.getName());
                    }
                }
            }
            currentRAMs = filtered;
            ramBox.setSelectedIndex(-1);
        } finally {
            isFiltering = false;
        }
    }

    private void filterCasing(String formFactor) {
        isFiltering = true;
        try {
            caseBox.removeAllItems();
            ArrayList<Casing> filtered = new ArrayList<>();
            if(masterCasings != null) {
                for(Casing c : masterCasings) {
                    if(c.getFormFactor().equals(formFactor) || c.getFormFactor().equals("ATX") || c.getFormFactor().equals("E-ATX")) {
                        filtered.add(c);
                        caseBox.addItem(c.getName());
                    }
                }
            }
            currentCasings = filtered;
            caseBox.setSelectedIndex(-1);
        } finally {
            isFiltering = false;
        }
    }
}