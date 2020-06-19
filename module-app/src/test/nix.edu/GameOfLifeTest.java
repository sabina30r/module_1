package nix.edu;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GameOfLifeTest {
    private static GameOfLife gameOfLife;

    @Test
    public void countNoLivingNeighboursInAnEmptyGridTest() {
        gameOfLife = new GameOfLife(5,10);
        int neighboursCount = gameOfLife.countLivingNeighbours(1, 4);

        assertTrue(neighboursCount == 0);
    }

    @Test
    public void countHeightLivingNeighboursTest() {
        gameOfLife = new GameOfLife(5,10);

        gameOfLife.setLivingCell(0, 3);
        gameOfLife.setLivingCell(0, 4);
        gameOfLife.setLivingCell(0, 5);
        gameOfLife.setLivingCell(1, 5);
        gameOfLife.setLivingCell(2, 5);
        gameOfLife.setLivingCell(2, 4);
        gameOfLife.setLivingCell(2, 3);
        gameOfLife.setLivingCell(1, 3);

        int neighboursCount = gameOfLife.countLivingNeighbours(1, 4);

        assertTrue(neighboursCount == 8);
    }

    @Test
    public void countThreeLivingNeighboursTest() {
        gameOfLife = new GameOfLife(5,10);

        gameOfLife.setLivingCell(0, 1);
        gameOfLife.setLivingCell(1, 1);
        gameOfLife.setLivingCell(1, 0);

        int neighboursCount = gameOfLife.countLivingNeighbours(0, 0);

        assertTrue(neighboursCount == 3);
    }

    @Test
    public void countCellWithAtLeastTwoNeighboursLivesTest() {
        gameOfLife = new GameOfLife(5,10);

        gameOfLife.setLivingCell(0, 0);
        gameOfLife.setLivingCell(0, 1);
        gameOfLife.setLivingCell(1, 1);

        gameOfLife.findNextGeneration();

        assertTrue(gameOfLife.isAlive(0,0));
    }


    @Test
    public void countCellWithMoreThanThreeNeighboursDiesTest() {
        gameOfLife = new GameOfLife(5,10);

        gameOfLife.setLivingCell(1, 4);
        gameOfLife.setLivingCell(0, 3);
        gameOfLife.setLivingCell(0, 4);
        gameOfLife.setLivingCell(0, 5);
        gameOfLife.setLivingCell(1, 5);

        gameOfLife.findNextGeneration();

        assertTrue(gameOfLife.isDead(1,4));

    }

    @Test
    public void countDeadCellWithThreeNeighboursGetsAliveTest() {
        gameOfLife = new GameOfLife(5,10);

        gameOfLife.setLivingCell(0, 3);
        gameOfLife.setLivingCell(0, 4);
        gameOfLife.setLivingCell(0, 5);

        gameOfLife.findNextGeneration();

        assertTrue(gameOfLife.isAlive(1,4));

    }
}

