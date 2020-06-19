package nix.edu;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FirstLevelTest {

    private static Lev1Util level1;
    @BeforeAll
    public static void configFirstLevel(){
        level1 = new Lev1Util();
    }

    @Test
    public void countUniqueDigitsTest(){
        int[] arr = {1,2,3,4,5,6,7,8,9,1,1,5,6,8,4,};
        assertEquals(9,level1.countArrayUniqueDigits(arr));
    }

    @Test
    public void checkHorseMoveTest(){
        assertFalse( level1.checkHorseMove(1,1,2,2));
        assertTrue(level1.checkHorseMove(2,4,1,2));
    }

    @Test
    public void findTriangleSquareTest(){
        assertEquals(35.50, level1.findTriangleSquare(1,2,-8,3,-5,4));
    }
}
