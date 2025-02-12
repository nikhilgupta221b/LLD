package CreationalPatterns.PrototypePattern.BadCode;

public class Client {
    public static void main(String[] args) {
        GameBoard gameBoard = new GameBoard();
        gameBoard.addGamePiece(new GamePiece("Red", 1));
        gameBoard.addGamePiece(new GamePiece("Yellow", 2));

        gameBoard.printGamePieces();

        // Copying new board
        GameBoard gameBoard2 = new GameBoard();
        for (GamePiece gamePiece : gameBoard.getGamePieces()) {
            gameBoard2.addGamePiece(gamePiece);
        }

        System.out.println("New Board: ");
        gameBoard2.printGamePieces();
    }
}
