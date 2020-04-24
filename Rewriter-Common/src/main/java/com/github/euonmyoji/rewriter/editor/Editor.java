package com.github.euonmyoji.rewriter.editor;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.attribute.FileTime;

/**
 * @author yinyangshi
 */
public interface Editor {
    /**
     * get the editor from the path
     *
     * @param path the file to edit
     * @return the Editor
     * @throws IOException if get editor occur exceptions.
     */
    static Editor get(Path path) throws IOException {
        return new LocalFileEditor(path);
    }

    /**
     * get the path of file of editor
     * @return the path
     */
    Path getFilePath();

    /**
     * add empty text line
     * @param line the line to add
     * @return editor
     */
    Editor addLine(int line);

    /**
     * remove the given text line
     * @param line the line to remove
     * @return editor
     */
    Editor removeLine(int line);

    /**
     * write the text to the given line
     * @param line the line to write
     * @param text the text to write
     * @return editor
     */
    Editor writeLine(int line, String text);

    /**
     * re read the file
     * @return editor
     * @throws IOException if get editor occur exceptions.
     */
    Editor reread() throws IOException;

    /**
     * get the last modified time
     * @return editor
     * @throws IOException if get editor occur exceptions.
     */
    FileTime getLastModifiedTime() throws IOException;

}
