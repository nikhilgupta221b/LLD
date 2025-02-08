package CreationalPatterns.BuilderPattern.BadCode;

public class House {
    private String type;
    private String color;
    private String size;
    private boolean hasGarage;
    private boolean hasPool;
    private boolean hasGarden;

    public House(String type, String color, String size, boolean hasGarage) {
        this.type = type;
        this.color = color;
        this.size = size;
        this.hasGarage = hasGarage;
        this.hasPool = false;
        this.hasGarden = false;
    }

    @Override
    public String toString() {
        return "House{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", hasGarage=" + hasGarage +
                ", hasPool=" + hasPool +
                ", hasGarden=" + hasGarden +
                '}';
    }
}
