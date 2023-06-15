public class Car extends Transport {
    private String VINNumber;
    private String CarNumber;

    public String getVIN() {
        return VINNumber;
    }

    public void setVINNumber(String VINNumber) {
        this.VINNumber = VINNumber;
    }

    public String getCarNumber() {
        return CarNumber;
    }

    public void setCarNumber(String CarNumber) {
        this.CarNumber = CarNumber;
    }

    public void move() {
        System.out.println("Car is moving");
    }
}
