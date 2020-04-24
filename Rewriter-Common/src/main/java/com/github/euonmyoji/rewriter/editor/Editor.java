package com.github.euonmyoji.rewriter.editor;

import java.io.IOException;
import java.nio.file.Path;

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

    }

    Editor write(int line, String text);
}
