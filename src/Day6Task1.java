import transport.Car;

public class Day6Task1 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setYears(2010);
        myCar.info();
        System.out.println(myCar.yearDifference(2020));
    }
}


