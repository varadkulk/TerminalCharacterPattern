import static java.lang.System.*;

class lines {
	patternData pD = new patternData();


	void one(String s, int l) {
		int i;
		char c;
		for (i = 0; i < l; i++) {
			c = s.charAt(i);
			switch (c) {
			case 'a':
				pD.s9();
				break;
			case 'b':
				pD.d1s8();
				break;
			case 'c':
				pD.s9();
				break;
			case 'd':
				pD.s8d1();
				break;
			case 'e':
				pD.s9();
				break;
			case 'f':
				pD.s4d5();
				break;
			case 'g':
				pD.s9();
				break;
			case 'h':
				pD.d1s8();
				break;
			case 'i':
				pD.s9();
				break;
			case 'j':
				pD.s9();
				break;
			case 'k':
				pD.d1s8();
				break;
			case 'l':
				pD.s4d1s4();
				break;
			case 'm':
				pD.s9();
				break;
			case 'n':
				pD.s9();
				break;
			case 'o':
				pD.s9();
				break;
			case 'p':
				pD.s9();
				break;
			case 'q':
				pD.s9();
				break;
			case 'r':
				pD.s9();
				break;
			case 's':
				pD.s9();
				break;
			case 't':
				pD.s4d1s4();
				break;
			case 'u':
				pD.s9();
				break;
			case 'v':
				pD.s9();
				break;
			case 'w':
				pD.s9();
				break;
			case 'x':
				pD.s9();
				break;
			case 'y':
				pD.s9();
				break;
			case 'z':
				pD.s9();
				break;
			case 'A':
				pD.s4d1s4();
				break;
			case 'B':
				pD.d9();
				break;
			case 'C':
				pD.d9();
				break;
			case 'D':
				pD.s1d7s1();
				break;
			case 'E':
				pD.d9();
				break;
			case 'F':
				pD.d9();
				break;
			case 'G':
				pD.d9();
				break;
			case 'H':
				pD.d1s7d1();
				break;
			case 'I':
				pD.d9();
				break;
			case 'J':
				pD.d9();
				break;
			case 'K':
				pD.d1s6d2();
				break;
			case 'L':
				pD.d1s8();
				break;
			case 'M':
				pD.d2s5d2();
				break;
			case 'N':
				pD.d1s7d1();
				break;
			case 'O':
				pD.d9();
				break;
			case 'P':
				pD.d9();
				break;
			case 'Q':
				pD.d9();
				break;
			case 'R':
				pD.d9();
				break;
			case 'S':
				pD.d9();
				break;
			case 'T':
				pD.d9();
				break;
			case 'U':
				pD.d1s7d1();
				break;
			case 'V':
				pD.d1s7d1();
				break;
			case 'W':
				pD.d1s7d1();
				break;
			case 'X':
				pD.d1s7d1();
				break;
			case 'Y':
				pD.d1s7d1();
				break;
			case 'Z':
				pD.d9();
				break;
			case '0':
				pD.s1d7s1();
				break;
			case '1':
				pD.s4d1s4();
				break;
			case '2':
				pD.s2d6s1();
				break;
			case '3':
				pD.d9();
				break;
			case '4':
				pD.s6d1s2();
				break;
			case '5':
				pD.d9();
				break;
			case '6':
				pD.s1d8();
				break;
			case '7':
				pD.d9();
				break;
			case '8':
				pD.s1d7s1();
				break;
			case '9':
				pD.s1d8();
				break;
			case '-':
				pD.s9();
				break;
			case '/':
				pD.s8d1();
				break;
			case '!':
				pD.s4d1s4();
				break;
			default:
				pD.s9();
				break;
			}
			pD.midSpace();
		}
		out.println();
	}

	void two(String s, int l) {
		int i;
		char c;
		for (i = 0; i < l; i++) {
			c = s.charAt(i);
			switch (c) {
			case 'a':
				pD.s9();
				break;
			case 'b':
				pD.d1s8();
				break;
			case 'c':
				pD.s9();
				break;
			case 'd':
				pD.s8d1();
				break;
			case 'e':
				pD.s9();
				break;
			case 'f':
				pD.s4d1s4();
				break;
			case 'g':
				pD.s9();
				break;
			case 'h':
				pD.d1s8();
				break;
			case 'i':
				pD.s4d1s4();
				break;
			case 'j':
				pD.s4d1s4();
				break;
			case 'k':
				pD.d1s8();
				break;
			case 'l':
				pD.s4d1s4();
				break;
			case 'm':
				pD.s9();
				break;
			case 'n':
				pD.s9();
				break;
			case 'o':
				pD.s9();
				break;
			case 'p':
				pD.s9();
				break;
			case 'q':
				pD.s9();
				break;
			case 'r':
				pD.s9();
				break;
			case 's':
				pD.s9();
				break;
			case 't':
				pD.s4d1s4();
				break;
			case 'u':
				pD.s9();
				break;
			case 'v':
				pD.s9();
				break;
			case 'w':
				pD.s9();
				break;
			case 'x':
				pD.s9();
				break;
			case 'y':
				pD.s9();
				break;
			case 'z':
				pD.s9();
				break;
			case 'A':
				pD.s3d1s1d1s3();
				break;
			case 'B':
				pD.d1s7d1();
				break;
			case 'C':
				pD.d1s8();
				break;
			case 'D':
				pD.d1s7d1();
				break;
			case 'E':
				pD.d1s8();
				break;
			case 'F':
				pD.d1s8();
				break;
			case 'G':
				pD.d1s8();
				break;
			case 'H':
				pD.d1s7d1();
				break;
			case 'I':
				pD.s4d1s4();
				break;
			case 'J':
				pD.s4d1s4();
				break;
			case 'K':
				pD.d1s4d2s2();
				break;
			case 'L':
				pD.d1s8();
				break;
			case 'M':
				pD.d3s3d3();
				break;
			case 'N':
				pD.d2s6d1();
				break;
			case 'O':
				pD.d1s7d1();
				break;
			case 'P':
				pD.d1s7d1();
				break;
			case 'Q':
				pD.d1s7d1();
				break;
			case 'R':
				pD.d1s7d1();
				break;
			case 'S':
				pD.d1s8();
				break;
			case 'T':
				pD.s4d1s4();
				break;
			case 'U':
				pD.d1s7d1();
				break;
			case 'V':
				pD.d1s7d1();
				break;
			case 'W':
				pD.d1s7d1();
				break;
			case 'X':
				pD.s1d1s5d1s1();
				break;
			case 'Y':
				pD.s1d1s5d1s1();
				break;
			case 'Z':
				pD.s7d1s1();
				break;
			case '0':
				pD.d1s7d1();
				break;
			case '1':
				pD.s2d3s4();
				break;
			case '2':
				pD.s1d2s4d2();
				break;
			case '3':
				pD.s8d1();
				break;
			case '4':
				pD.s5d2s2();
				break;
			case '5':
				pD.d1s8();
				break;
			case '6':
				pD.d1s8();
				break;
			case '7':
				pD.s7d1s1();
				break;
			case '8':
				pD.d1s7d1();
				break;
			case '9':
				pD.d1s7d1();
				break;
			case '-':
				pD.s9();
				break;
			case '/':
				pD.s7d1s1();
				break;
			case '!':
				pD.s4d1s4();
				break;
			default:
				pD.s9();
				break;
			}
			pD.midSpace();
		}
		out.println();
	}

