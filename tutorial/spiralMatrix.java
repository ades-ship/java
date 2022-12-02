import java.util.*;

class spiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        // int arr[n][m];
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int row_s = 0, row_e = n - 1, col_s = 0, col_e = m - 1;

        while (row_s <= row_e && col_s <= col_e) {
            for (int i = col_s; i <= col_e; i++) {
                System.out.print(arr[row_s][i] + " ");
            }
            row_s++;
            for (int i = row_s; i <= row_e; i++) {
                System.out.print(arr[i][col_e] + " ");
            }
            col_e--;
            for (int i = col_e; i >= col_s; i--) {
                System.out.print(arr[row_e][i] + " ");

            }
            row_e--;
            for (int i = row_e; i >= row_s; i--) {
                System.out.print(arr[i][col_s] + " ");
            }
            col_s++;
        }

    }

}