public class Train extends Transport{

    private int priceTrips;
    private String stationNameDepartures;
    private String finalStop;
    private int quantityWagons;


    public Train(int priceTrips, String stationNameDepartures, String finalStop, int quantityWagons) {
        this("default", "default", 2001, "default", 100, priceTrips, stationNameDepartures, finalStop, quantityWagons);
    }

    public Train(String brand, String model, int productionYear, String productionCountry, int maxSpeed, int priceTrips, String stationNameDepartures, String finalStop, int quantityWagons) {
        super(brand, model, productionYear, productionCountry, maxSpeed);
        if (priceTrips < 0) {
            this.priceTrips = 1000;
        } else {
            this.priceTrips = priceTrips;
        }
        if (stationNameDepartures != null && !stationNameDepartures.isEmpty() && !stationNameDepartures.isBlank()) {
            this.stationNameDepartures = stationNameDepartures;
        }
        if (finalStop != null && !finalStop.isEmpty() && !finalStop.isBlank()) {
            this.finalStop = finalStop;
        }
        if (quantityWagons < 0) {
            this.quantityWagons = 5;
        } else {
            this.quantityWagons = quantityWagons;
        }
    }

    public Train(String brand, String model, int productionYear, String productionCountry, String color, int priceTrips, String stationNameDepartures, String finalStop, int quantityWagons) {
        super(brand, model, productionYear, productionCountry, color);
        this.priceTrips = priceTrips;
        this.stationNameDepartures = stationNameDepartures;
        this.finalStop = finalStop;
        this.quantityWagons = quantityWagons;
    }

    public Train(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed, int priceTrips, String stationNameDepartures, String finalStop, int quantityWagons) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
        this.priceTrips = priceTrips;
        this.stationNameDepartures = stationNameDepartures;
        this.finalStop = finalStop;
        this.quantityWagons = quantityWagons;
    }

    public int getPriceTrips() {
        return priceTrips;
    }

    public void setPriceTrips(int priceTrips) {
        if (priceTrips < 0) {
            this.priceTrips = 1000;
        } else {
            this.priceTrips = priceTrips;
        }
    }

    public String getStationNameDepartures() {
        return stationNameDepartures;
    }

    public void setStationNameDepartures(String stationNameDepartures) {
        if (stationNameDepartures != null && !stationNameDepartures.isEmpty() && !stationNameDepartures.isBlank()) {
            this.stationNameDepartures = stationNameDepartures;
        }
    }

    public String getFinalStop() {
        return finalStop;
    }

    public void setFinalStop(String finalStop) {
        if (finalStop != null && !finalStop.isEmpty() && !finalStop.isBlank()) {
            this.finalStop = finalStop;
        }
    }

    public int getQuantityWagons() {
        return quantityWagons;
    }

    public void setQuantityWagons(int quantityWagons) {
        if (quantityWagons < 0) {
            this.quantityWagons = 5;
        } else {
            this.quantityWagons = quantityWagons;
        }
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
        System.out.println("Поезду диагностика не требуется!");
        return false;
    }

    @Override
    public String refill() {
        return "Можно заправлять бензином, дизелем на заправке или заряжать на специальных электроду-парковках, если это электрокар";
    }

    @Override
    public void repair() {
        System.out.println("Поезд " + getBrand() + " " + getModel() + " починен!");
    }
}