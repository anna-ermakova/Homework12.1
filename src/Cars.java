public class Cars {

    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int year;
    private String country;

    public Cars(String brand, String model, double engineVolume, String color, int year, String country) {
        if (brand=="" || brand==null) {
            brand = "default";
        }
        this.brand = brand;
        if (model=="" || model==null) {
            model = "default";
        }
        this.model = model;
        if (engineVolume<=0) {
            engineVolume = 1.5;
        }
        this.engineVolume = engineVolume;
        if (color=="" || color==null) {
            color = "белый";
        }
        this.color = color;
        if (year<=0) {
            year = 2000;
        }
        this.year = year;
        if (country=="" || country==null) {
            country = "default";
        }
        this.country = country;
    }

    @Override
    public String toString() {
        return "Mарка- " + brand + ". Модель- " + model + ". Oбъем двигателя в литрах- " + engineVolume + ". Цвет кузова- " + color + ". Год производства- " + year + ". Cтрана сборки- " + country;
    }

}
