package application;

import java.io.File;
import java.io.FilenameFilter;

public class FileImageReader {

    private final File[] files;
    private static final String[] ImageExtensions={".jpg",".png",".gif"};
    
    public FileImageReader(String path) {
        this(new File(path));
    }
    
    public FileImageReader(File folder){
        this.files = folder.listFiles(withImageExtension());
    }

    private FilenameFilter withImageExtension() {
        return new FilenameFilter(){
            @Override
            public boolean accept(File dir, String name){
                for (String extension : ImageExtensions) {
                    if(name.endsWith(extension))return true;
                }
                return false;
            }
        };
    }
   
    
}
