
public class Class0 {

	public static void main(String[] args) {
		
		int[] lotto = new int[6];
		
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45 + 1);
			
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					System.out.println("�ߺ��� " + lotto[i]);
					i--;
					break;
				}
					
			}
			
		}
		
		for(int i = 0; i < lotto.length; i++) 
			System.out.println(lotto[i]);
		
		

	}

}
