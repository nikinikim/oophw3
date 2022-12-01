package transport;

import java.time.LocalDate;

public class Car extends Transport {
    private final double engineVolume;
    private String transmission;
    private final String typeOfBody;
    private String regNumber;
    private final int numberOfPlace;
    private boolean winterTyres;
    private Key key;
    private Insurance insurance;
    private String typeOfFuel;


    public static class Key {
        private String remoteEngineStart;

        private String keylessAccess;

        public Key(String remoteEngineStart, String keylessAccess) {
            if (remoteEngineStart == null || remoteEngineStart.isEmpty() || remoteEngineStart.isBlank()){
                this.remoteEngineStart = "Удаленный запуск отсутствует";
            }else {
                this.remoteEngineStart = remoteEngineStart;
            }
            if (keylessAccess == null || keylessAccess.isEmpty() || keylessAccess.isBlank()) {
                this.keylessAccess = "Бесключевой доступ отсутствует";
            }else{
                this.keylessAccess = keylessAccess;
            }
        }
        public Key(){
            this(null, null);
        }

        public String getRemoteEngineStart() {
            return remoteEngineStart;
        }

        public void setRemoteEngineStart(String remoteEngineStart) {
            if (remoteEngineStart == null || remoteEngineStart.isEmpty() || remoteEngineStart.isBlank()){
                this.remoteEngineStart = "Отсутствует";
            }else {
                this.remoteEngineStart = remoteEngineStart;
            }
        }

        public String getKeylessAccess() {
            return keylessAccess;
        }

        public void setKeylessAccess(String keylessAccess) {
            if (keylessAccess == null || keylessAccess.isEmpty() || keylessAccess.isBlank()) {
                this.keylessAccess = "Отсутствует";
            }else{
                this.keylessAccess = keylessAccess;
            }
        }
    }
    public static class Insurance {
        private final LocalDate validity;
        private final double cost;
        private final String number;

        public Insurance(LocalDate validity, double cost, String number) {
            if (validity == null) {
                this.validity = LocalDate.now().plusYears(1);
            }else {
                this.validity = validity;
            }
            this.cost = cost;
            if (number == null) {
                this.number = "123456789";
            }else {
                this.number = number;
            }
        }

        public Insurance() {
            this(null, 3500.00, null);
        }

        public LocalDate getValidity() {
            return validity;
        }

        public double getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }

        public void checkValidity(){
            if (validity.isEqual(LocalDate.now()) || validity.isBefore(LocalDate.now())) {
                System.out.println("Нужно срочно обновлять страховку!");
            }
        }

        public void checkNumber() {
            if (number.length() != 9) {
                System.out.println("Номер страховки некорректный");
            }
        }
    }

    public Car(String brand, String model, double engineVolume, String color, int year, String country,
               String transmission, String typeOfBody, String regNumber, int numberOfPlace, Key key, Insurance insurance, String typeOfFuel, double fuelPercentage) {
        super(brand, model, year, country, color, 0, fuelPercentage);
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        }else {
            this.engineVolume = engineVolume;
        }
        if (typeOfBody == null || typeOfBody.isEmpty() || typeOfBody.isBlank()) {
            this.typeOfBody = "легковой";
        }else{
            this.typeOfBody = typeOfBody;
        } if (numberOfPlace <= 0) {
            this.numberOfPlace = 5;
        }else{
            this.numberOfPlace = numberOfPlace;
        }
        if (transmission == null || transmission.isEmpty() || transmission.isBlank()) {
            this.transmission = "автомат";
        }else {
            this.transmission = transmission;
        }
        if (regNumber == null || regNumber.isEmpty() || regNumber.isBlank()) {
            this.regNumber = "x000xx000";
        }else{
            this.regNumber = regNumber;
        }
        this.winterTyres = true;
        if (key == null){
            this.key = new Key ();
        }else {
            this.key = key;
        }
        if (insurance == null){
            this.insurance = new Insurance ();
        }else {
            this.insurance = insurance;
        }
        if (typeOfFuel == null) {
            this.typeOfFuel = "бензин";
        }else {
            this.typeOfFuel = typeOfFuel;
        }
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission() {
        if (transmission == null || transmission.isEmpty() || transmission.isBlank()) {
            this.transmission = "автомат";
        }else {
            this.transmission = transmission;
        }
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        if (regNumber == null || regNumber.isEmpty() || regNumber.isBlank()) {
            this.regNumber = "x000xx000";
        } else {
            this.regNumber = regNumber;
        }
    }

    public boolean isWinterTyres() {
        return winterTyres;
    }

    public void setWinterTyres(boolean winterTyres) {
        this.winterTyres = winterTyres;
    }

    public String getTypeOfBody() {
        return typeOfBody;
    }

    public int getNumberOfPlace() {
        return numberOfPlace;
    }

    public void changeTyres(){
        winterTyres = !winterTyres;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
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

    public boolean isCorrectRegNumber(){
        if (regNumber.length() != 9) {
            return false;
        } else {
            char[] chars = regNumber.toCharArray();
            if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])){
                return false;
            }
            if (!Character.isDigit(chars[1]) || !Character.isDigit(chars[2]) || !Character.isDigit(chars[3]) ||
                    !Character.isDigit(chars[6]) || !Character.isDigit(chars[7]) || !Character.isDigit(chars[8])) {
                return false;
            }
            return true;
        }
    }

    @Override
    public void refill(double fuelPercentage) {
        setFuelPercentage(100.00);
        System.out.println(typeOfFuel + getFuelPercentage());
    }

    @Override
    public String toString() {
        return String.format("%s %s, %d год выпуска, сборка - %s, %s цвет кузова, объём двигателя - %.1f л," +
                        " коробка передач - %s, тип кузова - %s, госномер - %s, количество мест %d, резина - %s, ключ - %s, %s, страховка - %s, %s, %s",
                getBrand(), getModel(), getYear(), getCountry(), getColor(), engineVolume, transmission, typeOfBody, regNumber, numberOfPlace, (winterTyres ? "зимняя" : "летняя"),
                getKey().getKeylessAccess(), getKey().getRemoteEngineStart(), getInsurance().getValidity(), getInsurance().getCost(), getInsurance().getNumber());
    }

}
