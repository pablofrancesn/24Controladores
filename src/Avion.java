public class Avion {
    private String brand;
    private String model;
    private double tankCapacity;
    private int passengers;
    private String license;

    public Avion() {
    }

    public Avion(String brand, String model, double tankCapacity, int passengers, String license) {
        this.brand = brand;
        this.model = model;
        this.tankCapacity = tankCapacity;
        this.passengers = passengers;
        this.license = license;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    @Override
    public String toString() {
        return "Avion {" +
                "Marca: '" + brand + '\'' +
                ", modelo: '" + model + '\'' +
                ", capacidad depósito: " + tankCapacity +
                ", capacidad pasajeros: " + passengers +
                ", licencia: '" + license + '\'' +
                '}';
    }
}
