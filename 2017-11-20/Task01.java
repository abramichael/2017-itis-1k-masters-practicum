public class Task01 {
	
	public static boolean isLetter(char c) {
		return (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z');
	}
	
	public static boolean isDigitOrLetter(char c) {
		return (isDigit(c) || isLetter(c));
	}
	
	public static boolean isDigit(char c) {
		return (c >= '0' && c <= '9');
	}
	
	public static boolean canBeFirstSymbol(char c) {
		return (c == '_' || isLetter(c));
	}
	
	public static boolean isIdent(String s) {
		if (!canBeFirstSymbol(s.charAt(0))) {
			return false;
		}
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) != '_' && !isDigitOrLetter(s.charAt(i))) {
				return false;
			}
		}
		return true;

	}
	
	public static void main(String [] args) {
		
		String s = "2abc";		
		System.out.println(isIdent(s));
		
	}		
	
}