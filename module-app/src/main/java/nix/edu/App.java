package nix.edu;

public class App {
    public static void main(String[] args) {
        int[] arr = {1,4,5,1,1,3};
        String stringForTask1 = "{module( of nix ) educational} [program]";
        Lev1Util lev1Util = new Lev1Util();
        Lev2Util lev2Util = new Lev2Util();
        System.out.println("Level 1");
        System.out.print("Number of unique digits: ");
        lev1Util.countArrayUniqueDigits(arr);
        System.out.print("Check possibility of horse move: ");
        lev1Util.checkHorseMove(1,1,2,2);
        System.out.print("Triangle's square: ");
        lev1Util.findTriangleSquare(1,2,5,1,5,3);
        System.out.println();
        System.out.println("Level 2");
        System.out.print("Is input string correct? : ");
        lev2Util.checkStringWithBrackets(stringForTask1);


    }
}
