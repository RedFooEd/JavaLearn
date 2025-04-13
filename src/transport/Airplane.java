package transport;

public class Airplane {
    private String manufacture;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public static void compareLength(Airplane a, Airplane b) {
        if (a.length > b.length) {
            System.out.println(a.manufacture + ", длинее");
        } else {
            System.out.println(b.manufacture + ", длинее");
        }

    }

    public Airplane(String manufacture, int year, int length, int weight, int fuel) {
        this.manufacture = manufacture;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = fuel;
    }

    public void setManufacture(String manufacture) {
            this.manufacture = manufacture;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }


    public void fillUp(int n) {
        setFuel(n + getFuel());
    }

    public void info() {
        System.out.println("Изготовитель: " + manufacture + ", год выпуска: " + year + ", длина: " + length + ", вес: " + weight + ", количество топлива в баке: " + fuel);
    }
}
