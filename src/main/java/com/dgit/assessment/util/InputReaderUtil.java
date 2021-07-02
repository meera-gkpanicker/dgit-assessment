package com.dgit.assessment.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class InputReaderUtil {

    private static final Logger logger = LoggerFactory.getLogger(InputReaderUtil.class);

    public static List<String> readInputFromFile(String fileName) {
        List<String> inputList = new ArrayList<>();
        ClassLoader classLoader = InputReaderUtil.class.getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream(fileName);
        if (inputStream == null) {
            throw new IllegalArgumentException("file not found! " + fileName);
        }
        try {

            InputStreamReader streamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
            BufferedReader reader = new BufferedReader(streamReader);
            String line;
            while ((line = reader.readLine()) != null) {
                inputList.add(line);
            }

        } catch (IOException e) {
            logger.error("IOException when reading the input file " + e.getMessage());
        }
        return inputList;
    }
}
