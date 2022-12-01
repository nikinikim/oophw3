package transport;

public class Train extends Transport {
    private double costOfTrip;
    private int timeOfTrip;
    private String nameOfStation;
    private String finalStation;
    private int quantityOfWagons;
    private String typeOfFuel;

    public Train(String brand, String model, int year, String country, String color, int maxSpeed, double costOfTrip, int timeOfTrip, String nameOfStation, String finalStation, int quantityOfWagons, String typeOfFuel, double fuelPercentage) {
        super(brand, model, year, country, color, maxSpeed, fuelPercentage);
        if (costOfTrip <= 0){
            this.costOfTrip = 200;
        }else {
            this.costOfTrip = costOfTrip;
        }
        if (timeOfTrip <=0) {
            this.timeOfTrip = 60;
        }else {
            this.timeOfTrip = timeOfTrip;
        }
        if (nameOfStation == null || nameOfStation.isEmpty() || nameOfStation.isBlank()){
            this.nameOfStation = "Станция без имени";
        }else {
            this.nameOfStation = nameOfStation;
        }
        if (finalStation == null || finalStation.isEmpty() || finalStation.isBlank()) {
            this.finalStation = "Станция без имени";
        }else {
            this.finalStation = finalStation;
        }
        if (quantityOfWagons <= 0) {
            this.quantityOfWagons = 10;
        }else {
            this.quantityOfWagons = quantityOfWagons;
        }
        if (typeOfFuel == null) {
            this.typeOfFuel = "уголь";
        }else {
            this.typeOfFuel = typeOfFuel;
        }
    }

    public double getCostOfTrip() {
        return costOfTrip;
    }

    public void setCostOfTrip(double costOfTrip) {
        if (costOfTrip <= 0){
            this.costOfTrip = 200;
        }else {
            this.costOfTrip = costOfTrip;
        }
    }

    public int getTimeOfTrip() {
        return timeOfTrip;
    }

    public void setTimeOfTrip(int timeOfTrip) {
        if (timeOfTrip <=0) {
            this.timeOfTrip = 60;
        }else {
            this.timeOfTrip = timeOfTrip;
        }
    }

    public String getNameOfStation() {
        return nameOfStation;
    }

    public void setNameOfStation(String nameOfStation) {
        if (nameOfStation == null || nameOfStation.isEmpty() || nameOfStation.isBlank()){
            this.nameOfStation = "Станция без имени";
        }else {
            this.nameOfStation = nameOfStation;
        }
    }

    public String getFinalStation() {
        return finalStation;
    }

    public void setFinalStation(String finalStation) {
        if (finalStation == null || finalStation.isEmpty() || finalStation.isBlank()) {
            this.finalStation = "Станция без имени";
        }else {
            this.finalStation = finalStation;
        }
    }

    public int getQuantityOfWagons() {
        return quantityOfWagons;
    }

    public void setQuantityOfWagons(int quantityOfWagons) {
        if (quantityOfWagons <= 0) {
            this.quantityOfWagons = 10;
        }else {
            this.quantityOfWagons = quantityOfWagons;
        }
    }

    public String getTypeOfFuel() {
        return typeOfFuel;
    }

    public void setTypeOfFuel(String typeOfFuel) {
        if (typeOfFuel == null) {
            this.typeOfFuel = "уголь";
        }else {
            this.typeOfFuel = typeOfFuel;
        }
    }

    @Override
    public void refill(double fuelPercentage) {
        setFuelPercentage(100.00);
        System.out.println(typeOfFuel + getFuelPercentage());
    }

    @Override
    public String toString() {
        return String.format("Поезд %s, модель %s, %d год выпуска, страна - %s, скорость передвижения - %d км/ч," +
                " отходит от %s и следует до %s. Цена поездки - %.2f рублей, в поезде %d вагонов.", getBrand(), getModel(),
                getYear(), getCountry(), getMaxSpeed(), nameOfStation, finalStation, costOfTrip, quantityOfWagons);
    }
}
