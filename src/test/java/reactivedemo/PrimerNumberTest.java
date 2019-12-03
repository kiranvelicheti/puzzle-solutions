package reactivedemo;

import challenges.solutions.PrimerNumber;
import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class PrimerNumberTest {

    @Test
    public void duplicateWords() {

        PrimerNumber subject = new PrimerNumber();
        List<String> strings = subject.duplicateWords(Lists.newArrayList("Goodbye bye bye world world world"));

        assertEquals(strings.get(0), "Goodbye bye world");
    }
}