	void three(String s, int l) {
		int i;
		char c;
		for (i = 0; i < l; i++) {
			c = s.charAt(i);
			switch (c) {
			case 'a':
				pD.s9();
				break;
			case 'b':
				pD.d1s8();
				break;
			case 'c':
				pD.s9();
				break;
			case 'd':
				pD.s8d1();
				break;
			case 'e':
				pD.s9();
				break;
			case 'f':
				pD.s1d7s1();
				break;
			case 'g':
				pD.s9();
				break;
			case 'h':
				pD.d1s8();
				break;
			case 'i':
				pD.s9();
				break;
			case 'j':
				pD.s9();
				break;
			case 'k':
				pD.d1s8();
				break;
			case 'l':
				pD.s4d1s4();
				break;
			case 'm':
				pD.s9();
				break;
			case 'n':
				pD.s9();
				break;
			case 'o':
				pD.s9();
				break;
			case 'p':
				pD.s9();
				break;
			case 'q':
				pD.s9();
				break;
			case 'r':
				pD.s9();
				break;
			case 's':
				pD.d9();
				break;
			case 't':
				pD.s1d7s1();
				break;
			case 'u':
				pD.s9();
				break;
			case 'v':
				pD.s9();
				break;
			case 'w':
				pD.s9();
				break;
			case 'x':
				pD.s9();
				break;
			case 'y':
				pD.s9();
				break;
			case 'z':
				pD.s9();
				break;
			case 'A':
				pD.s2d1s3d1s2();
				break;
			case 'B':
				pD.d1s7d1();
				break;
			case 'C':
				pD.d1s8();
				break;
			case 'D':
				pD.d1s7d1();
				break;
			case 'E':
				pD.d1s8();
				break;
			case 'F':
				pD.d1s8();
				break;
			case 'G':
				pD.d1s8();
				break;
			case 'H':
				pD.d1s7d1();
				break;
			case 'I':
				pD.s4d1s4();
				break;
			case 'J':
				pD.s4d1s4();
				break;
			case 'K':
				pD.d1s2d2s4();
				break;
			case 'L':
				pD.d1s8();
				break;
			case 'M':
				pD.d1s1d2s1d2s1d1();
				break;
			case 'N':
				pD.d1s1d1s5d1();
				break;
			case 'O':
				pD.d1s7d1();
				break;
			case 'P':
				pD.d1s7d1();
				break;
			case 'Q':
				pD.d1s7d1();
				break;
			case 'R':
				pD.d1s7d1();
				break;
			case 'S':
				pD.d1s8();
				break;
			case 'T':
				pD.s4d1s4();
				break;
			case 'U':
				pD.d1s7d1();
				break;
			case 'V':
				pD.d1s7d1();
				break;
			case 'W':
				pD.d1s7d1();
				break;
			case 'X':
				pD.s2d1s3d1s2();
				break;
			case 'Y':
				pD.s2d1s3d1s2();
				break;
			case 'Z':
				pD.s6d1s2();
				break;
			case '0':
				pD.d1s7d1();
				break;
			case '1':
				pD.d2s2d1s4();
				break;
			case '2':
				pD.d2s6d1();
				break;
			case '3':
				pD.s8d1();
				break;
			case '4':
				pD.s4d1s1d1s2();
				break;
			case '5':
				pD.d1s8();
				break;
			case '6':
				pD.d1s8();
				break;
			case '7':
				pD.s6d1s2();
				break;
			case '8':
				pD.d1s7d1();
				break;
			case '9':
				pD.d1s7d1();
				break;
			case '-':
				pD.s9();
				break;
			case '/':
				pD.s6d1s2();
				break;
			case '!':
				pD.s4d1s4();
				break;
			default:
				pD.s9();
				break;
			}
			pD.midSpace();
		}
		out.println();
	}

