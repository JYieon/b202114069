package b202114069;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.BufferedOutputStream;
import java.io.OutputStream;

public class Exam1 {

    public static void main(String[] args) throws IOException {
        final String filePath = "out1.txt";

        OutputStream out = new BufferedOutputStream(new FileOutputStream(filePath));
        byte[] a = new byte[] { '2', '0', '2', '1', '1', '4', '0', '6', '9', '\n' };
        for (int i = 0; i < 10; ++i)
            out.write(a);
        out.close();

    }
}
