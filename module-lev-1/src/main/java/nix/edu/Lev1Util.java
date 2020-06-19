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

    public void checkHorseMove(int currentRow, int currentColumn, int supposedRow, int supposedColumn){
       int rowDiff = Math.abs(currentRow - supposedRow);
       int colDiff = Math.abs(currentColumn - supposedColumn);
        if (rowDiff == 1 & colDiff == 2 | rowDiff == 2 & colDiff == 1 )
            System.out.println("It's possible to make move");
        else System.out.println("It's impossible to make move");
    }

}
