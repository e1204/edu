
public class Alpabet {

	public static void main(String[] args) {
		
		char[] alpabet = new char[26];
		
		for(int i = 0; i < alpabet.length; i++) {
			alpabet[i] = (char)('A' + i);
			//System.out.println(alpabet[i]);
		}
		
		for (char ch : alpabet) {
			System.out.println(ch);
		}
	
		
	}

}
