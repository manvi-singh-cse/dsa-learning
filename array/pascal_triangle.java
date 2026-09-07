import java.util.*;

public class pascal_triangle {
    public static ArrayList<Long> generate_row(int r) {
        ArrayList<Long> row = new ArrayList<>();
        long ans = 1;
        row.add(ans);
        for (int i = 1; i <= r; i++) {
            ans = ans * (r - i + 1) / i;  
            row.add(ans);
        }
        return row;
    }

    public static ArrayList<ArrayList<Long>> printPascal(int n) {
        ArrayList<ArrayList<Long>> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {   
            result.add(generate_row(i));
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 4; 
        ArrayList<ArrayList<Long>> pascalTriangle = printPascal(n);
        for (ArrayList<Long> row : pascalTriangle) {
            System.out.println(row);
        }
    }
}