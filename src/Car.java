import java.time.LocalDate;

public class Car extends Transport{

    private double engineVolume;
    private String gears;
    private String regNumber;
    private  int countSeats;
    private boolean summerTyres;
    private Key key;
    private Insuranse insuranse;
    private TypeOfBody typeOfBody;

    public Car(String brand, String model, double engineVolume) {
        super(brand, model);
        this.engineVolume = engineVolume;
    }

    public Car(String brand, String model, int productionYear, String productionCountry, int maxSpeed, TypeOfBody typeOfBody, int countSeats) {
        super(brand, model, productionYear, productionCountry, maxSpeed);
        this.typeOfBody = typeOfBody;
        this.countSeats = countSeats;
    }

    public Car(String brand, String model, int productionYear, String productionCountry, String color, TypeOfBody typeOfBody, int countSeats) {
        super(brand, model, productionYear, productionCountry, color);
        this.typeOfBody = typeOfBody;
        this.countSeats = countSeats;
    }

    public Car(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed, TypeOfBody typeOfBody, int countSeats) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
        this.typeOfBody = typeOfBody;
        this.countSeats = countSeats;
    }

    public Car(String brand,
               String model,
               double engineVolume,
               String color,
               int productionYear,
               String productionCountry,
               String gears,
               TypeOfBody typeOfBody,
               String regNumber,
               int countSeats,
               boolean summerTyres,
               Key key,
               Insuranse insuranse) {
        super(brand, model, productionYear, productionCountry, color);
        this.engineVolume = engineVolume;
        if (gears == null) {
            this.gears = "механика";
        } else {
            this.gears = gears;
        }
        this.typeOfBody = typeOfBody;
        if (regNumber == null) {
            this.regNumber = "х000хх000";
        } else {
            this.regNumber = regNumber;
        }
        if (key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }
        if (insuranse == null) {
            this.insuranse = new Insuranse();
        } else {
            this.insuranse = insuranse;
        }
        this.countSeats = countSeats;
        this.summerTyres = summerTyres;
    }

    public Car(String brand,
               String model,
               double engineVolume,
               String color,
               int productionYear,
               String productionCountry,
               TypeOfBody typeOfBody) {

        this(brand,
                model,
                engineVolume,
                color,
                productionYear,
                productionCountry,
                "механика",
                TypeOfBody.SEDAN,
                "х000хх000",
                4,
                true,
                new Key(),
                new Insuranse()
        );
    }

    @Override
    public String starMoving() {
        return "Аккумулятор в общем начинает крутить генератор, который в свою очередь напрямую связан с двигателем и начинает крутить там роторы. Которые в свою очередь начинают раскручивать все системы и начинается подача бензина в двигатель по каплям.";

    }

    @Override
    public String stopMoving() {
        return "Автомобиль останавливается!";
    }

    @Override
    public void printType() {
        if (typeOfBody == null) {
            System.out.println("Данных по авто недостаточно");
        } else {
            System.out.println("Тип авто: " + typeOfBody);
        }
    }

    @Override
    public boolean service() {
        return Math.random() > 0.5;
    }

    @Override
    public void repair() {
        System.out.println("Машина " + getBrand() + " " + getModel() + " починена!");
    }

    @Override
    public String refill() {
        return "Можно заправлять бензином, дизелем на заправке или заряжать на специальных электроду-парковках, если это электрокар";
    }

    public static class Key {

        private final boolean remoteRunEngine;
        private final boolean withoutKeyAccess;

        public Key(boolean remoteRunEngine, boolean withoutKeyAccess) {
            this.remoteRunEngine = remoteRunEngine;
            this.withoutKeyAccess = withoutKeyAccess;
        }

        public Key() {
            this (false, false);
        }

        public boolean isRemoteRunEngine() {
            return remoteRunEngine;
        }

        public boolean isWithoutKeyAccess() {
            return withoutKeyAccess;
        }
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getGears() {
        return gears;
    }

    public TypeOfBody getTypeOfBody() {
        return typeOfBody;
    }

    public void setTypeOfBody(TypeOfBody typeOfBody) {
        this.typeOfBody = typeOfBody;
    }

    public void setGears(String gears) {
        if (gears == null) {
            this.gears = "механика";
        } else {
            this.gears = gears;
        }
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        if (regNumber == null) {
            this.regNumber = "х000хх000";
        } else {
            this.regNumber = regNumber;
        }
    }

    public boolean isSummerTyres() {
        return summerTyres;
    }

    public void setSummerTyres(boolean summerTyres) {
        this.summerTyres = summerTyres;
    }


    public int getCountSeats() {
        return countSeats;
    }

    public void changeTyres(){
        summerTyres = !summerTyres;
    }

    public Insuranse getInsuranse() {
        return insuranse;
    }

    public void setInsuranse(Insuranse insuranse) {
        this.insuranse = insuranse;
    }

    public boolean isCorrectRegNum() {
        if (regNumber.length() != 9) {
            return false;
        }
        char chars[] = regNumber.toCharArray();
        if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])) {
            return false;
        }
        if (!Character.isDigit(chars[1]) || !Character.isDigit(chars[2]) || !Character.isDigit(chars[3]) || !Character.isDigit(chars[6]) || !Character.isDigit(chars[7]) || !Character.isDigit(chars[8])) {
            return false;
        }
        if (!regNumber.isEmpty() && !regNumber.isBlank()) {
            return false;
        }
        return true;
    }
    public static class Insuranse {

        private final LocalDate expireDate;
        private final double cost;
        private final String number;

        public Insuranse(LocalDate expireDate, double cost, String number) {
            if (expireDate == null) {
                this.expireDate = LocalDate.now().plusDays(365);
            } else {
                this.expireDate = expireDate;
            }
            this.cost = cost;
            if (number == null) {
                this.number = "123456789";
            } else {
                this.number = number;
            }
        }

        public Insuranse() {
            this (null, 10000, null);
        }

        public LocalDate getExpireDate() {
            return expireDate;
        }

        public double getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }

        public void checkExpireDate() {
            if (expireDate.isBefore(LocalDate.now()) || expireDate.isEqual(LocalDate.now())) {
                System.out.println("Нужно срочно ехать оформлять новую страховку!");
            }
        }
        public void checkNumber() {
            if (number.length() != 9) {
                System.out.println("Номер страховки некорректный!");
            }
        }
    }
}