package leetcode;

/**
 * projectName：test
 * name：T289生命游戏
 * description：todo
 * date：2020/4/19 1:40 下午
 * auther：nidingbo
 */
public class T289生命游戏 {
    public static void main(String[] args) {
        int[][]a = {
                {0,1,0},
                {0,0,1},
                {1,1,1},
                {0,0,0}
        };
        gameOfLife(a);
    }
    public static void gameOfLife(int[][] board) {
        int row = board.length;
        int col = board[0].length;
        int[][] newBorad = new  int[row][col];
        // 从原数组复制一份到 copyBoard 中
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                newBorad[i][j] = board[i][j];
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                isAlive(board,i,j,newBorad);
            }
        }
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
    public static int calculateQuantity(int[][] board, int x, int y){
        int row = board.length; // 4
        int col = board[0].length; // 3
        int x1 = -1, y1 = -1, x2 = 1, y2 = 1;
        int sum = 0;
        if (x == 0){
            x1 += 1;
        }
        if (x == row-1){
            x2 -= 1;
        }
        if (y == 0){
            y1 += 1;
        }
        if (y == col-1){
            y2 -= 1;
        }
        for (int i = y1; i <= y2; i++){
            for (int j = x1; j <= x2; j++){
                if (board[x+j][y+i] == 1 ){
                    sum++;
                }
            }
        }
        if (board[x][y]==1){
            sum -= 1;
        }
        return sum;
    }
    public static int[][] isAlive(int[][] board, int x, int y,int[][] newBroad){
        int a = calculateQuantity(newBroad,x,y);
        if (a<2 || a>3){
            board[x][y] = 0;
        }
        if (a==3){
            board[x][y] = 1;
        }
        if (a==2 && board[x][y] ==1){
            board[x][y] = 1;
        }
        return board;
    }
}