import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Class {

	public static void main(String[] args) {
		/*
		int[] lotto = new int[6];
		
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45 + 1);
		
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					System.out.println("ม฿บน : " + lotto[j]);
					i--;
					break;
				}
			}
			System.out.println(lotto[i]);
		}
		*/
		Set<Integer> lottoNum = new HashSet<>();
		
		while(lottoNum.size() != 6) {
			int rNum = 0;
			rNum = (int)(Math.random()*45 + 1);
			lottoNum.add(rNum);
		}
		
		for(Integer n : lottoNum) {
			System.out.println(n);
		}
		
	}				
}

