public class Bus extends Transport{

    public Bus(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
    }

    public Bus(String brand, String model, int productionYear, String productionCountry, int maxSpeed) {
        super(brand, model, productionYear, productionCountry, maxSpeed);
    }

    public Bus(String brand, String model, int productionYear, String productionCountry, String color) {
        super(brand, model, productionYear, productionCountry, color);
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
    public void printType() { }

    @Override
    public boolean service() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " в диагностике не требуется.");
        return true;
    }

    @Override
    public String refill() {
        return "Можно заправлять бензином, дизелем на заправке или заряжать на специальных электроду-парковках, если это электрокар";
    }

    @Override
    public void repair() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " починен!");
    }
}
