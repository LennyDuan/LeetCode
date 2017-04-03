package questions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Lenny on 02/04/2017.
 */
class IslandPerimeter463Test {
    @Test
    public void test() {
        int[][] grid = {{0,1,0,0},
                {1,1,1,0},
                {0,1,0,0},
                {1,1,0,0}};
        int result = new IslandPerimeter463().islandPerimeter(grid);
        assertEquals(16, result);
    }

    @Test
    public void test2() {
        int[][] grid = {{1,0}};
        int result = new IslandPerimeter463().islandPerimeter(grid);
        assertEquals(4, result);
    }

    @Test
    public void test3() {
        int[][] grid = {{0, 1}};
        int result = new IslandPerimeter463().islandPerimeter(grid);
        assertEquals(4, result);
    }
}