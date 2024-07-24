package LeetCode;
import java.util.Stack;

public class PlaceBall_calc_Double {
    public static Stack<Integer> st = new Stack<>();
    public static int  num1 = 0,num2 = 0;
    public static int calculate(String[] str)
    {
        for(int i = 0;i<str.length;i++)
        {
            if(str[i].equals("+") ||str[i].equals("D") || str[i].equals("C"))
            {
                switch (str[i])
                {
                    case "+":
                        num1 = st.pop();
                        num2=st.pop();
                        st.push(num2);
                        st.push(num1);
                        st.push(num1+num2);

                        break;
                    case "D":
                        num1 = st.peek();
                        st.push(num1*2);
                        break;
                    case "C":
                        st.pop();
                        break;
                }
            }
            else
                st.push(Integer.parseInt(str[i]));
        }
        int sum=0;
        while (!st.isEmpty()){
            sum+=st.pop();
        }
        return sum;

    }

    public static void main(String[] args) {
        String[] input = {"5","2","C","D","+"};
        int res = calculate(input);
        System.out.println(res);
    }
}
