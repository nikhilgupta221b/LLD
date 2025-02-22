package StructuralPatterns.FacadePattern.GoodCode;

public class Client {
    public static void main(String[] args) {
        Gateway gateway = new Gateway();
        System.out.println(gateway.getAllDetails("123", "456"));
    }
}
