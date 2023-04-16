package m17_rotate_image_matrix;

public class Solution1 {
	
	public void rotate(int[][] A) {
        int n = A.length;
        for (int i = 0; i < (n + 1) / 2; i ++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = A[n - 1 - j][i];
                A[n - 1 - j][i] = A[n - 1 - i][n - j - 1];
                A[n - 1 - i][n - j - 1] = A[j][n - 1 -i];
                A[j][n - 1 - i] = A[i][j];
                A[i][j] = temp;
            }
        }
    }

}
