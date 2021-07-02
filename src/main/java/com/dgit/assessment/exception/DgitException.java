package com.dgit.assessment.exception;

import com.dgit.assessment.DgitResponse;
import com.dgit.assessment.rule.LetterAndCharacterCountBusinessRule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DgitException extends RuntimeException{

    private static final Logger logger = LoggerFactory.getLogger(DgitException.class);

    public DgitException(String message) {
        super(message);
        logger.error("Exception thrown when counting words and reason is : " +message);
    }
}
