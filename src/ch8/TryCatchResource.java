package ch8;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class TryCatchResource {
//파일 쓰기
	public static void main(String[] args) {
		try(
			FileWriter fr = new FileWriter("testFile.txt");
			BufferedWriter bw = new BufferedWriter(fr)
		){
			bw.write("hello");
			bw.newLine(); //??
			bw.write("write something");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
