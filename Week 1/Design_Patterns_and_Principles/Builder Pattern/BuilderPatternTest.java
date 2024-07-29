public class BuilderPatternTest {
    public static void main(String[] args) {
        // Create a basic Computer
        Computer basicComputer = new Computer.Builder("Intel i5", "8GB", "256GB SSD")
                .build();

        System.out.println(basicComputer);

        // Create a high-end Gaming Computer
        Computer gamingComputer = new Computer.Builder("Intel i9", "32GB", "1TB SSD")
                .build();

        System.out.println(gamingComputer);

        // Create a Workstation Computer
        Computer workstationComputer = new Computer.Builder("AMD Ryzen 9", "64GB", "2TB SSD")
                .build();

        System.out.println(workstationComputer);
    }
}
