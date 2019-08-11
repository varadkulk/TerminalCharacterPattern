import static java.lang.System.*;

public class patternData {
	void space(int x) {
		while (x != 0) {
			x--;
			out.print(" ");
		}
	}

	void dash(int x) {
		while (x != 0) {
			x--;
			out.print("|");
		}
	}

	public void midSpace() {
		for (int i = 0; i < 3; i++)
			out.print(" ");
	}

	void d1s1d1s3d1s1d1() {
		dash(1);
		space(1);
		dash(1);
		space(3);
		dash(1);
		space(1);
		dash(1);
	}

	void d1s1d1s5d1() {
		dash(1);
		space(1);
		dash(1);
		space(5);
		dash(1);
	}

	void d1s1d2s1d2s1d1() {
		dash(1);
		space(1);
		dash(2);
		space(1);
		dash(2);
		space(1);
		dash(1);
	}

	void d1s1d2s5() {
		dash(1);
		space(1);
		dash(2);
		space(5);
	}

	void d1s1d7() {
		dash(1);
		space(1);
		dash(7);
	}

	void d1s2d1s1d1s2d1() {
		dash(1);
		space(2);
		dash(1);
		space(1);
		dash(1);
		space(2);
		dash(1);
	}

	void d1s2d1s4d1() {
		dash(1);
		space(2);
		dash(1);
		space(4);
		dash(1);
	}

	void d1s2d2s4() {
		dash(1);
		space(2);
		dash(2);
		space(4);
	}

	void d1s2d3s2d1() {
		dash(1);
		space(2);
		dash(3);
		space(2);
		dash(1);
	}

	void d1s3d1s3d1() {
		dash(1);
		space(3);
		dash(1);
		space(3);
		dash(1);
	}

	void d1s4d1s2d1() {
		dash(1);
		space(4);
		dash(1);
		space(2);
		dash(1);
	}

	void d1s4d2s2() {
		dash(1);
		space(4);
		dash(2);
		space(2);
	};

	void d1s4d4() {
		dash(1);
		space(4);
		dash(4);
	}

	void d1s5d1s1d1() {
		dash(1);
		space(5);
		dash(1);
		space(1);
		dash(1);
	}

	void d1s6d2() {
		dash(1);
		space(6);
		dash(2);
	}

	void d1s7d1() {
		dash(1);
		space(7);
		dash(1);
	}

	void d1s8() {
		dash(1);
		space(8);
	}

	void d2s2d1s4() {
		dash(2);
		space(2);
		dash(1);
		space(4);
	}

	void d2s5d2() {
		dash(2);
		space(5);
		dash(2);
	}

	void d2s6d1() {
		dash(2);
		space(6);
		dash(1);
	}

	void d2s7() {
		dash(2);
		space(7);
	}

	void d3s3d3() {
		dash(3);
		space(3);
		dash(3);
	}

	void d3s6() {
		dash(3);
		space(6);
	}

	void d5s4() {
		dash(5);
		space(4);
	}

	void d8s1() {
		dash(8);
		space(1);
	}

	void d9() {
		dash(9);
	}

	void s1d1s4d1s2() {
		space(1);
		dash(1);
		space(4);
		dash(1);
		space(2);
	}

	void s1d1s5d1s1() {
		space(1);
		dash(1);
		space(5);
		dash(1);
		space(1);
	}

	void s1d1s7() {
		space(1);
		dash(1);
		space(7);
	}

	void s1d2s3d2s1() {
		space(1);
		dash(2);
		space(3);
		dash(2);
		space(1);
	}

	void s1d2s4d2() {
		space(1);
		dash(2);
		space(4);
		dash(2);
	}

	void s1d7s1() {
		space(1);
		dash(7);
		space(1);
	}

	void s2d1s3d1s2() {
		space(2);
		dash(1);
		space(3);
		dash(1);
		space(2);
	}

	void s1d8() {
		space(1);
		dash(8);
	}

	void s2d1s6() {
		space(2);
		dash(1);
		space(6);
	}

	void s2d3s4() {
		space(2);
		dash(3);
		space(4);
	}

	void s2d6s1() {
		space(2);
		dash(6);
		space(1);
	}

	void s3d1s1d1s3() {
		space(3);
		dash(1);
		space(1);
		dash(1);
		space(3);
	}

	void s3d1s2d1s2() {
		space(3);
		dash(1);
		space(2);
		dash(1);
		space(2);
	}

	void s3d1s5() {
		space(3);
		dash(1);
		space(5);
	}

	void s3d3s3() {
		space(3);
		dash(3);
		space(3);
	}

	void s4d3s2() {
		space(4);
		dash(3);
		space(2);
	}

	void s4d1s1d1s2() {
		space(4);
		dash(1);
		space(1);
		dash(1);
		space(2);
	}

	void s4d1s4() {
		space(4);
		dash(1);
		space(4);
	}

	void s4d5() {
		space(4);
		dash(5);
	}

	void s5d1s3() {
		space(5);
		dash(1);
		space(3);
	}

	void s5d2s2() {
		space(5);
		dash(2);
		space(2);
	}

	void s6d1s2() {
		space(6);
		dash(1);
		space(2);
	}

	void s6d3() {
		space(6);
		dash(3);
	}

	void s7d1s1() {
		space(7);
		dash(1);
		space(1);
	}

	void s8d1() {
		space(8);
		dash(1);
	}

	void s9() {
		space(9);
	}
}
