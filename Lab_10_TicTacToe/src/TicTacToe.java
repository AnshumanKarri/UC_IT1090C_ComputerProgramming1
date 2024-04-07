import java.util.*;

public class TicTacToe {
    private static final Scanner IN = new Scanner(System.in);
    private static final int ROW = 3;
    private static final int COLUMN = 3;
    private static String [][] board = new String[ROW][COLUMN];

    public static void main(String[] args) {
        boolean continuePlaying = false;
        String player = " ";
        do {
            clearBoard();
            player = " ";
            while (true) {
                if (player.equals("X"))
                    player = "O";
                else
                    player = "X";
                display();
                takeTurn(player);
                if (isWin(player)) {
                    System.out.println("PLAYER " + player + " WINS!!!\n");
                    continuePlaying = SafeInput.getYNConfirm(IN, "Would you like to play again? (Y or N):");
                    break;
                } else if (isTie()) {
                    System.out.println("THE GAME ENDS IN A TIE!!!");
                    continuePlaying = SafeInput.getYNConfirm(IN, "Would you like to play again? (Y or N)");
                    break;
                }
            }
        } while (continuePlaying);
    }

    private static void clearBoard() {
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COLUMN; j++)
                board[i][j] = " ";
        }

    }
    private static void display() {
        System.out.println("-------");
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COLUMN; j++)
                System.out.print("|" + board[i][j]);
            System.out.println("|");
            System.out.println("-------");
        }
    }
    private static boolean isValidMove(int row, int col) {
        return board[row][col].equals(" ");
    }
    private static void takeTurn(String player) {
        int xCoor = 0;
        int yCoor = 0;
        if (player.equals("X")) {
            do {
                xCoor = SafeInput.getRangedInt(IN, "Player 1, type in the x-coordinate of your move (1-3): ", 1, 3);
                yCoor = SafeInput.getRangedInt(IN, "Player 1, type in the y-coordinate of your move (1-3): ", 1, 3);
            } while (!isValidMove(yCoor-1, xCoor-1));
        } else if (player.equals("O")){
            do {
                xCoor = SafeInput.getRangedInt(IN, "Player 2, type in the x-coordinate of your move (1-3): ", 1, 3);
                yCoor = SafeInput.getRangedInt(IN, "Player 2, type in the y-coordinate of your move (1-3): ", 1, 3);
            } while (!isValidMove(yCoor-1, xCoor-1));
        }
        board[yCoor-1][xCoor-1] = player;
    }
    private static boolean isWin(String player) {
        return isColWIn(player) || isRowWin(player) || isDiagonalWin(player);
    }
    private static boolean isColWIn(String player) {
        return (board[0][0].equals(player) && board[0][1].equals(player) && board[0][2].equals(player)) ||
                (board[1][0].equals(player) && board[1][1].equals(player) && board[1][2].equals(player)) ||
                 (board[2][0].equals(player) && board[2][1].equals(player) && board[2][2].equals(player));
    }
    private static boolean isRowWin(String player) {
        return (board[0][0].equals(player) && board[1][0].equals(player) && board[2][0].equals(player)) ||
                (board[0][1].equals(player) && board[1][1].equals(player) && board[2][1].equals(player)) ||
                (board[0][2].equals(player) && board[1][2].equals(player) && board[2][2].equals(player));
    }
    private static boolean isDiagonalWin(String player) {
        return (board[0][0].equals(player) && board[1][1].equals(player) && board[2][2].equals(player)) ||
                (board[2][0].equals(player) && board[1][1].equals(player) && board[0][2].equals(player));
    }
    private static boolean isTie() {
        return checkEntireBoard("X") || checkEntireBoard("O") || (checkEveryVector("X") && checkEveryVector("O"));
    }
    private static boolean checkEntireBoard(String player) {
        return board[0][0].equals(player) && board[1][0].equals(player) && board[2][0].equals(player) &&
                board[0][1].equals(player) && board[1][1].equals(player) && board[2][1].equals(player) &&
                board[0][2].equals(player) && board[1][2].equals(player) && board[2][2].equals(player);
    }
    private static boolean checkEveryVector(String player) {
        return (board[0][0].equals(player) || board[1][0].equals(player) || board[2][0].equals(player)) &&
                (board[0][1].equals(player) || board[1][1].equals(player) || board[2][1].equals(player)) &&
                (board[0][2].equals(player) || board[1][2].equals(player) || board[2][2].equals(player)) &&
                (board[0][0].equals(player) || board[0][1].equals(player) || board[0][2].equals(player)) &&
                (board[1][0].equals(player) || board[1][1].equals(player) || board[1][2].equals(player)) &&
                (board[2][0].equals(player) || board[2][1].equals(player) || board[2][2].equals(player)) &&
                (board[0][0].equals(player) || board[1][1].equals(player) || board[2][2].equals(player)) &&
                (board[2][0].equals(player) || board[1][1].equals(player) || board[2][0].equals(player));
    }
}
