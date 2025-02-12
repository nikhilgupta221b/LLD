package CreationalPatterns.PrototypePattern.BadCode;

import java.util.ArrayList;
import java.util.List;

public class GameBoard {
    private final List<GamePiece> gamePieces = new ArrayList<>();

    public void addGamePiece(GamePiece gamePiece) {
        gamePieces.add(gamePiece);
    }

    public List<GamePiece> getGamePieces() {
        return gamePieces;
    }

    public void printGamePieces() {
        for (GamePiece gamePiece : gamePieces) {
            System.out.println(gamePiece);
        }
    }

    @Override
    public String toString() {
        return "GameBoard{" +
                "gamePieces=" + gamePieces +
                '}';
    }
}
