
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class MainProgram {
    public static void main(String[] args) {
        // Set a clean system look and feel
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ignored) {}

        SwingUtilities.invokeLater(() -> {
            // Initialize Data
            SmartPCTest.stockItems();

            // Launch GUI
            new MainGUI().setVisible(true);
        });
    }
}

// © 2025 Raheel Arshad & Hasham Hassan. Smart PC Configurator. All rights reserved.
