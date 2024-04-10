package Demo03Filter;

import java.io.File;
import java.io.FileFilter;

public class FileFilterImpl implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        return pathname.getName().endsWith(".md")||pathname.isDirectory();
    }
}
