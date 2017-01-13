package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class CountingWordsTest {
    CountingWords instance = new CountingWords();
   @Test
   public void countingwordstest() throws FileNotFoundException, IOException{
       try (PrintWriter out = new PrintWriter(new File("ala.txt"))) {
           out.print("ala ma kota");       }
       assertEquals("Powiny być 3 słowa",3,instance.coutingwords(new File("ala.txt")),0.0);
   }
   @Test
   public void countingwordstest2() throws FileNotFoundException, IOException{
       try (PrintWriter out = new PrintWriter(new File("ala1.txt"))) {
           out.print("ala.ma");       }
       assertEquals("Powiny być 2 słowa",2,instance.coutingwords(new File("ala1.txt")),0.0);
}
   @Test
   public void countingwordstest3() throws FileNotFoundException, IOException{
       try (PrintWriter out = new PrintWriter(new File("ala2.txt"))) {
                  }
       assertEquals("Powiny być 0 słowa",0,instance.coutingwords(new File("ala2.txt")),0.0);
}
    @Test
   public void countingwordstest4() throws FileNotFoundException, IOException{
       try (PrintWriter out = new PrintWriter(new File("ala3.txt"))) {
           out.print("asad\nasdasd");
                  }
       assertEquals("Powiny być 2 słowa",2,instance.coutingwords(new File("ala3.txt")),0.0);
}
}
