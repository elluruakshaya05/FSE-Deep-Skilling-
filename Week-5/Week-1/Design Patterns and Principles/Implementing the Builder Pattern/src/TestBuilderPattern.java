public class TestBuilderPattern {
    public static void main(String[] args) {
        // ✅ Basic computer with only CPU and RAM
        Computer basicComputer = new Computer.Builder("Intel i5", "8GB")
                .build();

        // ✅ Gaming computer with all parts
        Computer gamingComputer = new Computer.Builder("AMD Ryzen 9", "32GB")
                .setStorage("1TB SSD")
                .setGraphicsCard("NVIDIA RTX 4080")
                .setOperatingSystem("Windows 11 Pro")
                .build();

        // ✅ Workstation computer
        Computer workstation = new Computer.Builder("Intel Xeon", "64GB")
                .setStorage("2TB SSD + 2TB HDD")
                .setOperatingSystem("Linux Ubuntu")
                .build();

        // Display configurations
        basicComputer.displayConfiguration();
        gamingComputer.displayConfiguration();
        workstation.displayConfiguration();
    }
}
