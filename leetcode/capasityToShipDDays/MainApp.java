package leetcode.capasityToShipDDays;

public class MainApp {

    public static void main(String[] args) {
        int [] cargo = {1,2,3,1,1};

        Solution s = new Solution();

        System.out.println(s.shipWithinDays(cargo,4));

    }
}
