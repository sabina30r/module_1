package nix.edu;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Lev1Util {

    public int countArrayUniqueDigits(int[] array) {
        Integer[] inputArr = Arrays.stream(array)
                .boxed()
                .toArray(Integer[]::new);
        Set<Integer> resultSet = new HashSet<Integer>(Arrays.asList(inputArr));
        System.out.println(resultSet.size());
        return resultSet.size();

    }

    public boolean checkHorseMove(int currentRow, int currentColumn, int supposedRow, int supposedColumn){
        boolean possibility = true;
       int rowDiff = Math.abs(currentRow - supposedRow);
       int colDiff = Math.abs(currentColumn - supposedColumn);
        if (rowDiff == 1 & colDiff == 2 | rowDiff == 2 & colDiff == 1 )
            System.out.println("It's possible to make move");
        else {
            possibility = false;
        System.out.println("It's impossible to make move");}
        return possibility;
    }

    public double findTriangleSquare(double point1X, double point2X, double point3X, double point1Y,
                                     double point2Y, double point3Y){
        double square = 0;
        double triangleSide1 = Math.sqrt((point1X - point2X) * (point1X - point2X)
                + (point1Y - point2Y) * (point1Y - point2Y));
        double triangleSide2 = Math.sqrt((point1X - point3X) * (point1X - point3X)
                + (point1Y - point3Y) * (point1Y - point3Y));
        double triangleSide3 = Math.sqrt((point2X - point3X) * (point2X - point3X)
                + (point2Y - point3Y) * (point2Y - point3Y));
        if (triangleSide1 + triangleSide2 <= triangleSide3
                || triangleSide1 + triangleSide3 <= triangleSide2
                || triangleSide1 + triangleSide3 <= triangleSide2)
            System.out.println("Such triangle doesn't exist");
        else
        {
            double halfPerimeter = (triangleSide1 + triangleSide2 + triangleSide3) / 2.0;
             square = Math.sqrt(halfPerimeter * (halfPerimeter - triangleSide1)
                    * (halfPerimeter - triangleSide2) * (halfPerimeter - triangleSide3));
            System.out.printf("%.2f", square);
        }
        return square;
    }

}
