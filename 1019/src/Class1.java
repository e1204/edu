

public class Class1 {

	public static void main(String[] args) {
		
		//�ζ� ��ȣ
		//1. int ��� 6�� �迭����
		//2. ������ �迭�� �������� 1~45
		//3. �ߺ� ���� �ؼ� 6���� ���
		
		
		int[] lotto = new int[6];
		
		
		for(int i = 0; i < lotto.length; i++) {
			lotto[i]=(int)(Math.random() * 45 + 1);
			
			for(int j = 0; j < i; j++) {      //�ߺ�����
				if(lotto[i] == lotto[j]) {
					System.out.println("�ߺ���" + lotto[i]);
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
		
		
		
		
		
		
		
	

