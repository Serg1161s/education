package leetcode.parking_system;

import java.util.Arrays;

public class MainAppParkingSystem {
    public static void main(String[] args) {

        ParkingSystem obj = new ParkingSystem(3,4,1);
        obj.addCar(3);
        obj.addCar(2);
        obj.addCar(1);
        obj.addCar(1);
        obj.addCar(1);
        obj.addCar(1);
        obj.addCar(1);
        obj.addCar(2);
        obj.addCar(2);
        obj.addCar(2);
        obj.addCar(2);

        System.out.println(obj.toString());
    }
}
