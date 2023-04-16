package m17_rotate_image_matrix;

class Solutio2 {
    public void rotate(int[][] A) {
        transpose(A);
        reflect(A);
    }
    private void transpose(int[][] A) {
        int n = A.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int tmp = A[j][i];
                A[j][i] = A[i][j];
                A[i][j] = tmp;
            }
        }
    }
    private void reflect(int[][] A) {
        int n = A.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int tmp = A[i][j];
                A[i][j] = A[i][n - j - 1];
                A[i][n - j - 1] = tmp;
            }
        }
    }
}