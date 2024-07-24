package Recursion;

public  class RecursionAllTopics {


    public static void Arrp(int[] a, int size){

        if(size==0){
            return;
        }
        Arrp(a, size-1);
        System.out.print(a[size-1]+" ");
        return;
    }


    public static void evenArr(int[] a, int size){

        if(size==0){

            return;
        }
        evenArr(a, size-1);
        if(a[size-1]%2 == 0){
            System.out.println(a[size-1]+" ");
        }
        return;
    }


    public static void ArrIndx(int[] a, int size, int targ){

        if(size==0){

            return;
        }
        ArrIndx(a, size-1,targ);
        if(a[size-1] == targ){
            System.out.println(size-1 + " ");
        }
        return;
    }


    public static int ArrMax(int[] a, int size){
        int max=0;
        if(size==0){
            return 0;
        }
        ArrMax(a, size-1);

        if(a[size-1]>max){
            max=a[size-1];
        }

        return max;
    }


    public static boolean ArrTrueFalse(int[] a, int size){

        if(size==0){
            return true;
        }

        if(a[size-2]<a[size-1]){
            return true;
        }

        boolean predict=ArrTrueFalse(a, size-1);
        return predict;
    }

    public static boolean PalindromeArr(String st, int left,int right){
        if(left > right){
            return true;
        }
        if(st.charAt(left)!=st.charAt(right)){
            return false;
        }
        boolean res = PalindromeArr(st,left+1,right-1);
        return res;
    }

    public static void path(int n, int row, int col, String ans){
        if(row == n && col == n){
            System.out.print(ans+" ");
            return;
        }
        if (row>n || col>n) {
            return;
        }
        path(n, row, col+1, ans+"H");
        path(n, row+1, col, ans+"V");
    }

    static int cnt=0;
    public static void pathCoin(int n, int co1,String ans){

        if(co1 == n ){
            System.out.println(ans+" ");
            cnt++;
            return;
        }
        if (n<co1 ) {
            return;
        }
        pathCoin(n, co1+1, ans+"1");
        pathCoin(n, co1+2, ans+"2");
        pathCoin(n, co1+2, ans+"3");
    }

    public static void main(String[] args){
        int[] a={15,8,20,35,40,55};
        int size = a.length;
        int targ=8;

        System.out.println("Print an Array:");
        Arrp(a, size);

        System.out.println();
        System.out.println("Even elements in an Array:");
        evenArr(a, size);

        System.out.println();
        System.out.println("Index of target in an Array:");
        ArrIndx(a, size,targ);

        System.out.println();
        System.out.println("Max num in an Array:");
        System.out.println(ArrMax(a, size));

        System.out.println();
        System.out.println("if an Array is sorted print true or print false:");
        System.out.println(ArrTrueFalse(a, size));

        System.out.println();
        String st = "malayalam";
        int left= 0;
        int right= st.length()-1;
        System.out.println("Palindrome");
        System.out.println(PalindromeArr(st,left,right));

        System.out.println();
        System.out.println("PATH:");
        path(2,0,0,"");

        System.out.println();
        System.out.println("Path for coin 3:");
        pathCoin(3,0,"");
        System.out.println(cnt);
    }
}
