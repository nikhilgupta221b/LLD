package StructuralPatterns.CompositePattern.BadCode;

import java.util.ArrayList;

public class Folder {
    private String folderName;

    // Problem : We are treating files are different objects.
    // We will have to create a separate list for Folders.
    private ArrayList<File> files = new ArrayList<>();

    public Folder(String folderName) {
        this.folderName = folderName;
    }

    public void addFile(File file) {
        files.add(file);
    }

    public void showDetails() {
        System.out.println("Folder: " + folderName);

        for (File file : files) {
            file.showDetails();
        }
    }

}
