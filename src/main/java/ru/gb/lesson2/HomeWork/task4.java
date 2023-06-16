package ru.gb.lesson2.HomeWork;

public class task4 {
    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
        System.out.println("Validete:" + isValidSudoku(board));
    }

    /**
     * @apiNote Отвалидировать доску судоку
     * @param board доска судоку
     * @return проверка на валидность
     */
    private static boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == '.') continue;
                if (isValid(board, i, j) == false) return false;
            }
        }
        return true;
    }

    /**
     * @param board доска судоку
     * @param row строка
     * @param col столбец
     * @return проверка на валидность
     */
    private static boolean isValid(char[][] board, int row, int col) {
        // каждая строка должна содержать цифру 1-9 без повторения
        for (int i = 0; i < board.length; i++) {
            if (i == row) continue;
            if (board[i][col] == board[row][col]) return false;
        }
        // каждая колонка должна содержать цифру 1-9 без повторения
        for (int j = 0; j < board[0].length; j++) {
            if (j == col) continue;
            if (board[row][j] == board[row][col]) return false;
        }
        // каждый под блок из 9 элементов 3 x 3 должна содержать цифру 1-9 без повторения
        for (int i = (row / 3) * 3; i < (row / 3 + 1) * 3; i++) {
            for (int j = (col / 3) * 3; j < (col / 3 + 1) * 3; j++) {
                if (i == row && j == col) continue;
                if (board[i][j] == board[row][col]) return false;
            }
        }
        return true;
    }
}
