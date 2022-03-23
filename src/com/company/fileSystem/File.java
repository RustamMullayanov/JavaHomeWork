package com.company.fileSystem;

public class File extends AbstractFileSystemNode {
    private final String extension;

    public File(String name, String extension){
        this.name = name;
        this.extension = extension;
    }

    @Override
    public String getName() {
        return String.format("%s.%s", name, extension);
    }

    public String getExtension() {
        return extension;
    }
}
