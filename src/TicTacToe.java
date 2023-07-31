import java.util.Scanner;

public class TicTacToe {
    // Constants
    private static final int ROW = 3;
    private static final int COL = 3;
    private static String[][] board = new String[ROW][COL];
    private static String currentPlayer = "X";

    // Helper Methods
    private static void clearBoard() {
        // Set all elements of the board to a space character.
    }

    private static void display() {
        // Show the Tic Tac Toe game board.
    }

    private static boolean isValidMove(int row, int col) {
        // Check if the given move coordinates are valid (i.e., the corresponding cell is empty).
    }

    private static boolean isColWin(String player) {
        // Check for a column win for the specified player (X or O).
    }

    private static boolean isRowWin(String player) {
        // Check for a row win for the specified player (X or O).
    }

    private static boolean isDiagonalWin(String player) {
        // Check for a diagonal win for the specified player (X or O).
    }

    private static boolean isWin(String player) {
        // Check if the specified player (X or O) has won the game using isColWin, isRowWin, and isDiagonalWin methods.
    }

    private static boolean isTie() {
        // Check if the game is a tie (i.e., all spaces on the board are filled or all possible 8 wins are blocked by having both X and O in them).
    }

    // Main Method
    public static void main(String[] args) {
        // Initialize the board and current player
        clearBoard();
        currentPlayer = "X";

        Scanner scanner = new Scanner(System.in);

        // Main game loop
        while (true) {
            // Display the board
            display();

            // Get player move coordinates (row and column)
            // Convert player move coordinates to array indices (subtract 1)
            // Loop until the converted player coordinates are a valid move (use isValidMove)

            // Check for a win or a tie
            // If there is a win or tie, announce it and prompt the players to play again.

            // Toggle the player (X becomes O, O becomes X)
        }

        scanner.close();
    }
}