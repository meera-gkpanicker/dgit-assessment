package com.dgit.assessment;

import com.dgit.assessment.rule.BusinessRule;
import com.dgit.assessment.rule.LetterAndCharacterCountBusinessRule;
import com.dgit.assessment.util.InputReaderUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class CountWords {

    private static final Logger logger = LoggerFactory.getLogger(CountWords.class);
    public static void main(String... args) {

        List<String> stringList = InputReaderUtil.readInputFromFile("input.txt");
        BusinessRule businessRule = new LetterAndCharacterCountBusinessRule();
        DgitResponse response = businessRule.countWords(stringList);

        logger.info("Wordcount: " + response.getWordCount());
        logger.info("Five Character Count: " + response.getFiveCharacterCount());
    }


}
