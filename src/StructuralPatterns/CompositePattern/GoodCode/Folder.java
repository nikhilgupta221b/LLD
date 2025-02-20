package StructuralPatterns.CompositePattern.GoodCode;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemComponent{
    private final String folderName;
    private final List<FileSystemComponent> components = new ArrayList<>();

    public Folder(String folderName) {
        this.folderName = folderName;
    }

    public void addComponent(FileSystemComponent component) {
        components.add(component);
    }

    @Override
    public void showDetails() {
        System.out.println("Folder: " + folderName);
        for (FileSystemComponent component : components) {
            component.showDetails();
        }
    }
}
