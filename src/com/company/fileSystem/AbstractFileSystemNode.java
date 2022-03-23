package com.company.fileSystem;

public abstract class AbstractFileSystemNode implements FileSystemNode {
    String name;
    FileSystemNode root;

    @Override
    public final FileSystemNode getRoot() {
        return root;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public final String getPathForFile() {
        if(root != null){
            return String.format("%s/%s", root.getPathForFile(), getName());
        }
        return getName();
    }

    @Override
    public void setRoot(FileSystemNode root) {
        this.root = root;
    }
}
