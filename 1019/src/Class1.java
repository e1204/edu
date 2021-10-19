

public class Class1 {

	public static void main(String[] args) {
		
		//로또 번호
		//1. int 담는 6개 배열선언
		//2. 각각의 배열에 랜덤으로 1~45
		//3. 중복 제거 해서 6개를 출력
		
		
		int[] lotto = new int[6];
		
		
		for(int i = 0; i < lotto.length; i++) {
			lotto[i]=(int)(Math.random() * 45 + 1);
			
			for(int j = 0; j < i; j++) {      //중복제거
				if(lotto[i] == lotto[j]) {
					System.out.println("중복값" + lotto[i]);
					i--;
					break;
				}
			}
		}
		
		for(int i = 0; i < lotto.length; i++) {
			System.out.println(lotto[i]);
		}
		
			
	}
		
}
		
		
		
		
		
		
		
	

