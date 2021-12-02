package edu.kosmo.ex;

public class Lotto1 {
	
	int[] lottoNum = new int[7];
	
	public Lotto1() {
		setLottoNum();
	}
	
	public Lotto1(int[] lottoNum) {		
		this.lottoNum = lottoNum;
	}

	public int[] getLottoNum() {
		return lottoNum;
	}

	public void setLottoNum() {	
		
		for(int i = 0; i < lottoNum.length; i++) {			
			lottoNum[i] = (int)(Math.random()*45 + 1);			
			for(int j = 0; j < i; j++) {
				if(lottoNum[i] == lottoNum[j]) {					
					i--;
					break;
				}					
			}			
		}
		
	}
	
}
