package com.dgit.assessment.rule;

import com.dgit.assessment.DgitResponse;
import com.dgit.assessment.exception.DgitException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class LetterAndCharacterCountBusinessRule implements BusinessRule {

    private static final Logger logger = LoggerFactory.getLogger(LetterAndCharacterCountBusinessRule.class);

    public DgitResponse countWords(List<String> strings) {
        DgitResponse response = new DgitResponse();
        if(strings == null || strings.isEmpty()) {
            throw new DgitException("Input list cannot be empty");
        }

        strings.forEach(str -> splitAndCount(str, response));
        return response;
    }

    public void splitAndCount(String string, DgitResponse dgitResponse) {

        AtomicInteger wordCount = new AtomicInteger(dgitResponse.getWordCount());
        AtomicInteger characterCount = new AtomicInteger(dgitResponse.getFiveCharacterCount());
        // This is an additional check to stop processing null values from the list of strings
        if(string == null) {
            return;
        }
        Arrays.stream(string.split(" ")).forEach(str -> {
            if (str.length() > 5) {
                dgitResponse.setFiveCharacterCount(characterCount.incrementAndGet());
            }
            if ((str.startsWith("M") && str.endsWith("m"))) {
                dgitResponse.setWordCount(wordCount.incrementAndGet());
            }
        });
    }
}
