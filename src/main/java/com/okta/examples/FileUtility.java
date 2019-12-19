package com.okta.examples;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;;
import java.io.IOException;
import java.io.BufferedOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

import static java.nio.charset.StandardCharsets.UTF_8;


public class FileUtility {

    private static void toFile_bad(String contents, File file) throws IOException {

        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(contents);
    }

    public static void toFile_better(String contents, File file) throws IOException {

        try (Writer writer = new OutputStreamWriter(new FileOutputStream(file), UTF_8)) {
            writer.write(contents);
        }
    }
}
