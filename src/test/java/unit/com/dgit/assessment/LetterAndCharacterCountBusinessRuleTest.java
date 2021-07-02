package unit.com.dgit.assessment;

import com.dgit.assessment.DgitResponse;
import com.dgit.assessment.exception.DgitException;
import com.dgit.assessment.rule.LetterAndCharacterCountBusinessRule;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class LetterAndCharacterCountBusinessRuleTest {

    @InjectMocks
    private LetterAndCharacterCountBusinessRule letterAndCharacterCountBusinessRule;


    @Test
    public void testSplitAndCountReturnSuccess() {
        DgitResponse response = new DgitResponse();
        String testStr = "Apppendere Condiguration is Medium";
        assertEquals(response.getWordCount(), 0);
        assertEquals(response.getFiveCharacterCount(), 0);
        letterAndCharacterCountBusinessRule.splitAndCount(testStr, response);
        assertEquals(response.getWordCount(), 1);
        assertEquals(response.getFiveCharacterCount(), 3);
    }

    @Test
    public void testCountWordsEmptyInputThrowException() {
        DgitException exception = assertThrows(DgitException.class, () -> letterAndCharacterCountBusinessRule.countWords(Collections.EMPTY_LIST));
        assertEquals(exception.getMessage(), "Input list cannot be empty");
    }

    @Test
    public void testCountWordsReturnSuccess() {
        DgitException exception = assertThrows(DgitException.class, () -> letterAndCharacterCountBusinessRule.countWords(Collections.EMPTY_LIST));
        assertEquals(exception.getMessage(), "Input list cannot be empty");
    }
}
