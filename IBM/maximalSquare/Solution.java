package maximalSquare;
/*Given an m x n binary matrix filled with 0's and 1's,
find the largest square containing only 1's and return its area.
Constraints:

m == matrix.length
n == matrix[i].length
1 <= m, n <= 300
matrix[i][j] is '0' or '1'.
* */
public class Solution {
    public int maximalSquare(int[][] matrix){
        int row = matrix.length;
        int col = matrix[0].length;

        int max = 0;
        int dp[][] = new int[row + 1][col + 1];
        for(int i = 1 ; i <= row ; i++){
            for (int j = 1; j <= col; j++) {
                if(matrix[i - 1][j - 1] == 1){
                    dp[i][j] = Math.min(dp[i - 1][j - 1], Math.min(dp[i -1][j], dp[i][j - 1])) + 1;
                    max = Math.max(max, dp[i][j]);
                }
            }
        }
        return max * max;

    }
    public static void main(String[] args) {
        // {{0}} {{0,1},{1,0}} , {{1,0,1,0,0},{1,0,1,1,1},{1,1,1,1,1},{1,0,0,1,0}}
        int [][] matrix = {{1,0,1,0,0},{1,0,1,1,1},{1,1,1,1,1},{1,0,0,1,0}} ;
        Solution solution= new Solution();
        System.out.println(solution.maximalSquare(matrix));
    }
}
//as we need to traverse the whole matrix, the complexity is O(n * m),
// n is the number of rows, and m is the number of columns.