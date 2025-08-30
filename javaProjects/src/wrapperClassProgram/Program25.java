package wrapperClassProgram;

public class Program25 {
	public static void main(String[] args) {
		char c = 'd';
		char d = 'W';
		char e = '\u0007';
		System.out.println(Character.isAlphabetic(c));
		System.out.println(Character.isDigit(c));
		System.out.println(Character.isEmoji(c));
		System.out.println(Character.isEmoji(e));
		System.out.println(Character.isLetter(c));
		System.out.println(Character.isLowerCase(c));
		System.out.println(Character.isUpperCase(d));
		
	}
}
