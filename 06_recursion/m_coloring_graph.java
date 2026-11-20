import java.util.ArrayList;
import java.util.List;

public class m_coloring_graph {
    private static boolean isSafe(int node, List<Integer>[] G, int[] color, int n, int col) {
        for (int it : G[node]) {
            if (color[it] == col)
                return false;
        }
        return true;
    }

    private static boolean solve(int node, List<Integer>[] G, int[] color, int n, int m) {
        if (node == n)
            return true;

        for (int i = 1; i <= m; i++) {
            if (isSafe(node, G, color, n, i)) {
                color[node] = i;
                if (solve(node + 1, G, color, n, m) == true)
                    return true;
                color[node] = 0;
            }
        }
        return false;
    }

    public static String graphColoring(int[][] mat, int m) {
        int n = mat.length;
        List<Integer>[] G = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            G[i] = new ArrayList<>();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1) {
                    G[i].add(j);
                }
            }
        }

        int[] color = new int[n];

        if (solve(0, G, color, n, m))
            return "YES";

        return "NO";
    }

    public static void main(String[] args) {
        int[][] mat = {
                { 0, 1, 1, 1 },
                { 1, 0, 1, 0 },
                { 1, 1, 0, 1 },
                { 1, 0, 1, 0 }
        };
        int m = 3;
        System.out.println(graphColoring(mat, m));
    }
}
