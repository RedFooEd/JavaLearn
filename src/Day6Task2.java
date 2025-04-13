import transport.Airplane;

public class Day6Task2 {
    public static void main(String[] args) {
        Airplane myAirplane = new Airplane("Paytheon", 2019, 28, 17, 0);
        myAirplane.setYear(2010);
        myAirplane.setLength(20);
        myAirplane.fillUp(850);
        myAirplane.fillUp(1500);
        myAirplane.info();
    }
}






