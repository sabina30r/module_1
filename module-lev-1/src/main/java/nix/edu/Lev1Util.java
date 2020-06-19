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
        System.out.print(resultSet.size());
        return resultSet.size();

    }

}
