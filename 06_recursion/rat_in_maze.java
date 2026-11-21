import java.util.ArrayList;

public class rat_in_maze {
    public static void solve(int row, int col, int n, int[][] maze, int[][] path, ArrayList<ArrayList<Integer>> ans) {
        if (row == n - 1 && col == n - 1) {
            path[row][col] = 1;

            ArrayList<Integer> temp = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    temp.add(path[i][j]);
                }
            }

            ans.add(temp);
            path[row][col] = 0;
            return;
        }

        path[row][col] = 1;

        // Down
        if (row + 1 < n && maze[row + 1][col] == 1 && path[row + 1][col] == 0) {
            solve(row + 1, col, n, maze, path, ans);
        }

        // Left
        if (col - 1 >= 0 && maze[row][col - 1] == 1 && path[row][col - 1] == 0) {
            solve(row, col - 1, n, maze, path, ans);
        }

        // Right
        if (col + 1 < n && maze[row][col + 1] == 1 && path[row][col + 1] == 0) {
            solve(row, col + 1, n, maze, path, ans);
        }

        // Up
        if (row - 1 >= 0 && maze[row - 1][col] == 1 && path[row - 1][col] == 0) {
            solve(row - 1, col, n, maze, path, ans);
        }

        path[row][col] = 0;
    }

    public static ArrayList<ArrayList<Integer>> ratInAMaze(int[][] maze, int n) {

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        if (maze[0][0] == 0 || maze[n - 1][n - 1] == 0) {
            return ans;
        }
        int[][] path = new int[n][n];
        solve(0, 0, n, maze, path, ans);
        return ans;
    }

    public static void main(String[] args) {
        int[][] maze = {
                { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 1, 1, 0, 0 },
                { 0, 1, 1, 1 }
        };
        int n = maze.length;

        ArrayList<ArrayList<Integer>> result = ratInAMaze(maze, n);

        for (ArrayList<Integer> path : result) {
            System.out.println(path);
        }
    }
}