	void four(String s, int l) {
		int i;
		char c;
		for (i = 0; i < l; i++) {
			c = s.charAt(i);
			switch (c) {
			case 'a':
				pD.d9();
				break;
			case 'b':
				pD.d9();
				break;
			case 'c':
				pD.d9();
				break;
			case 'd':
				pD.d9();
				break;

			case 'e':
				pD.d9();
				break;
			case 'f':
				pD.s4d1s4();
				break;
			case 'g':
				pD.d9();
				break;
			case 'h':
				pD.d9();
				break;
			case 'i':
				pD.s4d1s4();
				break;
			case 'j':
				pD.s4d1s4();
				break;
			case 'k':
				pD.d1s6d2();
				break;
			case 'l':
				pD.s4d1s4();
				break;
			case 'm':
				pD.d2s5d2();
				break;
			case 'n':
				pD.d8s1 ();
				break;
			case 'o':
				pD.d9();
				break;
			case 'p':
				pD.d9();
				break;
			case 'q':
				pD.d9();
				break;
			case 'r':
				pD.d1s1d7();
				break;
			case 's':
				pD.d1s8();
				break;
			case 't':
				pD.s4d1s4();
				break;
			case 'u':
				pD.d1s7d1();
				break;
			case 'v':
				pD.d1s7d1();
				break;
			case 'w':
				pD.d1s7d1();
				break;
			case 'x':
				pD.d2s5d2();
				break;
			case 'y':
				pD.d1s7d1();
				break;
			case 'z':
				pD.d9();
				break;
			case 'A':
				pD.s1d1s5d1s1();
				break;
			case 'B':
				pD.d1s7d1();
				break;
			case 'C':
				pD.d1s8();
				break;
			case 'D':
				pD.d1s7d1();
				break;
			case 'E':
				pD.d1s8();
				break;
			case 'F':
				pD.d9();
				break;
			case 'G':
				pD.d1s8();
				break;
			case 'H':
				pD.d1s7d1();
				break;
			case 'I':
				pD.s4d1s4();
				break;
			case 'J':
				pD.s4d1s4();
				break;
			case 'K':
				pD.d1s1d2s5();
				break;
			case 'L':
				pD.d1s8();
				break;
			case 'M':
				pD.d1s2d3s2d1();
				break;
			case 'N':
				pD.d1s2d1s4d1();
				break;
			case 'O':
				pD.d1s7d1();
				break;
			case 'P':
				pD.d9();
				break;
			case 'Q':
				pD.d1s7d1();
				break;
			case 'R':
				pD.d9();
				break;
			case 'S':
				pD.d1s8();
				break;
			case 'T':
				pD.s4d1s4();
				break;
			case 'U':
				pD.d1s7d1();
				break;
			case 'V':
				pD.d1s7d1();
				break;
			case 'W':
				pD.d1s7d1();
				break;
			case 'X':
				pD.s3d1s1d1s3();
				break;
			case 'Y':
				pD.s3d1s1d1s3();
				break;
			case 'Z':
				pD.s5d1s3();
				break;
			case '0':
				pD.d1s7d1();
				break;
			case '1':
				pD.s4d1s4();
				break;
			case '2':
				pD.s8d1();
				break;
			case '3':
				pD.s8d1();
				break;
			case '4':
				pD.s3d1s2d1s2();
				break;
			case '5':
				pD.d8s1();
				break;
			case '6':
				pD.d8s1();
				break;
			case '7':
				pD.s5d1s3();
				break;
			case '8':
				pD.d1s7d1();
				break;
			case '9':
				pD.s1d8();
				break;
			case '-':
				pD.s9();
				break;
			case '/':
				pD.s5d1s3();
				break;
			case '!':
				pD.s4d1s4();
				break;
			default:
				pD.s9();
				break;
			}
			pD.midSpace();
		}
		out.println();
	}

