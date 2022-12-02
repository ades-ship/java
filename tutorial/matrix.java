import java.util.*;

public class matrix {
    public static void main(String []args) {
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
        for(int i=0 ; i<3 ; i++) {
            for(int j=0; j<3 ; j++) {
                if(i!=j && i+j!=2) {
                   System.out.println(Math.sqrt(arr[i][j]));
                }
            }
        }
    }
}
