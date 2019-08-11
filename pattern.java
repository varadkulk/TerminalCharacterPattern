import static java.lang.System.*;

public class pattern {
	void pat(String s1, int x) {
		lines l = new lines();
		int i, j;
		for (i = 0; i < s1.length(); i++) {
			j = 0;
			String s = "";
			for (j = 0; j < x; j++) {
				if (j + i == s1.length())
					j = x;
				else
					s += s1.charAt(j + i);
			}
			out.println("");
			l.one(s, s.length());
			l.two(s, s.length());
			l.three(s, s.length());
			l.four(s, s.length());
			l.five(s, s.length());
			l.six(s, s.length());
			l.seven(s, s.length());
			l.eight(s, s.length());
			l.nine(s, s.length());
			l.ten(s, s.length());
			l.eleven(s, s.length());
			l.twelve(s, s.length());
			i += (x - 1);
		}
	}
}