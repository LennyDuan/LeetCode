package questions;

import utility.Common;

/**
 * Created by Lenny on 02/04/2017.
 */
public class IslandPerimeter463 {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 1) {
                    perimeter += getCellPer(grid, i, j, grid.length - 1, grid[0].length - 1);
                }
            }
        }
        return perimeter;
    }

    private int getCellPer(int[][] grid, int x, int y, int xMax, int yMax) {
        int perimeter = 0;
        if (x == 0) {
            Common.sysprint("Cell left ++");
            perimeter ++;
        } else if(x - 1 >= 0) {
            Common.sysprint("Cell left + 1 ++");

            if (grid[x - 1][y] == 0) {
                perimeter ++;
            }
        }

        if (y == 0) {
            Common.sysprint("Cell top ++");

            perimeter ++;
        } else if(y - 1 >= 0) {
            Common.sysprint("Cell top + 1 ++");

            if (grid[x][y - 1] == 0) {
                perimeter ++;
            }
        }

        if (x == xMax) {
            Common.sysprint("Cell right ++");

            perimeter ++;
        } else if(x + 1 <= xMax) {
            Common.sysprint("Cell right + 1 ++");

            if (grid[x + 1][y] == 0) {
                perimeter ++;
            }
        }

        if (y == yMax) {
            Common.sysprint("Cell bot ++");
            perimeter ++;
        } else if(y + 1 <= yMax) {
            Common.sysprint("Cell bot + 1 ++");

            if (grid[x][y + 1] == 0) {
                perimeter ++;
            }
        }


        return perimeter;
    }
}
