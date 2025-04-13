package transport;

public class Motorbike {
    private String color;
    private String model;
    private int speed;
    private int year;

    public Motorbike(String color, String model, int speed) {
        this.color = color;
        this.model = model;
        this.speed = speed;
        this.year = year;

    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getSpeed() {
        return speed;
    }

    public int getYear() {
        return year;
    }

    public int yearDifference(int inputYear) {
        return Math.abs(inputYear - getYear());
    }

    public void info() {
        System.out.println("This is a car");
    }
}
