package b202114069;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.BufferedOutputStream;
import java.io.BufferedInputStream;
import java.io.OutputStream;
import java.io.InputStream;

public class Exam2 {


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
    		InputStream in2 = new BufferedInputStream(new FileInputStream("out1.txt"));
    		OutputStream out2 = new BufferedOutputStream(new FileOutputStream("out2.txt"));
    		copyStream(in2,out2);
    		
    	}
}
