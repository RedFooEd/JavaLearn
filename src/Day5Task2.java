public class Day5Task2 {
    public static void main(String[] args) {
        Motorbike myBike = new Motorbike("Red", "Ford", 130);
        System.out.println("Model: " + myBike.getModel());
        System.out.println("Color: " + myBike.getColor());
        System.out.println("Speed: " + myBike.getSpeed());
    }
}

class Motorbike {
    private String color;
    private String model;
    private int speed;

    public Motorbike(String color, String model, int speed) {
        this.color = color;
        this.model = model;
        this.speed = speed;

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
}
