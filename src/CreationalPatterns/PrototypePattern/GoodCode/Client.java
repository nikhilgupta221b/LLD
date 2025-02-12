package CreationalPatterns.PrototypePattern.GoodCode;

public class Client {
    public static void main(String[] args) {
        GameBoard gameBoard = new GameBoard();
        gameBoard.addGamePiece(new GamePiece("Red", 1));
        gameBoard.addGamePiece(new GamePiece("Yellow", 2));

        gameBoard.printGamePieces();

        // Copying new board
        GameBoard gameBoard2 = gameBoard.copy();

        System.out.println("New Board: ");
        gameBoard2.printGamePieces();
    }
}
