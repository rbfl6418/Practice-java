package ch9;

import static java.lang.Math.*;
import static java.lang.System.*;

public class MathEx1 {

	public static void main(String[] args) {
		double val = 90.7552;
		val *= 100;
		
		out.printf("round(%3.1f)=%d%n", -1.5, round(-1.5)); //�ݿø�
		out.printf("rint(%3.1f)=%f%n", -1.5, rint(-1.5)); //(-0.5�̸���)�ݿø� -> 0.5�� ����
		out.printf("rint(%3.1f)=%f%n", -1.4, rint(-1.4)); //-0.4�� �ݿø�
		out.printf("ceil(%3.1f)=%f%n", -1.5, ceil(-1.5)); //�ø�
		out.printf("floor(%3.1f)=%f%n", -1.5, floor(-1.5)); //����
		
	}

}
