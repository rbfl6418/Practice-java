package ch9;

import static java.lang.Math.*;
import static java.lang.System.*;

public class MathEx1 {

	public static void main(String[] args) {
		double val = 90.7552;
		val *= 100;
		
		out.printf("round(%3.1f)=%d%n", -1.5, round(-1.5)); //반올림
		out.printf("rint(%3.1f)=%f%n", -1.5, rint(-1.5)); //(-0.5미만을)반올림 -> 0.5라서 버림
		out.printf("rint(%3.1f)=%f%n", -1.4, rint(-1.4)); //-0.4라서 반올림
		out.printf("ceil(%3.1f)=%f%n", -1.5, ceil(-1.5)); //올림
		out.printf("floor(%3.1f)=%f%n", -1.5, floor(-1.5)); //버림
		
	}

}
