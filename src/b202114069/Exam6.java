package b202114069;

import java.io.IOException;
import java.io.Reader;
import java.io.FileReader;
import java.io.BufferedReader;

public class Exam6 {

	public static void main(String[] args) throws IOException{
	Reader reader = new BufferedReader(new FileReader("out5.txt"));
	while (true) {
        int ch = reader.read();
        if (ch < 0) break;
        System.out.print((char)ch);
    }
    reader.close();

	}
}
