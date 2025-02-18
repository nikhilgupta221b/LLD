package StructuralPatterns.CompositePattern.BadCode;

public class File {
    private String fileName;

    public File(String fileName) {
        this.fileName = fileName;
    }

    public void showDetails() {
        System.out.println("File Name: " + fileName);
    }
}
