package LeetCode;
class NQueenProblem{
    static int c=0;
    // static int c1=0;
    public static void main(String[] args)
    {
        nqueen(new boolean[4][4] ,0,"");
        // System.out.println("total queen"+c);
    }
    public static void nqueen(boolean[][] board,int row,String ans)
    {
        if(row==board.length){
            System.out.println(ans);
            c++;
            return;

        }
        for(int col=0;col<board[0].length;col++)
        {
            if(safeplaceor(board,row,col))
            {
                board[row][col]=true;
                nqueen(board,row+1,ans+"["+row+" "+col+"]");
                board[row][col]=false;
            }
        }
    }
    public static boolean safeplaceor(boolean[][]board,int row,int col){
        //vertical
        int r=row-1;
        int c=col;
        while(r>=0){
            if(board[r][c]){
                return false;
            }
            r--;
        }
        //horileft
        r=row;
        c=col-1;
        while(c>=0){
            if(board[r][c])
            {
                return false;
            }

            c--;
        }
        //dioganalleft
        r=row-1;
        c=col-1;
        while(r>=0 &&c>=0){
            if(board[r][c]){
                return false;
            }
            r--;
            c--;
        }

        r=row-1;
        c=col+1;
        while(r>=0 && c<board[0].length){
            if(board[r][c]){
                return false;
            }
            r--;
            c++;
        }
        return true;
    }
}


