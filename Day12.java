import java.util.Scanner;
public class Day12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] a = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        if (m != n) {
            System.out.print("Not a Symmetric Matrix");
            return;
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] != a[j][i]) {
                    System.out.print("Not a Symmetric Matrix");
                    return;
                }
            }
        }
        System.out.print("Symmetric Matrix");
    }
}