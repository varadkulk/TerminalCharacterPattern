import java.util.Scanner;
import static java.lang.System.*;

class characterPattern {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		pattern p = new pattern();
		p.pat("abcdefghijklmnopqrstuvwxyz ABCDEFGHIJKLMNOPQRSTUVWXYZ 0123456789 -/!", 18);
		out.print(
				"Note: If the alphabet in the entered string is not in the string above empty space will be printed\nEnter the string: ");
		p.pat(sc.nextLine(), 18);
	}
}
