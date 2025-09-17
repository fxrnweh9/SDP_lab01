public class Main {
    public static void main(String[] args) {
        Car sportsCar = new Car.Builder()
                .setSeats(2)
                .setEngine("4x4")
                .setGPS(true)
                .setTripComputer(true)
                .build();
        System.out.println("Car built successfully!");
    }
}
