public class Main {
    public static void main(String[] args) {
        Figure figure = new Figure(7.0, 4.0, 3.0);

        double volume = figure.calculateVolume();
        System.out.println("Volume of the figure: " + volume);
        figure.calculateSurfaceArea();

        Transport transport = new Transport();
        transport.setName("Car");
        transport.setSeatCount(5);

        System.out.println("Name: " + transport.getName());
        System.out.println("Seat count: " + transport.getSeatCount());

        Car car = new Car();
        car.setVINNumber("Y6D11020650409208");
        car.setCarNumber("BE9368CE");

        car.move(); // Output: Car is moving
        car.options(); // Output: I can move back and forward
    }
}
