package CreationalPatterns.PrototypePattern.GoodCode;

public class GamePiece implements Prototype<GamePiece> {
    private String color;
    private int position;

    GamePiece(String color, int position) {
        this.color = color;
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "GamePiece{" +
                "color='" + color + '\'' +
                ", position=" + position +
                '}';
    }

    @Override
    public GamePiece copy() {
        return new GamePiece(color, position);
    }
}
