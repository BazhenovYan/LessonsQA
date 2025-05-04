package tictactoe;
import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Инициализация игрового поля
        char[][] board = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };
        int row = 0, col = 0;
        char player = 'X';
        boolean gameFinished = false;
        System.out.println("Игроки по очереди вводят координаты (ряд [1-3] и столбец [1-3])");
        while (!gameFinished) {
            // инициализация поля
            System.out.println("-------------");
            for (int i = 0; i < 3; i++) {
                System.out.print("| ");
                for (int j = 0; j < 3; j++) {
                    System.out.print(board[i][j] + " | ");
                }
                System.out.println();
                System.out.println("-------------");
            }
            // Ход текущего игрока
            boolean validMove = false;
            while (!validMove) {
                System.out.print("Игрок " + player + ", введите ряд (1-3): ");
                row = scanner.nextInt() - 1;
                System.out.print("Игрок " + player + ", введите столбец (1-3): ");
                col = scanner.nextInt() - 1;
                if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ') {
                    validMove = true;
                } else {
                    System.out.println("Некорректный ход. Попробуйте снова.");
                }
            }
            board[row][col] = player;
            boolean win = false;
            for (int i = 0; i < 3; i++) {
                if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                    win = true;
                }
                if (board[0][i] == player && board[1][i] == player && board[2][i] == player) {
                    win = true;
                }
            }
            if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
                win = true;
            }
            if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
                win = true;
            }
            if (win) {
                System.out.println("-------------");
                for (int i = 0; i < 3; i++) {
                    System.out.print("| ");
                    for (int j = 0; j < 3; j++) {
                        System.out.print(board[i][j] + " | ");
                    }
                    System.out.println();
                    System.out.println("-------------");
                }
                System.out.println("Игрок " + player + " победил!");
                gameFinished = true;
                continue;
            }
            boolean isFull = true;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == ' ') {
                        isFull = false;
                        break;
                    }
                }
                if (!isFull) break;
            }
            if (isFull) {
                // Отрисовка поля
                System.out.println("-------------");
                for (int i = 0; i < 3; i++) {
                    System.out.print("| ");
                    for (int j = 0; j < 3; j++) {
                        System.out.print(board[i][j] + " | ");
                    }
                    System.out.println();
                    System.out.println("-------------");
                }
                System.out.println("Ничья!");
                gameFinished = true;
                continue;
            }
            // Смена игрока
            player = (player == 'X') ? 'O' : 'X';
        }
        scanner.close();
    }
}