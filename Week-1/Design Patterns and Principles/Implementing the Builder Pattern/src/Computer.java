public class Computer {
    // Required components
    private String CPU;
    private String RAM;

    // Optional components
    private String storage;
    private String graphicsCard;
    private String operatingSystem;

    // ✅ Private constructor (only Builder can call this)
    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
        this.operatingSystem = builder.operatingSystem;
    }

    // ✅ Static nested Builder class
    public static class Builder {
        // Required parameters
        private String CPU;
        private String RAM;

        // Optional parameters
        private String storage;
        private String graphicsCard;
        private String operatingSystem;

        // Builder constructor with required fields
        public Builder(String CPU, String RAM) {
            this.CPU = CPU;
            this.RAM = RAM;
        }

        // Builder methods for optional fields
        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public Builder setOperatingSystem(String operatingSystem) {
            this.operatingSystem = operatingSystem;
            return this;
        }

        // Build method to return final Computer object
        public Computer build() {
            return new Computer(this);
        }
    }

    // Display method
    public void displayConfiguration() {
        System.out.println("Computer Configuration:");
        System.out.println("CPU: " + CPU);
        System.out.println("RAM: " + RAM);
        System.out.println("Storage: " + (storage != null ? storage : "Not included"));
        System.out.println("Graphics Card: " + (graphicsCard != null ? graphicsCard : "Not included"));
        System.out.println("OS: " + (operatingSystem != null ? operatingSystem : "Not included"));
        System.out.println("------------------------------");
    }
}

