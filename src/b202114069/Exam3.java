package b202114069;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.BufferedOutputStream;
import java.io.BufferedInputStream;
import java.io.OutputStream;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

public class Exam3 {


    	static void copyStream(InputStream in, OutputStream out) throws IOException {
            while (true) {
                int b = in.read();
                if (b < 0) break;
                out.write(b);
            }
            in.close();
            out.close();
        }

    	public static void main(String[] args) throws IOException{
    		InputStream in2 = new BufferedInputStream(new FileInputStream("out2.txt"));
    		OutputStream out2 = new GZIPOutputStream(new BufferedOutputStream(new FileOutputStream("out2.txt.gz")));
    		copyStream(in2,out2);
    		
    	}
}
