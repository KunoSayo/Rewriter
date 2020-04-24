package com.github.euonmyoji.rewriter.editor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileTime;

/**
 * @author yinyangshi
 */
public class LocalFileEditor implements Editor {
    private final Path path;

    public LocalFileEditor(Path path) {
        this.path = path;
    }

    @Override
    public Path getFilePath() {
        return path;
    }

    @Override
    public Editor addLine(int line) {
        return null;
    }

    @Override
    public Editor removeLine(int line) {
        return null;
    }

    @Override
    public Editor writeLine(int line, String text) {
        return null;
    }

    @Override
    public Editor reread() {
        throw new IllegalArgumentException("Not done yet");
    }

    @Override
    public FileTime getLastModifiedTime() throws IOException {
        return Files.getLastModifiedTime(path);
    }
}
