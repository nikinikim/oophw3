package transport;

public abstract class Transport {

    private String brand;
    private String model;
    private final int year;
    private final String country;
    private String color;
    private int maxSpeed;
    private double fuelPercentage;

    public Transport(String brand, String model, int year, String country, String color, int maxSpeed, double fuelPercentage) {
        if (brand == null || brand.isEmpty() || brand.isBlank()){
            this.brand = "default";
        }else {
            this.brand = brand;
        }
        if (model == null || model.isEmpty() || model.isBlank()){
            this.model = "default";
        }else {
            this.model = model;
        }
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        if (country == null || country.isEmpty() || country.isBlank()) {
            this.country = "default";
        }else {
            this.country = country;
        }
        if (color == null) {
            this.color = "белый";
        }else {
            this.color = color;
        }
        if (maxSpeed <= 0) {
            this.maxSpeed = 200;
        }else {
            this.maxSpeed = maxSpeed;
        }
        if (fuelPercentage < 0.00) {
            this.fuelPercentage = 0.00;
        }
        if (fuelPercentage > 100.00){
            this.fuelPercentage = 100.00;
        }else {
            this.fuelPercentage = fuelPercentage;
        }

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null || model.isEmpty() || model.isBlank()){
            this.model = "default";
        }else {
            this.model = model;
        }
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null) {
            this.color = "белый";
        }else {
            this.color = color;
        }
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed <= 0) {
            this.maxSpeed = 200;
        }else {
            this.maxSpeed = maxSpeed;
        }
    }

    public double getFuelPercentage() {
        return fuelPercentage;
    }

    public void setFuelPercentage(double fuelPercentage) {
        if (fuelPercentage < 0) {
            this.fuelPercentage = 0.00;
        }
        if (fuelPercentage > 100){
            this.fuelPercentage = 100.00;
        }else {
            this.fuelPercentage = fuelPercentage;
        }
    }

    public abstract void refill(double fuelPercentage);

}
