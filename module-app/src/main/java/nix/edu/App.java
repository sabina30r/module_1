package nix.edu;

public class App {
    public static void main(String[] args) {
        int[] arr = {1,4,5,1,1,3};
        Lev1Util lev1Util = new Lev1Util();
        System.out.print("Number of unique digits: ");
        lev1Util.countArrayUniqueDigits(arr);
        System.out.print("Check possibility of horse move: ");
        lev1Util.checkHorseMove(1,1,2,2);
    }
}
