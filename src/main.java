import javax.imageio.plugins.tiff.GeoTIFFTagSet;
import javax.swing.*;
import java.io.FileNotFoundException;

/**
 * Created by Axel Jeansson
 * Date: 2020-10-09
 * Time: 15:32
 * Project: Inlämning2
 * Copyright: MIT
 */
public class main {
    public static void main(String[] args) throws FileNotFoundException {
        readFile r = new readFile();
        r.openFile();
        r.readFile();
        r.userInput();
        r.closeFile();

    }
}
