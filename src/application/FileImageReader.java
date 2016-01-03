package application;

import java.io.File;

public class FileImageReader {

    public FileImageReader(String path) {
        this(new File(path));
    }
    
}
