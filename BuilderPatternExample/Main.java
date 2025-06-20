package BuilderPatternExample;
public class Main {
    public static void main(String[] args) {
        Computer basicPC = new Computer.Builder("Intel i5", "8GB").build();

        Computer gamingPC = new Computer.Builder("Intel i9", "32GB")
            .setStorage("1TB SSD")
            .setGraphicsCard("NVIDIA RTX 4080")
            .setWiFiEnabled(true)
            .build();

        System.out.println("=== Basic PC Configuration ===");
        basicPC.showSpecs();

        System.out.println("\n=== Gaming PC Configuration ===");
        gamingPC.showSpecs();
    }
}
