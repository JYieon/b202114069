package b202114069;

import java.io.IOException;
import java.io.Writer;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Exam5 {

    public static void main(String[] args) throws IOException {
    	
    	Writer writer = new OutputStreamWriter(
                new BufferedOutputStream(new FileOutputStream("out5.txt")),"UTF-8");
    	
        for (int i = 0; i<10; ++i)
        	writer.write("202114069 최지연\n");
        writer.close();

        
    }
}
