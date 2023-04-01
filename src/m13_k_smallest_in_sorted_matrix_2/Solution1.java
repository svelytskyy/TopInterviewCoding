package m13_k_smallest_in_sorted_matrix_2;

// O(n * log(max - min)) solution

public class Solution1 {
	
	public static void main(String[] args) {
		
		int[][] arr = new int[][] {{1,3,7},{5,10,12},{6,12,15}};
		int k = 8;
		System.out.println(k+"th smallest " + kthSmallest(arr, k));
		
	}
	
	public static int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int low = matrix[0][0];
        int high = matrix[n - 1][n - 1];
        while (low <= high) {
            int mid = low + (high - low) / 2;
            System.out.println("mid : " + mid +  " low : " + low +  " high : " + high);
            int count = getCount(matrix, mid);
            if (count < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    private static int getCount(int[][] matrix, int mid) {
        int count = 0;
        int n = matrix.length;
        int i = n - 1;
        int j = 0;
        while (i >= 0 && j < n) {
            if (matrix[i][j] > mid) {
                i--;
            } else {
                count += i + 1;
                j++;
            }
        }
        System.out.println("count : " + count);
        return count;
    }


}