	void five(String s, int l) {
		int i;
		char c;
		for (i = 0; i < l; i++) {
			c = s.charAt(i);
			switch (c) {
			case 'a':
				pD.s8d1();
				break;
			case 'b':
				pD.d1s7d1();
				break;
			case 'c':
				pD.d1s8();
				break;
			case 'd':
				pD.d1s7d1();
				break;
			case 'e':
				pD.d1s7d1();
				break;
			case 'f':
				pD.s4d1s4();
				break;
			case 'g':
				pD.d1s7d1();
				break;
			case 'h':
				pD.d1s7d1();
				break;
			case 'i':
				pD.s4d1s4();
				break;
			case 'j':
				pD.s4d1s4();
				break;
			case 'k':
				pD.d1s4d2s2();
				break;
			case 'l':
				pD.s4d1s4();
				break;
			case 'm':
				pD.d1s1d1s3d1s1d1();
				break;
			case 'n':
				pD.d1s7d1();
				break;
			case 'o':
				pD.d1s7d1();
				break;
			case 'p':
				pD.d1s7d1();
				break;
			case 'q':
				pD.d1s7d1();
				break;
			case 'r':
				pD.d2s7();
				break;
			case 's':
				pD.d1s8();
				break;
			case 't':
				pD.s4d1s4();
				break;
			case 'u':
				pD.d1s7d1();
				break;
			case 'v':
				pD.d1s7d1();
				break;
			case 'w':
				pD.d1s7d1();
				break;
			case 'x':
				pD.s1d2s3d2s1();
				break;
			case 'y':
				pD.d1s7d1();
				break;
			case 'z':
				pD.s6d3();
				break;
			case 'A':
				pD.d9();
				break;
			case 'B':
				pD.d9();
				break;
			case 'C':
				pD.d1s8();
				break;
			case 'D':
				pD.d1s7d1();
				break;
			case 'E':
				pD.d9();
				break;
			case 'F':
				pD.d1s8();
				break;
			case 'G':
				pD.d1s8();
				break;
			case 'H':
				pD.d9();
				break;
			case 'I':
				pD.s4d1s4();
				break;
			case 'J':
				pD.s4d1s4();
				break;
			case 'K':
				pD.d2s7();
				break;
			case 'L':
				pD.d1s8();
				break;
			case 'M':
				pD.d1s3d1s3d1();
				break;
			case 'N':
				pD.d1s3d1s3d1();
				break;
			case 'O':
				pD.d1s7d1();
				break;
			case 'P':
				pD.d1s8();
				break;
			case 'Q':
				pD.d1s3d1s3d1();
				break;
			case 'R':
				pD.d2s7();
				break;
			case 'S':
				pD.d9();
				break;
			case 'T':
				pD.s4d1s4();
				break;
			case 'U':
				pD.d1s7d1();
				break;
			case 'V':
				pD.d1s7d1();
				break;
			case 'W':
				pD.d1s3d1s3d1();
				break;
			case 'X':
				pD.s4d1s4();
				break;
			case 'Y':
				pD.s4d1s4();
				break;
			case 'Z':
				pD.s4d1s4();
				break;
			case '0':
				pD.d1s7d1();
				break;
			case '1':
				pD.s4d1s4();
				break;
			case '2':
				pD.s6d3();
				break;
			case '3':
				pD.d9();
				break;
			case '4':
				pD.s2d1s3d1s2();
				break;
			case '5':
				pD.s8d1();
				break;
			case '6':
				pD.d1s7d1();
				break;
			case '7':
				pD.s4d1s4();
				break;
			case '8':
				pD.s1d7s1();
				break;
			case '9':
				pD.s8d1();
				break;
			case '-':
				pD.d9();
				break;
			case '/':
				pD.s4d1s4();
				break;
			case '!':
				pD.s4d1s4();
				break;
			default:
				pD.s9();
				break;
			}
			pD.midSpace();
		}
		out.println();
	}

	void six(String s, int l) {
		int i;
		char c;
		for (i = 0; i < l; i++) {
			c = s.charAt(i);
			switch (c) {
			case 'a':
				pD.d9();
				break;
			case 'b':
				pD.d1s7d1();
				break;
			case 'c':
				pD.d1s8();
				break;
			case 'd':
				pD.d1s7d1();
				break;
			case 'e':
				pD.d9();
				break;
			case 'f':
				pD.s4d1s4();
				break;
			case 'g':
				pD.d1s7d1();
				break;
			case 'h':
				pD.d1s7d1();
				break;
			case 'i':
				pD.s4d1s4();
				break;
			case 'j':
				pD.s4d1s4();
				break;
			case 'k':
				pD.d1s2d2s4();
				break;
			case 'l':
				pD.s4d1s4();
				break;
			case 'm':
				pD.d1s2d1s1d1s2d1();
				break;
			case 'n':
				pD.d1s7d1();
				break;
			case 'o':
				pD.d1s7d1();
				break;
			case 'p':
				pD.d1s7d1();
				break;
			case 'q':
				pD.d1s7d1();
				break;
			case 'r':
				pD.d1s8();
				break;
			case 's':
				pD.d9();
				break;
			case 't':
				pD.s4d1s4();
				break;
			case 'u':
				pD.d1s7d1();
				break;
			case 'v':
				pD.s1d1s5d1s1();
				break;
			case 'w':
				pD.d1s3d1s3d1();
				break;
			case 'x':
				pD.s3d3s3();
				break;
			case 'y':
				pD.s1d1s5d1s1();
				break;
			case 'z':
				pD.s4d3s2();
				break;
			case 'A':
				pD.d1s7d1();
				break;
			case 'B':
				pD.d1s7d1();
				break;
			case 'C':
				pD.d1s8();
				break;
			case 'D':
				pD.d1s7d1();
				break;
			case 'E':
				pD.d1s8();
				break;
			case 'F':
				pD.d1s8();
				break;
			case 'G':
				pD.d1s4d4();
				break;
			case 'H':
				pD.d1s7d1();
				break;
			case 'I':
				pD.s4d1s4();
				break;
			case 'J':
				pD.s4d1s4();
				break;
			case 'K':
				pD.d1s1d2s5();
				break;
			case 'L':
				pD.d1s8();
				break;
			case 'M':
				pD.d1s7d1();
				break;
			case 'N':
				pD.d1s4d1s2d1();
				break;
			case 'O':
				pD.d1s7d1();
				break;
			case 'P':
				pD.d1s8();
				break;
			case 'Q':
				pD.d9();
				break;
			case 'R':
				pD.d1s1d2s5();
				break;
			case 'S':
				pD.s8d1();
				break;
			case 'T':
				pD.s4d1s4();
				break;
			case 'U':
				pD.d1s7d1();
				break;
			case 'V':
				pD.s1d1s5d1s1();
				break;
			case 'W':
				pD.d1s2d3s2d1();
				break;
			case 'X':
				pD.s3d1s1d1s3();
				break;
			case 'Y':
				pD.s4d1s4();
				break;
			case 'Z':
				pD.s3d1s5();
				break;
			case '0':
				pD.d1s7d1();
				break;
			case '1':
				pD.s4d1s4();
				break;
			case '2':
				pD.s4d3s2();
				break;
			case '3':
				pD.s8d1();
				break;
			case '4':
				pD.s1d1s4d1s2();
				break;
			case '5':
				pD.s8d1();
				break;
			case '6':
				pD.d1s7d1();
				break;
			case '7':
				pD.s3d1s5();
				break;
			case '8':
				pD.d1s7d1();
				break;
			case '9':
				pD.s8d1();
				break;
			case '-':
				pD.s9();
				break;
			case '/':
				pD.s3d1s5();
				break;
			case '!':
				pD.s4d1s4();
				break;
			default:
				pD.s9();
				break;
			}
			pD.midSpace();
		}
		out.println();
	}

