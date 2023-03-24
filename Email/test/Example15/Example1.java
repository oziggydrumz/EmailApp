package Example15;

import java.nio.file.Files;
import java.nio.file.Path;

public class Example1 {
    public static void main(String[] args) {
        Path path=Path.of("C:\\Users\\USER\\IdeaProjects\\Email\\test\\Example15\\Example1.java");
        try {
            Path filePath= Files.createFile(path);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }



}
