public class Cars {

    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int year;
    private String country;

    public Cars(String brand, String model, double engineVolume, String color, int year, String country) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Mарка- " + brand + ". Модель- " + model + ". Oбъем двигателя в литрах- " + engineVolume + ". Цвет кузова- " + color + ". Год производства- " + year + ". Cтрана сборки- " + country;
    }

}