	void seven(String s, int l) {
		int i;
		char c;
		for (i = 0; i < l; i++) {
			c = s.charAt(i);
			switch (c) {
			case 'a':
				pD.d1s7d1();
				break;
			case 'b':
				pD.d1s7d1();
				break;
			case 'c':
				pD.d1s8();
				break;
			case 'd':
				pD.d1s7d1();
				break;
			case 'e':
				pD.d1s8();
				break;
			case 'f':
				pD.s4d1s4();
				break;
			case 'g':
				pD.d1s7d1();
				break;
			case 'h':
				pD.d1s7d1();
				break;
			case 'i':
				pD.s4d1s4();
				break;
			case 'j':
				pD.s4d1s4();
				break;
			case 'k':
				pD.d5s4();
				break;
			case 'l':
				pD.s4d1s4();
				break;
			case 'm':
				pD.d1s3d1s3d1();
				break;
			case 'n':
				pD.d1s7d1();
				break;
			case 'o':
				pD.d1s7d1();
				break;
			case 'p':
				pD.d1s7d1();
				break;
			case 'q':
				pD.d1s7d1();
				break;
			case 'r':
				pD.d1s8();
				break;
			case 's':
				pD.s8d1();
				break;
			case 't':
				pD.s4d1s4();
				break;
			case 'u':
				pD.d1s7d1();
				break;
			case 'v':
				pD.s2d1s3d1s2();
				break;
			case 'w':
				pD.d1s2d1s1d1s2d1();
				break;
			case 'x':
				pD.s3d3s3();
				break;
			case 'y':
				pD.s2d1s3d1s2();
				break;
			case 'z':
				pD.s2d3s4();
				break;
			case 'A':
				pD.d1s7d1();
				break;
			case 'B':
				pD.d1s7d1();
				break;
			case 'C':
				pD.d1s8();
				break;
			case 'D':
				pD.d1s7d1();
				break;
			case 'E':
				pD.d1s8();
				break;
			case 'F':
				pD.d1s8();
				break;
			case 'G':
				pD.d1s7d1();
				break;
			case 'H':
				pD.d1s7d1();
				break;
			case 'I':
				pD.s4d1s4();
				break;
			case 'J':
				pD.s4d1s4();
				break;
			case 'K':
				pD.d1s2d2s4();
				break;
			case 'L':
				pD.d1s8();
				break;
			case 'M':
				pD.d1s7d1();
				break;
			case 'N':
				pD.d1s5d1s1d1();
				break;
			case 'O':
				pD.d1s7d1();
				break;
			case 'P':
				pD.d1s8();
				break;
			case 'Q':
				pD.s6d1s2();
				break;
			case 'R':
				pD.d1s2d2s4();
				break;
			case 'S':
				pD.s8d1();
				break;
			case 'T':
				pD.s4d1s4();
				break;
			case 'U':
				pD.d1s7d1();
				break;
			case 'V':
				pD.s2d1s3d1s2();
				break;
			case 'W':
				pD.d1s1d2s1d2s1d1();
				break;
			case 'X':
				pD.s2d1s3d1s2();
				break;
			case 'Y':
				pD.s4d1s4();
				break;
			case 'Z':
				pD.s2d1s6();
				break;
			case '0':
				pD.d1s7d1();
				break;
			case '1':
				pD.s4d1s4();
				break;
			case '2':
				pD.s2d3s4();
				break;
			case '3':
				pD.s8d1();
				break;
			case '4':
				pD.d9();
				break;
			case '5':
				pD.s8d1();
				break;
			case '6':
				pD.d1s7d1();
				break;
			case '7':
				pD.s2d1s6();
				break;
			case '8':
				pD.d1s7d1();
				break;
			case '9':
				pD.s8d1();
				break;
			case '-':
				pD.s9();
				break;
			case '/':
				pD.s2d1s6();
				break;
			case '!':
				pD.s4d1s4();
				break;
			default:
				pD.s9();
				break;
			}
			pD.midSpace();
		}
		out.println();

	}

