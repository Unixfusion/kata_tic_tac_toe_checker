package org.example;

public class Main {
    public static void main(String[] args) {
        int[][] test = new int[][] {
                {1, 1, 2},
                {0, 2, 0},
                {2, 1, 1}
        };
        System.out.println(isSolved(test));
    }
    public static int isSolved(int[][] board) {
    if (rowsCheck(board) == 2 || checkColumns(board) == 2 || diagCheck(board) == 2 ) {
        return 2;
    } else if (rowsCheck(board) == 1 || checkColumns(board) == 1 || diagCheck(board) == 1 ) {
        return 1;
    } else if (rowsCheck(board) == -1 || checkColumns(board) == -1 || diagCheck(board) == -1) {
        return -1;
    } else return 0;
    }
    public static int rowsCheck(int[][] board) {
        String line1 = "";
        int result;
        for (int i = 0; i < 3; i++) {
            line1 = line1.concat(Integer.toString(board[0][i]));
        }
        String line2 = "";
        for (int i = 0; i < 3; i++) {
            line2 = line2.concat(Integer.toString(board[1][i]));
        }
        String line3 = "";
        for (int i = 0; i < 3; i++) {
            line3 = line3.concat(Integer.toString(board[2][i]));
        }
        if ( line1.equals("222") || line2.equals("222") || line3.contains("222")) {
            result = 2;
            return result;
        } else if (line1.equals("111") || line2.equals("111") || line3.contains("111")) {
            result = 1;
            return result;
        } else if (line1.contains("0") || line2.contains("0") || line3.contains("0")) {
            result = -1;
            return result;
        } else result = 0;
        return result;
    }
    public static int checkColumns(int[][] board) {
        int result;

        String col1 = "";
        for (int i = 0; i < 3; i++) {
            col1 = col1.concat(Integer.toString(board[i][0]));
        }

        String col2 = "";
        for (int i = 0; i < 3; i++) {
            col2 = col2.concat(Integer.toString(board[i][1]));
        }
        String col3 = "";
        for (int i = 0; i < 3; i++) {
            col3 = col3.concat(Integer.toString(board[i][2]));
        }

        if ( col1.equals("222") || col2.equals("222") || col3.contains("222")) {
            result = 2;
            return result;
        } else if (col1.equals("111") || col2.equals("111") || col3.contains("111")) {
            result = 1;
            return result;
        } else if (col1.contains("0") || col2.contains("0") || col3.contains("0")) {
            result = -1;
            return result;
        } else result = 0;
        return result;
    }
    public static int diagCheck(int[][] board){
        int result;

        String dia1 = "";
        dia1 = dia1.concat(Integer.toString(board[0][0]));
        dia1 = dia1.concat(Integer.toString(board[1][1]));
        dia1 = dia1.concat(Integer.toString(board[2][2]));

        String dia2 = "";
        dia2 = dia2.concat(Integer.toString(board[0][2]));
        dia2 = dia2.concat(Integer.toString(board[1][1]));
        dia2 = dia2.concat(Integer.toString(board[2][0]));

        if ( dia1.equals("222") || dia2.equals("222")) {
            result = 2;
            return result;
        } else if (dia1.equals("111") || dia2.equals("111")) {
            result = 1;
            return result;
        } else if (dia1.contains("0") || dia2.contains("0")) {
            result = -1;
            return result;
        } else result = 0;
        return result;
    }


}