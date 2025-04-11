
public class Day5Task1 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setColor("Red");
        myCar.setModel("Ford");
        myCar.setYears(2020);
        System.out.println(myCar.getInfo());

    }
}

class Car {
    private String model;
    private String color;
    private int years;

    public void setModel(String model) {
        if (model.isEmpty()) {
            System.out.println("Model is empty");
        } else {
            this.model = model;
        }
    }

    public void setColor(String color) {
        if (color.isEmpty()) {
            System.out.println("Color is empty");
        } else {
            this.color = color;
        }
    }

    public void setYears(int years) {
        if (years < 0) {
            System.out.println("Years is negative");
        } else {
            this.years = years;
        }
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYears() {
        return years;
    }

    public String getInfo() {
        return "Model: " + model + ", Color: " + color + ", Years: " + years;
    }
}