	void eight(String s, int l) {
		int i;
		char c;
		for (i = 0; i < l; i++) {
			c = s.charAt(i);
			switch (c) {
			case 'a':
				pD.d1s7d1();
				break;
			case 'b':
				pD.d1s7d1();
				break;
			case 'c':
				pD.d1s8();
				break;
			case 'd':
				pD.d1s7d1();
				break;
			case 'e':
				pD.d1s8();
				break;
			case 'f':
				pD.s4d1s4();
				break;
			case 'g':
				pD.d1s7d1();
				break;
			case 'h':
				pD.d1s7d1();
				break;
			case 'i':
				pD.s4d1s4();
				break;
			case 'j':
				pD.s4d1s4();
				break;
			case 'k':
				pD.d1s4d2s2();
				break;
			case 'l':
				pD.s4d1s4();
				break;
			case 'm':
				pD.d1s7d1();
				break;
			case 'n':
				pD.d1s7d1();
				break;
			case 'o':
				pD.d1s7d1();
				break;
			case 'p':
				pD.d1s7d1();
				break;
			case 'q':
				pD.d1s7d1();
				break;
			case 'r':
				pD.d1s8();
				break;
			case 's':
				pD.s8d1();
				break;
			case 't':
				pD.s4d1s4();
				break;
			case 'u':
				pD.d1s7d1();
				break;
			case 'v':
				pD.s3d1s1d1s3();
				break;
			case 'w':
				pD.d1s1d1s3d1s1d1();
				break;
			case 'x':
				pD.s1d2s3d2s1();
				break;
			case 'y':
				pD.s3d1s1d1s3();
				break;
			case 'z':
				pD.d3s6();
				break;
			case 'A':
				pD.d1s7d1();
				break;
			case 'B':
				pD.d1s7d1();
				break;
			case 'C':
				pD.d1s8();
				break;
			case 'D':
				pD.d1s7d1();
				break;
			case 'G':
				pD.d1s7d1();
				break;
			case 'E':
				pD.d1s8();
				break;
			case 'F':
				pD.d1s8();
				break;
			case 'H':
				pD.d1s7d1();
				break;
			case 'I':
				pD.s4d1s4();
				break;
			case 'J':
				pD.s4d1s4();
				break;
			case 'K':
				pD.d1s4d2s2();
				break;
			case 'L':
				pD.d1s8();
				break;
			case 'M':
				pD.d1s7d1();
				break;
			case 'N':
				pD.d1s6d2();
				break;
			case 'O':
				pD.d1s7d1();
				break;
			case 'P':
				pD.d1s8();
				break;
			case 'Q':
				pD.s7d1s1();
				break;
			case 'R':
				pD.d1s4d2s2();
				break;
			case 'S':
				pD.s8d1();
				break;
			case 'T':
				pD.s4d1s4();
				break;
			case 'U':
				pD.d1s7d1();
				break;
			case 'V':
				pD.s3d1s1d1s3();
				break;
			case 'W':
				pD.d3s3d3();
				break;
			case 'X':
				pD.s1d1s5d1s1();
				break;
			case 'Y':
				pD.s4d1s4();
				break;
			case 'Z':
				pD.s1d1s7();
				break;
			case '0':
				pD.d1s7d1();
				break;
			case '1':
				pD.s4d1s4();
				break;
			case '2':
				pD.d3s6();
				break;
			case '3':
				pD.s8d1();
				break;
			case '4':
				pD.s6d1s2();
				break;
			case '5':
				pD.s8d1();
				break;
			case '6':
				pD.d1s7d1();
				break;
			case '7':
				pD.s1d1s7();
				break;
			case '8':
				pD.d1s7d1();
				break;
			case '9':
				pD.s8d1();
				break;
			case '-':
				pD.s9();
				break;
			case '/':
				pD.s1d1s7();
				break;
			case '!':
				pD.s9();
				break;
			default:
				pD.s9();
				break;
			}
			pD.midSpace();
		}
		out.println();
	}

	void nine(String s, int l) {
		int i;
		char c;
		for (i = 0; i < l; i++) {
			c = s.charAt(i);
			switch (c) {
			case 'a':
				pD.d9();
				break;
			case 'b':
				pD.d9();
				break;
			case 'c':
				pD.d9();
				break;
			case 'd':
				pD.d9();
				break;
			case 'e':
				pD.d9();
				break;
			case 'f':
				pD.s4d1s4();
				break;
			case 'g':
				pD.d9();
				break;
			case 'h':
				pD.d1s7d1();
				break;
			case 'i':
				pD.s4d1s4();
				break;
			case 'j':
				pD.d5s4();
				break;
			case 'k':
				pD.d1s6d2();
				break;
			case 'l':
				pD.s4d1s4();
				break;
			case 'm':
				pD.d1s7d1();
				break;
			case 'n':
				pD.d1s7d1();
				break;
			case 'o':
				pD.d9();
				break;
			case 'p':
				pD.d9();
				break;
			case 'q':
				pD.d9();
				break;
			case 'r':
				pD.d1s8();
				break;
			case 's':
				pD.d9();
				break;
			case 't':
				pD.s4d5();
				break;
			case 'u':
				pD.d9();
				break;
			case 'v':
				pD.s4d1s4();
				break;
			case 'w':
				pD.d2s5d2();
				break;
			case 'x':
				pD.d2s5d2();
				break;
			case 'y':
				pD.s4d1s4();
				break;
			case 'z':
				pD.d9();
				break;
			case 'A':
				pD.d1s7d1();
				break;
			case 'B':
				pD.d9();
				break;
			case 'C':
				pD.d9();
				break;
			case 'D':
				pD.d8s1();
				break;
			case 'E':
				pD.d9();
				break;
			case 'F':
				pD.d1s8();
				break;
			case 'G':
				pD.d9();
				break;
			case 'H':
				pD.d1s7d1();
				break;
			case 'I':
				pD.d9();
				break;
			case 'J':
				pD.d5s4();
				break;
			case 'K':
				pD.d1s6d2();
				break;
			case 'L':
				pD.d9();
				break;
			case 'M':
				pD.d1s7d1();
				break;
			case 'N':
				pD.d1s7d1();
				break;
			case 'O':
				pD.d9();
				break;
			case 'P':
				pD.d1s8();
				break;
			case 'Q':
				pD.s8d1();
				break;
			case 'R':
				pD.d1s6d2();
				break;
			case 'S':
				pD.d9();
				break;
			case 'T':
				pD.s4d1s4();
				break;
			case 'U':
				pD.d9();
				break;
			case 'V':
				pD.s4d1s4();
				break;
			case 'W':
				pD.d2s5d2();
				break;
			case 'X':
				pD.d1s7d1();
				break;
			case 'Y':
				pD.s4d1s4();
				break;
			case 'Z':
				pD.d9();
				break;
			case '0':
				pD.s1d7s1();
				break;
			case '1':
				pD.d9();
				break;
			case '2':
				pD.d9();
				break;
			case '3':
				pD.d9();
				break;
			case '4':
				pD.s6d1s2();
				break;
			case '5':
				pD.d8s1();
				break;
			case '6':
				pD.s1d7s1();
				break;
			case '7':
				pD.d1s8();
				break;
			case '8':
				pD.s1d7s1();
				break;
			case '9':
				pD.s1d8();
				break;
			case '-':
				pD.s9();
				break;
			case '/':
				pD.d1s8();
				break;
			case '!':
				pD.s4d1s4();
				break;
			default:
				pD.s9();
				break;
			}
			pD.midSpace();
		}
		out.println();
	}

