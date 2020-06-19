package nix.edu;

import java.util.Arrays;

public class GameOfLife {

    private int rowCount;
    private int columnCount;
    public int[][] grid;
    public final static int DEAD_CELL = 0;
    public final static int LIVING_CELL = 1;

    public GameOfLife(int rowCount, int columnCount) {
        grid = new int [rowCount][columnCount];
        this.rowCount = grid.length;
        this.columnCount = grid[0].length;
        initializeGridWithDeadCells();
    }

    public void initializeGridWithDeadCells(){
        for (int y = 0; y < this.rowCount; y++) {
            Arrays.fill(grid[y], DEAD_CELL);
        }
    }

    public void setLivingCell(int row, int column) {
        grid[row][column] = LIVING_CELL;
    }

    public int countLivingNeighbours(int row, int column) {

        int[][] cellsToCheck = {
                {row - 1, column - 1},
                {row - 1, column},
                {row - 1, column + 1},
                {row, column + 1},
                {row + 1, column + 1},
                {row + 1, column},
                {row + 1, column - 1},
                {row, column - 1},
        };

        int livingNeighbours = 0;
        for (int i = 0; i < cellsToCheck.length; i++) {
            int rowToCheck = cellsToCheck[i][0];
            int colToCheck = cellsToCheck[i][1];

            if (isInTheGrid(rowToCheck, colToCheck) && isAlive(rowToCheck, colToCheck)) {
                livingNeighbours ++ ;
            }
        }
        return livingNeighbours;
    }

    private boolean isInTheGrid(int row, int col) {
        return row >= 0 && col >= 0 && row < rowCount && col < columnCount;
    }

    public void findNextGeneration() {

        int[][] nextGenerationGrid = new int[rowCount][columnCount];

        for (int y = 0; y < rowCount; y++) {
            for (int x = 0; x < columnCount; x++) {
                if (IsAliveAndHasLessThanTwoLivingNeighbours(y, x)) {
                    nextGenerationGrid[y][x] = DEAD_CELL;
                } else if (IsAliveAndHasTwoOrThreeLivingNeighbours(y, x)) {
                    nextGenerationGrid[y][x] = LIVING_CELL;
                } else if (IsAliveAndHasMoreThanThreeLivingNeighbours(y, x)) {
                    nextGenerationGrid[y][x] = DEAD_CELL;
                } else if (IsDeadAndHasThreeLivingNeighbours(y, x)) {
                    nextGenerationGrid[y][x] = LIVING_CELL;
                } else {
                    nextGenerationGrid[y][x] = grid[y][x];
                }
            }
        }
        grid = nextGenerationGrid.clone();
    }

    private boolean IsDeadAndHasThreeLivingNeighbours(int row, int column) {
        int livingNeighbours = countLivingNeighbours(row, column);
        return isDead(row, column) && livingNeighbours == 3;
    }

    private boolean IsAliveAndHasMoreThanThreeLivingNeighbours(int row, int column) {
        int livingNeighbours = countLivingNeighbours(row, column);
        return isAlive(row, column) && livingNeighbours > 3;
    }

    private boolean IsAliveAndHasTwoOrThreeLivingNeighbours(int row, int column) {
        int livingNeighbours = countLivingNeighbours(row, column);
        return isAlive(row, column) && (livingNeighbours == 2 || livingNeighbours == 3);
    }

    private boolean IsAliveAndHasLessThanTwoLivingNeighbours(int row, int column) {
        int neighboursCount = countLivingNeighbours(row, column);
        return isAlive(row, column) && neighboursCount < 2;
    }


    public boolean isAlive(int row, int column) {
        return grid[row][column] == LIVING_CELL;
    }

    public boolean isDead(int row, int column) {
        return grid[row][column] == DEAD_CELL;
    }

}