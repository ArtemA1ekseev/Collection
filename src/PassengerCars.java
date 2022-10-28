public class PassengerCars extends Car implements Competing{

    public PassengerCars(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public String starMoving() {
        return "Поставьте ручку переключателя на первую скорость, продолжая удерживать сцепление. Педаль газа отпускаем. Если температура воздуха предполагает прогрев, то газ нужно подержать немного дольше. Отпуская сцепление, размеренно надавите на педаль.";
    }

    @Override
    public String stopMoving() {
        return "На каждом колесе данная тормозная жидкость под давлением оказывает воздействие на тормоза, надавливая на поршень, воздействующий на тормозные колодки, которые охватывают и сжимают вращающийся барабан или диск. Трение замедляет вращение колес и всего автомобиля.";
    }

    @Override
    public String pitStop() {
        return "Количество остановок на ремонт 2.";
    }

    @Override
    public String bestLapTime() {
        return "Лучшее время круга 13.21 мин";
    }

    @Override
    public String MaximumSpeed() {
        return "Максимальное скорость 120 км/ч.";
    }
}
