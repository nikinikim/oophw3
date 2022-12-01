package transport;

public class Bus extends Transport {
    private String purpose;
    private double costOfTrip;
    private int timeOfTrip;
    private String typeOfFuel;

    public Bus(String brand, String model, int year, String country, String color, int maxSpeed, String purpose, double costOfTrip, int timeOfTrip, String typeOfFuel, double fuelPercentage) {
        super(brand, model, year, country, color, maxSpeed, fuelPercentage);
        if (purpose == null) {
            this.purpose = "городской";
        }else {
            this.purpose = purpose;
        }
        if (costOfTrip <= 0) {
            this.costOfTrip = 30;
        } else {
            this.costOfTrip = costOfTrip;
        }
        if (timeOfTrip <= 0) {
            this.timeOfTrip = 15;
        }else {
            this.timeOfTrip = timeOfTrip;
        }
        if (typeOfFuel == null) {
            this.typeOfFuel = "бензин";
        }else {
            this.typeOfFuel = typeOfFuel;
        }
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        if (purpose == null) {
            this.purpose = "городской";
        }else {
            this.purpose = purpose;
        }
    }

    public double getCostOfTrip() {
        return costOfTrip;
    }

    public void setCostOfTrip(double costOfTrip) {
        if (costOfTrip <= 0) {
            this.costOfTrip = 30;
        } else {
            this.costOfTrip = costOfTrip;
        }
    }

    public int getTimeOfTrip() {
        return timeOfTrip;
    }

    public void setTimeOfTrip(int timeOfTrip) {
        if (timeOfTrip <= 0) {
            this.timeOfTrip = 15;
        }else {
            this.timeOfTrip = timeOfTrip;
        }
    }

    public String getTypeOfFuel() {
        return typeOfFuel;
    }

    public void setTypeOfFuel(String typeOfFuel) {
        if (typeOfFuel == null) {
            this.typeOfFuel = "бензин";
        }else {
            this.typeOfFuel = typeOfFuel;
        }
    }

    @Override
    public String toString() {
        return String.format("Автобус %s, назначение %s. Цена поездки - %.2f рублей, время в пути %d минут.", getBrand(), purpose, costOfTrip, timeOfTrip);
    }

    @Override
    public void refill(double fuelPercentage) {
        setFuelPercentage(getFuelPercentage() + fuelPercentage);
        System.out.println(typeOfFuel + " заправлен на " + getFuelPercentage() + "%");
    }
}

