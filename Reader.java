import java.io.IOException;
import java.nio.file.*;

public class Reader {
    public static String readFile(String file) throws IOException {
        return new String(Files.readAllBytes(Paths.get(file)));
    }
}
