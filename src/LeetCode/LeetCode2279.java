package LeetCode;

public class LeetCode2279 {
//    public static  int findMax(int[] rocks){
//        Arrays.sort(rocks);
//
//        return max;
//    }
    public static void main(String[] args) {
        int[] capacity = {91,54,63,99,24,45,78};
        int[] rocks = {35,32,45,98,6,1,25};
        int additionalRocks = 17;
        int add = additionalRocks;
        int cnt = 0;
//        for (int i = 0; i < rocks.length; i++) {
//            while (capacity[i] != rocks[i] && capacity[i] > rocks[i]) {
//                if ()
//                    rocks[i] +=  1;
//            }
//
//        }
//        int max = findMax(rocks);
        for (int i = 0; i < rocks.length; i++) {
            if (capacity[i] != rocks[i] && capacity[i] > rocks[i]){

//                if (rocks[max]<capacity[i]){
//                    rocks[max]+=1;
////                }
//                else
//                    rocks[i]+=1;
            }
        }
        for (int i = 0; i < rocks.length; i++) {
            if (capacity[i] == rocks[i]) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
