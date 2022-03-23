package com.company.fileSystem;

import java.util.ArrayList;

public class Folder extends AbstractFileSystemNode{
    private final ArrayList<FileSystemNode> childElements;

    public Folder(String name, FileSystemNode ... childElements){
        this.name = name;
        for(FileSystemNode childElement : childElements){
            childElement.setRoot(this);
        }
        this.childElements = new ArrayList<>(java.util.List.of(childElements));
    }

    public ArrayList<FileSystemNode> getChildElements(){
        return childElements;
    }
}
