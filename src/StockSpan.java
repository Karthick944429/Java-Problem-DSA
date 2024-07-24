import java.util.*;

public class StockSpan {

    public static int[] stockSpan(int[] prices) {
        int n =prices.length;
        int dp[] = new int[n];
        dp[0] = 1;
        for(int i=1; i< n ; i++){
            int current = prices[i];
            if (current<prices[i-1]){
                dp[i] = 1;
            }
            else{
                for(int j =0;j<dp.length; i++){
                    dp[i] += dp[i-1];
                }
            }
        }
        return dp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        scanner.close();

        int[] input_prices = parseInput(input);
        int[] spans = stockSpan(input_prices);

        for (int span : spans) {
            System.out.print(span + " ");
        }
        System.out.println();
    }

    private static int[] parseInput(String[] input) {
        int[] prices = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            prices[i] = Integer.parseInt(input[i]);
        }
        return prices;
    }
}