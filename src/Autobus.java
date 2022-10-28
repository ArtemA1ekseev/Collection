public class Autobus extends Car implements Competing{

    public Capacity capacity;

    public Autobus(String brand,
                   String model,
                   double engineVolume,
                   Capacity capacity) {
        super(brand, model, engineVolume);
        this.capacity = capacity;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    @Override
    public String starMoving() {
        return "Аккумулятор в общем начинает крутить генератор, который в свою очередь напрямую связан с двигателем и начинает крутить там роторы. Которые в свою очередь начинают раскручивать все системы и начинается подача бензина в двигатель по каплям.";
    }

    @Override
    public String pitStop() {
        return "Количество остановок на ремонт 4.";
    }

    @Override
    public String bestLapTime() {
        return "Лучшее время круга 19.31 мин";
    }

    @Override
    public String MaximumSpeed() {
        return "Максимальное скорость 94 км/ч.";
    }

    @Override
    public void printType() {
        if (capacity == null) {
            System.out.println("Данных по авто недостаточно");
        } else {
            System.out.println("Вместимость автобуса: от " + capacity.getFrom() + " человек до  " + capacity.getTo() + " человек.");
        }
    }

    @Override
    public boolean service() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " в диагностике не требуется.");
        return true;
    }

    @Override
    public void repair() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " починен!");
    }
}