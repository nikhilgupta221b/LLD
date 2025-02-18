package StructuralPatterns.CompositePattern.BadCode;

public class Client {
    public static void main(String[] args) {
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");

        Folder folder1 = new Folder("folder1");

        folder1.addFile(file1);
        folder1.addFile(file2);

        folder1.showDetails();
    }
}
