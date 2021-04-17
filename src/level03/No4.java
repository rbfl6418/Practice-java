package level03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No4{

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
				int times = Integer.parseInt(br.readLine());
			
				for (int i = 0; i < times; i++) {
					
				String[] s = br.readLine().split(" "); 
				int a = Integer.parseInt(s[0]);
				int b = Integer.parseInt(s[1]);
				
				bw.write(a + b+"\n");
				}
				bw.flush();
				bw.close();
		
	}
}
