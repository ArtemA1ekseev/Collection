import jdk.jfr.Category;

import java.util.*;

public class Main {
    public static void main(String[] args) {

//        boolean success = Data.validate("test","test","test");
//        if (success) {
//            System.out.println("Данные валидны!");
//        } else {
//            System.out.println("Данные не валидны!");
        Michanic<Transport> petr = new Michanic<Transport>("Петр", "Петров", "Perilli");
        Sponsor lukoil = new Sponsor("OAO Лукоил компани", 100000);
        Sponsor michelin = new Sponsor("Michelin", 300000);

        Car ladaGranta = new Car("Lada", "Granta", 1.7, "желтый", 2015, "России", TypeOfBody.COUPE);
        ladaGranta.setGears("автомат");
        ladaGranta.addDriver(new DriverB("А.В.В", 4, ladaGranta));
        ladaGranta.addMichanic(petr);
        ladaGranta.addSponsor(lukoil, michelin);

        Car audiA8 = new Car("Audi", "A8 50 L TDI quattro", 0, "черный", 2020, "Германии", TypeOfBody.COUPE);
        audiA8.setSummerTyres(true);

        Car bmwZ8 = new Car("BMW", "Z8", 3.0, null, 2021, "Германии", TypeOfBody.COUPE);
        bmwZ8.setRegNumber("x412zc413");

        Car kiaSportage = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 0, null, TypeOfBody.COUPE);
        kiaSportage.setColor("титановый");

        Car hyundaiAvante = new Car(null, "Avante", 1.6, "оранжевый", 2016, "Южной Корее", TypeOfBody.COUPE);
        hyundaiAvante.setEngineVolume(3.1);

        printInfoCar(ladaGranta);
        printInfoCar(audiA8);
        printInfoCar(bmwZ8);
        printInfoCar(kiaSportage);
        printInfoCar(hyundaiAvante);
        System.out.println();
        Train lastochka = new Train("Ласточка", "B-901", 2011, "России", 301, 3500, "Белорусского вокзала", "Минск-Пассажирский", 11);
        Train leningrad = new Train("Ленинград", "D-125", 2019, "России", 270, 1700, "Ленинградского вокзала", "Ленинград-Пассажирский", 8);
        printInfoTrain(lastochka);
        printInfoTrain(leningrad);
        System.out.println();
        Bus tourismo = new Bus("MERCEDES", "Tourismo", 2013, "Германии", "красного", 150);
        Bus granbird = new Bus("KIA", "Granbird", 2005, "Южной Кореи", "белого", 110);
        Bus bj = new Bus("Foton", "BJ 6126", 2003, "Китае", "белого", 140);
        printInfoBus(tourismo);
        printInfoBus(granbird);
        printInfoBus(bj);

        PassengerCars ladaGranta1 = new PassengerCars("Lada", "Granta", 1.7);
        PassengerCars audiA81 = new PassengerCars("Audi", "A8 50 L TDI quattro", 1.3);
        PassengerCars bmwZ81 = new PassengerCars("BMW", "Z8", 3.0);
        PassengerCars kiaSportage1 = new PassengerCars("Kia", "Sportage", 2.4);
        printInfoPassengerCars(ladaGranta1);
        printInfoPassengerCars(audiA81);
        printInfoPassengerCars(bmwZ81);
        printInfoPassengerCars(kiaSportage1);
        System.out.println();
        Autobus tourismo1 = new Autobus("MERCEDES", "Tourismo", 3.2, Capacity.MEDIUM);
        tourismo1.addMichanic(petr);
        tourismo1.addSponsor(lukoil, michelin);
        Autobus granbird1 = new Autobus("KIA", "Granbird", 3.4, Capacity.LARGE);
        Autobus bj1 = new Autobus("Foton", "BJ 6126", 3.1, Capacity.EXTRA_LARGE);
        Autobus bj2 = new Autobus("Fotonius", "BJ 12", 3.3, Capacity.EXTRA_SMALL);
        printInfoAutobus(tourismo1);
        printInfoAutobus(granbird1);
        printInfoAutobus(bj1);
        printInfoAutobus(bj2);
        System.out.println();
        Trucks ural = new Trucks("УРАЛ", "21-31", 1.2, Weight.N1);
        ural.addMichanic(petr);
        ural.addSponsor(michelin);
        Trucks daf = new Trucks("Daf", "3", 1.3, Weight.N1);
        Trucks scania = new Trucks("Scania", "13-m", 2.2, Weight.N1);
        Trucks iveco = new Trucks("Iveco", "31-fa", 3.1, Weight.N1);
        printInfoTrucks(ural);
        printInfoTrucks(daf);
        printInfoTrucks(scania);
        printInfoTrucks(iveco);
        System.out.println();



