
import java.util.*;

public class ThreeSevens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] seen = new int[50001];
        for (int tc = 1; tc <= t; tc++) {
            int m = sc.nextInt();
            int[][] arr = new int[m][];
            int[] ans = new int[m];
            for (int i = 0; i < m; i++) {
                int n = sc.nextInt();
                arr[i] = new int[n];
                for (int j = 0; j < n; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            boolean possible = true;
            for (int i = m - 1; i >= 0; i--) {
                int winner = -1;
                for (int j = 0; j < arr[i].length; j++) {
                    int person = arr[i][j];
                    if (seen[person] != tc) {
                        winner = person;
                        break;
                    }
                }
                if (winner == -1) {
                    possible = false;
                    break;
                }
                ans[i] = winner;
                for (int person : arr[i]) {
                    seen[person] = tc;
                }
            }
            if (!possible) {
                System.out.println(-1);
            } else {
                for (int i = 0; i < m; i++) {
                    System.out.print(ans[i] + " ");
                }
                System.out.println();
            }
        }
    }
}
