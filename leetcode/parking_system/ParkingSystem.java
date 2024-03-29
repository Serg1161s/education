package leetcode.parking_system;

public class ParkingSystem {
    int big;
    int medium;
    int small;
    protected ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;

    }

    protected boolean addCar(int carType) {
        if ((carType == 1) && (big > 0)){
            big--;
            return true;
        }
        if ((carType == 2) && (medium > 0)){
            medium--;
            return true;
        }
        if ((carType == 3) && (small > 0)){
            small--;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "ParkingSystem{" +
                "big=" + big +
                ", medium=" + medium +
                ", small=" + small +
                '}';
    }
}

