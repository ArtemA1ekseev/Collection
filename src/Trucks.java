public class Trucks extends Car implements Competing{

    private Weight weight;

    public Trucks(String brand,
                  String model,
                  double engineVolume,
                  Weight weight) {
        super(brand, model, engineVolume);
        this.weight = weight;
    }

    public Weight getWeight() {
        return weight;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
    }

    @Override
    public String starMoving() {
        return "Аккумулятор в общем начинает крутить генератор, который в свою очередь напрямую связан с двигателем и начинает крутить там роторы. Которые в свою очередь начинают раскручивать все системы и начинается подача бензина в двигатель по каплям.";
    }

    @Override
    public String stopMoving() {
        return "Грузовой автомобиль останавливается!";
    }

    @Override
    public String pitStop() {
        return "Количество остановок на ремонт 6.";
    }

    @Override
    public String bestLapTime() {
        return "Лучшее время круга 21.31 мин";
    }

    @Override
    public String MaximumSpeed() {
        return "Максимальное скорость 85 км/ч.";
    }

    @Override
    public void printType() {
        if (weight == null) {
            System.out.println("Данных по авто недостаточно");
        } else {
            String from = weight.getFrom() == null ? "" : "от " + weight.getFrom() + " т. ";
            String to = weight.getTo() == null ? "" : "до " + weight.getTo() + " т.";
            System.out.println("Грузоподъемность авто: " + from + " " + to);
        }
    }

    @Override
    public boolean service() {
        return Math.random() > 0.75;
    }

    @Override
    public void repair() {
        System.out.println("Грузовик " + getBrand() + " " + getModel() + " починен!");
    }
}