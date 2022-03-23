package com.company;

import com.company.fileSystem.File;
import com.company.fileSystem.Folder;

public class MakeFileSystem {
    public static void main(String[] args) {
        File agreement = new File("Agreement", "txt");
        File fireFox = new File("FireFox", "exe");
        Folder[] childFolders = new Folder[]{
                new Folder("chrome", new File("Chrome", "exe")),
                new Folder(
                        "opera",
                        new File("Opera", "exe"),
                        agreement
                ),
                new Folder("Safari"),
                new Folder("FireFox", new File("FireFox", "exe"))
        };
        Folder root = new Folder("browsers", childFolders);

        System.out.println(agreement.getPathForFile());
        System.out.println(String.format("Extension file %s: %s",fireFox.getName(),fireFox.getExtension()));
    }
}
