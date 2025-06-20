package BuilderPatternExample;

public class Computer {
    private String CPU;
    private String RAM;

    private String storage;
    private String graphicsCard;
    private boolean isWiFiEnabled;

    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
        this.isWiFiEnabled = builder.isWiFiEnabled;
    }

    public static class Builder {
        private String CPU;
        private String RAM;
        private String storage;
        private String graphicsCard;
        private boolean isWiFiEnabled;

        public Builder(String CPU, String RAM) {
            this.CPU = CPU;
            this.RAM = RAM;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public Builder setWiFiEnabled(boolean isWiFiEnabled) {
            this.isWiFiEnabled = isWiFiEnabled;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    // Display configuration (for test)
    public void showSpecs() {
        System.out.println("CPU: " + CPU);
        System.out.println("RAM: " + RAM);
        System.out.println("Storage: " + (storage != null ? storage : "Not set"));
        System.out.println("Graphics Card: " + (graphicsCard != null ? graphicsCard : "Not set"));
        System.out.println("WiFi Enabled: " + isWiFiEnabled);
    }
}

