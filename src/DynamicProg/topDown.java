package DynamicProg;
public class topDown {
    static class top{
        long[] arr = new long[500];
        int cnt=0;
        public long fib(int n)
        {

            if(n == 0)
            {
                arr[n] =0;
                return n;
            }
            if(n == 1)
            {
                arr[n] = 1;
                return n;
            }
            if(arr[n] == 0)
            {
                cnt++;
                arr[n] = fib(n-2)+fib(n-1);
            }
            return arr[n];
        }
    }
    public static void main(String[] args) {
        top t = new top();
        long n = t.fib(50);
        System.out.println(n+" "+t.cnt);
    }
}
