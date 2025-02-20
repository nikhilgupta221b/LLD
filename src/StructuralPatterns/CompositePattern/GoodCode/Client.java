package StructuralPatterns.CompositePattern.GoodCode;

public class Client {
    public static void main(String[] args) {
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");
        File file3 = new File("file3.txt");
        Folder folder1 = new Folder("folder1");
        Folder folder2 = new Folder("folder2");

        folder2.addComponent(file3);

        folder1.addComponent(file1);
        folder1.addComponent(file2);
        folder1.addComponent(folder2);

        folder1.showDetails();
    }
}
