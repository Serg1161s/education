package leetcode.parking_system;

import java.util.Arrays;

class ParkSystem2 {
    int [] parkingPlace;

    public ParkSystem2 (int big, int medium, int small){
        parkingPlace = new int[]{big,medium,small};
    }

    protected boolean addCar (int carType){
        return parkingPlace[carType-1]-- > 0;
    }

    @Override
    public String toString() {
        return "ParkSystem2{" +
                "parkingPlace=" + Arrays.toString(parkingPlace) +
                '}';
    }
}
