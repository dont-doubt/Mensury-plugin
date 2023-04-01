package mensury.edits.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

public class FileUtils {
    public static String getResourceFileAsString(String path) {
//        try (InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream(path)) {
        try (InputStream is = FileUtils.class.getResourceAsStream(path)) {
            if (is == null) return null;
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(is))) {
                return reader.lines().collect(Collectors.joining("\n"));
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
