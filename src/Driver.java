public abstract class Driver <T extends Transport>{

    private final String fullName;
    private String category;

    private final int drivingExperience;

    private final T car;

    protected Driver(String fullName,
                     String category,
                     int drivingExperience,
                     T car) {
        this.fullName = fullName;
        setCategory(category);
        this.drivingExperience = drivingExperience;
        this.car = car;
    }


    public void starMoving() {
        System.out.println("Driver" + this.fullName + " started moving");
        this.car.starMoving();
    }


    public void stopMoving() {
        System.out.println("Driver" + this.fullName + " stopped moving");
        this.car.stopMoving();
    }


    public void refill() {
        System.out.println("Driver" + this.fullName + " refilling the " + this.car.getBrand() + " " + this.car.getModel());
        this.car.stopMoving();
    }

    public String getFullName() {
        return fullName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        if (category == null) {
            throw new IllegalArgumentException("Необходимо указать тип прав!");
        }
        this.category = category;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    @Override
    public String toString() {
        return String.format("Водитель %s управляет автомобилем %s %s и будет участвовать в заезде",
                this.fullName,
                this.car.getBrand(),
                this.car.getModel());
    }
}