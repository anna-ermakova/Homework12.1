public class Main {
    private static Cars[] car;

    public static void main(String[] args) {

        car = new Cars[5];

        car[0] = new Cars("Lada", "Granta", 1.7, "желтый", 2015, "Россия");
        car[1] = new Cars("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия");
        car[2] = new Cars("BMW", "Z8", 3.0, "черный", 2021, "Германия");
        car[3] = new Cars("Kia", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея");
        car[4] = new Cars("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея");

        printCars();
    }

    public static void printCars() {
        for (int i = 0; i < car.length; i++) {
            if (car[i] != null) {
                System.out.println(car[i].toString());
            }
        }
    }
}