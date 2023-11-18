package b202114069;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.BufferedOutputStream;
import java.io.BufferedInputStream;
import java.io.OutputStream;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

public class Exam4 {

    	public static void main(String[] args) throws IOException{
    		final String filePath = "out3.txt";
    		
    		InputStream in = new GZIPInputStream(new BufferedInputStream(
                    new FileInputStream("out2.txt.gz")));
    		
    		OutputStream out = new BufferedOutputStream(new FileOutputStream(filePath));

    		while (true) {
                int b = in.read();
                if (b < 0) break;
                out.write(b);
            }
            in.close();
            out.close();
    	}
}
