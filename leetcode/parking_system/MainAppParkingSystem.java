package leetcode.parking_system;

import java.util.Arrays;

public class MainAppParkingSystem {
    public static void main(String[] args) {
        var i = 8;
        var p = 9;
        System.out.println(i*p);


        ParkSystem2 obj = new ParkSystem2(3,4,1);
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
