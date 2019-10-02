package test.lab3;

import com.company.labs.lab2.WordCounter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WordCounterTest {

    //WordCounter instance = new WordCounter("");

    @Test
    public void whitespacesAtTheBeginnig(){
        Assertions.assertEquals(1, WordCounter.count("    X"));
        Assertions.assertEquals(1, WordCounter.count("   X X"));
        Assertions.assertEquals(2, WordCounter.count("   xxx  ooo xxx   "));
    }

    @Test
    public void empties() {
        Assertions.assertEquals(0, WordCounter.count(""));
        Assertions.assertEquals(0, WordCounter.count("        "));

    }

    @Test void multipleOccurences() {
        Assertions.assertEquals(1, WordCounter.count("   xxx   xxx  xxx xxx xxx"));
    }

    @Test void f(){
        Assertions.assertEquals(0, WordCounter.count("   {}}   "));
        Assertions.assertEquals(0, WordCounter.count(" 88 &5 45 87 :::: ;; ' "));
        Assertions.assertEquals(1, WordCounter.count(" Jeeeeee 88 &5 45 87 :::: ;; ' "));
    }
    //
}
