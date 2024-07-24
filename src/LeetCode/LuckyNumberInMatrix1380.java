package LeetCode;

import java.util.ArrayList;
import java.util.*;

public class LuckyNumberInMatrix1380 {
    public static void main(String[] args) {
        Solution_6 sol = new Solution_6();
        Scanner sc =new Scanner(System.in);
        int[][] matrix = {{7,8},{1,2}};
        List<Integer> ans = sol.luckyNumbers(matrix);
        System.out.println(ans);
    }
}
class Solution_6 {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> rMin = new ArrayList<>();
        List<Integer> cMax = new ArrayList<>();
        List<Integer> luck = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < matrix[0].length; j++) {
                min = Math.min(min, matrix[i][j]);
            }
            rMin.add(min);
        }


        for (int i = 0; i < matrix[0].length; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < matrix.length ; j++) {
                max = Math.max(max, matrix[j][i]);
            }
            cMax.add(max);
        }


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == rMin.get(i) && matrix[i][j] == cMax.get(j))
                    luck.add(matrix[i][j]);
            }
        }
        return luck;
    }
}