package com.company.fileSystem;

public interface FileSystemNode {
    FileSystemNode getRoot();
    String getName();
    String getPathForFile();
    void setRoot(FileSystemNode root);
}