        //Car car = new Car("Kia", "Rio", 1.4);
        //DriverB driverB = new DriverB("А.В.В", 4, car);
        //System.out.println(driverB);
        //System.out.println();


        List<Transport> transports = List.of(
                ladaGranta,
                ural,
                tourismo1
        );

        ServiceStation serviceStation = new ServiceStation();
        serviceStation.addCar(ladaGranta);
        serviceStation.addTrucks(ural);
        serviceStation.service();
        serviceStation.service();

        for (Transport transport: transports) {
            printInfo(transport);
        }

        System.out.println();

        Queue<String> queue1 = new ArrayDeque<>();
        Queue<String> queue2 = new ArrayDeque<>();
        randomFilling(queue1);
        randomFilling(queue2);
        System.out.println("Первая очередь: " + queue1);
        System.out.println("Вторая очередь: " + queue2);

        add("Владимир Петров", queue1, queue2);
        System.out.println();

        System.out.println("Первая очередь: " + queue1);
        System.out.println("Вторая очередь: " + queue2);
        System.out.println();

        example();
    }

    private static void example() {
        List<List<String>> biDemArrList = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            biDemArrList.add(i, new ArrayList<>());
            for (int j = 0; j < 8; j++) {
                biDemArrList.get(i).add(j, ((i+j)%2==1?"●":"◯"));
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(biDemArrList.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    private static void add (String name, Queue<String> queue1, Queue<String> queue2) {
        if (queue1.size() == MAX_SIZE && queue2.size() == MAX_SIZE) {
            System.out.println("ГАЛЯ, я вызываю тебя!");
            return;
        }

        if (queue1.size() < queue2.size()) {
            queue1.offer(name);
        } else {
            queue2.offer(name);
        }
    }

    private static void remove (Queue<String> queue1, Queue<String> queue2) {
        if (RANDOM.nextBoolean()) {
            queue1.poll();
        } else {
            queue2.poll();
        }
    }

    private static void randomFilling(Queue<String> queue) {
        int size = RANDOM.nextInt(MAX_SIZE + 1);
        for (int i = 0; i < size; i++) {
            queue.offer(NAMES.get(RANDOM.nextInt(NAMES.size())));
        }
    }

    private static final List<String> NAMES = List.of(
            "Иваныч",
            "Петрович",
            "Саныч",
            "Кая",
            "Парадеевич"
    );

    private static final Random RANDOM = new Random();
    private static final int MAX_SIZE = 5;

    private static void printInfo(Transport transport) {
        System.out.println("Информация по автомобилю " + transport.getBrand() + " " + transport.getModel());
        System.out.println("Водители:");
        for (Driver<?> driver : transport.getDrivers()) {
            System.out.println(driver.getFullName());
        }
        System.out.println("Спонсоры:");
        for (Sponsor sponsor : transport.getSponsors()) {
            System.out.println(transport.getSponsors());
        }
        System.out.println("Механики:");
        for (Michanic<?> michanic : transport.getMechanics()) {
            System.out.println(transport.getMechanics());
        }
    }

    private static void printInfoCar(Car car) {
        System.out.println("Бренд автомобиля — " + car.getBrand()
                + ", модель — " + car.getModel() + ", сборка в "
                + car.getProductionCountry() + ", цвет кузова — " + car.getColor()
                + ", объем двигателя — " + car.getEngineVolume() + " л, год выпуска — "
                + car.getProductionYear() +
                ", коробка передач: " + car.getGears() +
                ", тип кузова: " + car.getTypeOfBody() +
                ", рег. номер: " + car.getRegNumber() +
                ", кол-во мест: " + car.getCountSeats() +
                ", " + (car.isSummerTyres() ? "летняя" : "зимняя") + " резина" +
                ", " + (car.getKey().isWithoutKeyAccess() ? "без ключевой доступ" : "ключевой доступ") +
                ", " + (car.getKey().isRemoteRunEngine() ? "удаленный запуск" : "обычный запуск") +
                ", номер страховки: " + car.getInsuranse().getNumber() +
                ", стоимость страховки: " + car.getInsuranse().getCost() +
                ", срок действия страховки: " + car.getInsuranse().getExpireDate() + car.refill()
        );
        car.printType();
    }

    private static void printInfoTrain(Train train) {
        System.out.println("Поезд " + train.getBrand()
                + ", модель " + train.getModel() + ", "
                + train.getProductionYear() + " год выпуска в " + train.getProductionCountry()
                + ", скорость передвижения – " + train.getMaxSpeed() + " км/ч, отходит от "
                + train.getStationNameDepartures() + " и следует до станции " + train.getFinalStop() +
                ". Цена поездки – " + train.getPriceTrips() +
                " рублей, в поезде " + train.getQuantityWagons() +
                " вагонов." + train.refill()
        );
    }


    private static void printInfoBus(Bus bus) {
        System.out.println("Автобус " + bus.getBrand()
                + ", модель " + bus.getModel() + ", "
                + bus.getProductionYear() + " год выпуска в " + bus.getProductionCountry()
                + ", скорость передвижения – " + bus.getMaxSpeed() + " км/ч, "
                + bus.getColor() + " цвета." + bus.refill()
        );
    }

    private static void printInfoPassengerCars(PassengerCars passengerCars) {
        System.out.println(new StringBuilder().append("Легковой автомобиль - ").append(passengerCars.getBrand()).append(", модель - ").append(passengerCars.getModel()).append(", объём двигателя - ").append(passengerCars.getEngineVolume()).append(" ").append(passengerCars.starMoving()).append(" ").append(passengerCars.stopMoving()).append(" ").append(passengerCars.pitStop()).append(" ").append(passengerCars.bestLapTime()).append(" ").append(passengerCars.MaximumSpeed()).toString());
    }

    private static void printInfoAutobus(Autobus autobus) {
        System.out.println("Автобус - " + autobus.getBrand()
                + ", модель - " + autobus.getModel() + ", объём двигателя - "
                + autobus.getEngineVolume() + " " + autobus.starMoving() + " " + autobus.stopMoving() + " " + autobus.pitStop() + " " + autobus.bestLapTime() + " " + autobus.MaximumSpeed());
        autobus.printType();
    }

    private static void printInfoTrucks(Trucks trucks) {
        System.out.println("Грузовой автомобиль - " + trucks.getBrand()
                + ", модель - " + trucks.getModel() + ", объём двигателя - "
                + trucks.getEngineVolume() + " " + trucks.starMoving() + " " + trucks.stopMoving() + " " + trucks.pitStop() + " " + trucks.bestLapTime() + " " + trucks.MaximumSpeed());
        trucks.printType();
    }

    private static void service(Transport... transports) {
        for (Transport transport : transports) {
            serviceTransport(transport);
        }
    }

    private static void serviceTransport(Transport transport) {
        try {
            if (!transport.service()) {
                throw new RuntimeException("Автомобиль " + transport.getBrand() + " " + transport.getModel() + " не прошел диагностику!");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

}
