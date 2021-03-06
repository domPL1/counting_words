
package main;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;


public class CountingWords 
{
    public int coutingwords(File filename) throws IOException
    {
        InputStream is = new BufferedInputStream(new FileInputStream(filename));
         try {
        byte[] c = new byte[1024];
        int count = 1;
        int readChars = 0;
        boolean empty = true;
        while ((readChars = is.read(c)) != -1) {
            empty = false;
            for (int i = 0; i < readChars; ++i) {
                if ((c[i] == '\n' || c[i] == '\t' || c[i] == ' ' || c[i] == '.') && !Character.isWhitespace(c[i+1])) {
                    ++count;
                }
            }
        }
        if (empty){
            return 0;
        }
        return count;
    } finally {
        is.close();
    }
    }
}
