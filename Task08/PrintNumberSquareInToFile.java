package Task08;

import java.io.*;
import java.nio.file.*;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrintNumberSquareInToFile {
    public static void main(String[] args) throws IOException {

        int[] arr = {2, 3, 4};
        try (PrintWriter pt = new PrintWriter(Files.newBufferedWriter(Paths.get("test.txt")))) {

            IntStream.of(2, 3, 4).map(n -> n * n).forEach(pt::println);
        }
    }
}
