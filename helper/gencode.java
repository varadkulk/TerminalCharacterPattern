import java.util.Scanner;
import static java.lang.System.*;

class gencode {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = 1;
		while (c != 0) {
			String s;
			s = sc.nextLine();
			if (s.charAt(0) == '0')
				c = 0;
			else {
				out.println("void " + s + "(){");
				for (int i = 0; i < s.length(); i++) {
					if (s.charAt(i) == 'd')
						out.println("dash(" + s.charAt(++i) + ");");
					else if (s.charAt(i) == 's')
						out.println("space(" + s.charAt(++i) + ");");
				}
				out.println("}");
			}
		}
	}
}