	void ten(String s, int l) {
		int i;
		char c;
		for (i = 0; i < l; i++) {
			c = s.charAt(i);
			switch (c) {
			case 'a':
				pD.s9();
				break;
			case 'b':
				pD.s9();
				break;
			case 'c':
				pD.s9();
				break;
			case 'd':
				pD.s9();
				break;
			case 'e':
				pD.s9();
				break;
			case 'f':
				pD.s9();
				break;
			case 'g':
				pD.s8d1();
				break;
			case 'h':
				pD.s9();
				break;
			case 'i':
				pD.s9();
				break;
			case 'j':
				pD.s9();
				break;
			case 'k':
				pD.s9();
				break;
			case 'l':
				pD.s9();
				break;
			case 'm':
				pD.s9();
				break;
			case 'n':
				pD.s9();
				break;
			case 'o':
				pD.s9();
				break;
			case 'p':
				pD.d1s8();
				break;
			case 'q':
				pD.s8d1();
				break;
			case 'r':
				pD.s9();
				break;
			case 's':
				pD.s9();
				break;
			case 't':
				pD.s9();
				break;
			case 'u':
				pD.s9();
				break;
			case 'v':
				pD.s9();
				break;
			case 'w':
				pD.s9();
				break;
			case 'x':
				pD.s9();
				break;
			case 'y':
				pD.s3d1s5();
				break;
			case 'z':
				pD.s9();
				break;
			case 'A':
				pD.s9();
				break;
			case 'B':
				pD.s9();
				break;
			case 'C':
				pD.s9();
				break;
			case 'D':
				pD.s9();
				break;
			case 'E':
				pD.s9();
				break;
			case 'F':
				pD.s9();
				break;
			case 'G':
				pD.s9();
				break;
			case 'H':
				pD.s9();
				break;
			case 'I':
				pD.s9();
				break;
			case 'J':
				pD.s9();
				break;
			case 'K':
				pD.s9();
				break;
			case 'L':
				pD.s9();
				break;
			case 'M':
				pD.s9();
				break;
			case 'N':
				pD.s9();
				break;
			case 'O':
				pD.s9();
				break;
			case 'P':
				pD.s9();
				break;
			case 'Q':
				pD.s9();
				break;
			case 'R':
				pD.s9();
				break;
			case 'S':
				pD.s9();
				break;
			case 'T':
				pD.s9();
				break;
			case 'U':
				pD.s9();
				break;
			case 'V':
				pD.s9();
				break;
			case 'W':
				pD.s9();
				break;
			case 'X':
				pD.s9();
				break;
			case 'Y':
				pD.s9();
				break;
			case 'Z':
				pD.s9();
				break;
			case '0':
				pD.s9();
				break;
			case '1':
				pD.s9();
				break;
			case '2':
				pD.s9();
				break;
			case '3':
				pD.s9();
				break;
			case '4':
				pD.s9();
				break;
			case '5':
				pD.s9();
				break;
			case '6':
				pD.s9();
				break;
			case '7':
				pD.s9();
				break;
			case '8':
				pD.s9();
				break;
			case '9':
				pD.s9();
				break;
			case '-':
				pD.s9();
				break;
			case '/':
				pD.s9();
				break;
			case '!':
				pD.s9();
				break;
			default:
				pD.s9();
				break;
			}
			pD.midSpace();
		}
		out.println();
	}

