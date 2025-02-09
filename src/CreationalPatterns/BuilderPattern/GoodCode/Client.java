package CreationalPatterns.BuilderPattern.GoodCode;

public class Client {
    public static void main(String[] args) {
        House house = new House.HouseBuilder("Concrete", "Wooden", "Tile")
                .setGarden(true)
                .setSwimmingPool(true)
                .setGarage(false)
                .build();

        System.out.println(house);
    }
}
