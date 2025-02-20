package StructuralPatterns.CompositePattern.GoodCode;

public class File implements FileSystemComponent {
    private final String fileName;

    public File(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void showDetails() {
        System.out.println("File Name: " + fileName);
    }
}
