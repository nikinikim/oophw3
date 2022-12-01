package transport;

public class Main {
    public static void main(String[] args) {

        Car lada = new Car("Lada", "Granta", 1.7, "жёлтый", 2015, "Россия", "", "", "у360вн999", 5, null, null, "газ", 15.00);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "чёрный", 2020, "Германия", "", "", "", 4, null, null, "газ", 15.00);
        Car bmw = new Car("BMW", "Z8", 3.0, "чёрный", 0, "Германия", "", "", "x999xк999",4, null, null, "газ", 15.00);
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея", "", "", "у999уу999", 5, null, null, "газ", 15.00);
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея", "", "", "", 5, null, null, null, 15.00);

        lada.setWinterTyres(true);
        audi.setWinterTyres(false);
        bmw.setWinterTyres(false);
        kia.setWinterTyres(true);

        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);
        System.out.println();

        Train lastochka = new Train("Ласточка", "В-901", 2011, "Россия", null, 301, 3500, 2, "Белорусский вокзал", "Минск - Пассажирский", 11,null, 15.00);
        Train leningrad = new Train("Ленинград", "D-125", 2019, "Россия", null, 270, 1700, 2, "Ленинградский вокзал", "Ленинград - Пассажирский", 8,null, 15.00);

        System.out.println(lastochka);
        System.out.println(leningrad);
        System.out.println();

        Bus ikarus = new Bus("Икарус", null, 2020, null, null, 0, "городской", 30, 15,null, 15.00);
        Bus lvov = new Bus("Львов", null, 1980, null, null, 0, "городской", 30, 15,null, 15.00);
        Bus gaz = new Bus("Газ", null, 2010, null, null, 0, "городской", 30, 15,null, 15.00);

        System.out.println(ikarus);
        System.out.println(lvov);
        System.out.println(gaz);
        System.out.println();

        ikarus.refill(25);


    }

}