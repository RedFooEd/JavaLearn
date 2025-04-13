import transport.Airplane;


public class Day7Task1 {
    public static void main(String[] args) {
        Airplane myAirplane = new Airplane("Paytheon", 2019, 22, 17, 0);
        Airplane myAirplane2 = new Airplane("Boeing", 2010, 38, 17, 0);
        Airplane.compareLength(myAirplane, myAirplane2);
        myAirplane.setLength(68);
        Airplane.compareLength(myAirplane, myAirplane2);
    }
}
