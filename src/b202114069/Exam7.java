package b202114069;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.zip.GZIPOutputStream;

public class Exam7 {

    public static void main(String[] args) throws IOException {
    	
        Writer writer = new OutputStreamWriter(new GZIPOutputStream(
                new BufferedOutputStream(new FileOutputStream("out6.txt.gz"))),"euc-kr");

       
        for (int i = 0; i<10; ++i)
        	writer.write("202114069 최지연\n");
        writer.close();

        
    }
}