	void eleven(String s, int l) {
		int i;
		char c;
		for (i = 0; i < l; i++) {
			c = s.charAt(i);
			switch (c) {

			case 'a':
				pD.s9();
				break;
			case 'b':
				pD.s9();
				break;
			case 'c':
				pD.s9();
				break;
			case 'd':
				pD.s9();
				break;
			case 'e':
				pD.s9();
				break;
			case 'f':
				pD.s9();
				break;
			case 'g':
				pD.s8d1();
				break;
			case 'h':
				pD.s9();
				break;
			case 'i':
				pD.s9();
				break;
			case 'j':
				pD.s9();
				break;
			case 'k':
				pD.s9();
				break;
			case 'l':
				pD.s9();
				break;
			case 'm':
				pD.s9();
				break;
			case 'n':
				pD.s9();
				break;
			case 'o':
				pD.s9();
				break;
			case 'p':
				pD.d1s8();
				break;
			case 'q':
				pD.s8d1();
				break;
			case 'r':
				pD.s9();
				break;
			case 's':
				pD.s9();
				break;
			case 't':
				pD.s9();
				break;
			case 'u':
				pD.s9();
				break;
			case 'v':
				pD.s9();
				break;
			case 'w':
				pD.s9();
				break;
			case 'x':
				pD.s9();
				break;
			case 'y':
				pD.s2d1s6();
				break;
			case 'z':
				pD.s9();
				break;
			case 'A':
				pD.s9();
				break;
			case 'B':
				pD.s9();
				break;
			case 'C':
				pD.s9();
				break;
			case 'D':
				pD.s9();
				break;
			case 'E':
				pD.s9();
				break;
			case 'F':
				pD.s9();
				break;
			case 'G':
				pD.s9();
				break;
			case 'H':
				pD.s9();
				break;
			case 'I':
				pD.s9();
				break;
			case 'J':
				pD.s9();
				break;
			case 'K':
				pD.s9();
				break;
			case 'L':
				pD.s9();
				break;
			case 'M':
				pD.s9();
				break;
			case 'N':
				pD.s9();
				break;
			case 'O':
				pD.s9();
				break;
			case 'P':
				pD.s9();
				break;
			case 'Q':
				pD.s9();
				break;
			case 'R':
				pD.s9();
				break;
			case 'S':
				pD.s9();
				break;
			case 'T':
				pD.s9();
				break;
			case 'U':
				pD.s9();
				break;
			case 'V':
				pD.s9();
				break;
			case 'W':
				pD.s9();
				break;
			case 'X':
				pD.s9();
				break;
			case 'Y':
				pD.s9();
				break;
			case 'Z':
				pD.s9();
				break;
			case '0':
				pD.s9();
				break;
			case '1':
				pD.s9();
				break;
			case '2':
				pD.s9();
				break;
			case '3':
				pD.s9();
				break;
			case '4':
				pD.s9();
				break;
			case '5':
				pD.s9();
				break;
			case '6':
				pD.s9();
				break;
			case '7':
				pD.s9();
				break;
			case '8':
				pD.s9();
				break;
			case '9':
				pD.s9();
				break;
			case '-':
				pD.s9();
				break;
			case '/':
				pD.s9();
				break;
			case '!':
				pD.s9();
				break;
			default:
				pD.s9();
				break;
			}
			pD.midSpace();
		}
		out.println();
	}

	void twelve(String s, int l) {
		int i;
		char c;
		for (i = 0; i < l; i++) {
			c = s.charAt(i);
			switch (c) {
			case 'a':
				pD.s9();
				break;
			case 'b':
				pD.s9();
				break;
			case 'c':
				pD.s9();
				break;
			case 'd':
				pD.s9();
				break;
			case 'e':
				pD.s9();
				break;
			case 'f':
				pD.s9();
				break;
			case 'g':
				pD.d9();
				break;
			case 'h':
				pD.s9();
				break;
			case 'i':
				pD.s9();
				break;
			case 'j':
				pD.s9();
				break;
			case 'k':
				pD.s9();
				break;
			case 'l':
				pD.s9();
				break;
			case 'm':
				pD.s9();
				break;
			case 'n':
				pD.s9();
				break;
			case 'o':
				pD.s9();
				break;
			case 'p':
				pD.d1s8();
				break;
			case 'q':
				pD.s8d1();
				break;
			case 'r':
				pD.s9();
				break;
			case 's':
				pD.s9();
				break;
			case 't':
				pD.s9();
				break;
			case 'u':
				pD.s9();
				break;
			case 'v':
				pD.s9();
				break;
			case 'w':
				pD.s9();
				break;
			case 'x':
				pD.s9();
				break;
			case 'y':
				pD.s1d1s7();
				break;
			case 'z':
				pD.s9();
				break;
			case 'A':
				pD.s9();
				break;
			case 'B':
				pD.s9();
				break;
			case 'C':
				pD.s9();
				break;
			case 'D':
				pD.s9();
				break;
			case 'E':
				pD.s9();
				break;
			case 'F':
				pD.s9();
				break;
			case 'G':
				pD.s9();
				break;
			case 'H':
				pD.s9();
				break;
			case 'I':
				pD.s9();
				break;
			case 'J':
				pD.s9();
				break;
			case 'K':
				pD.s9();
				break;
			case 'L':
				pD.s9();
				break;
			case 'M':
				pD.s9();
				break;
			case 'N':
				pD.s9();
				break;
			case 'O':
				pD.s9();
				break;
			case 'P':
				pD.s9();
				break;
			case 'Q':
				pD.s9();
				break;
			case 'R':
				pD.s9();
				break;
			case 'S':
				pD.s9();
				break;
			case 'T':
				pD.s9();
				break;
			case 'U':
				pD.s9();
				break;
			case 'V':
				pD.s9();
				break;
			case 'W':
				pD.s9();
				break;
			case 'X':
				pD.s9();
				break;
			case 'Y':
				pD.s9();
				break;
			case 'Z':
				pD.s9();
				break;
			case '0':
				pD.s9();
				break;
			case '1':
				pD.s9();
				break;
			case '2':
				pD.s9();
				break;
			case '3':
				pD.s9();
				break;
			case '4':
				pD.s9();
				break;
			case '5':
				pD.s9();
				break;
			case '6':
				pD.s9();
				break;
			case '7':
				pD.s9();
				break;
			case '8':
				pD.s9();
				break;
			case '9':
				pD.s9();
				break;
			case '-':
				pD.s9();
				break;
			case '/':
				pD.s9();
				break;
			case '!':
				pD.s9();
				break;
			default:
				pD.s9();
				break;
			}
			pD.midSpace();
		}
		out.println();
	}
}