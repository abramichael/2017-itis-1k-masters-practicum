public class Task02 {
	
	public static void main(String [] args) {
		
		String s = "2abc";
		boolean flag = s.matches("[A-Za-z_][A-Za-z0-9_]*");
		System.out.println(flag);
		
	}		
	
}