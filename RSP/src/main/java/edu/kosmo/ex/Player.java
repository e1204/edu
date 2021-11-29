package edu.kosmo.ex;

public class Player {
	
	public final static String[] arrRsp = {"가위", "바위", "보"};
	private int rsp;
	
	public Player() {
		rsp = (int)(Math.random() * 3); //0~2		
	}
	
	public Player(int rsp) {
		this.rsp = rsp;
	}
	
	public String getStringRSP() {
		return arrRsp[rsp];
	}
	
	
	public String result(Player you) {
		
			String result ="";
			
			if(this.rsp == you.rsp) {
				return "D R A W";
			}

			if(this.rsp == 0) {
				if(you.rsp == 1) {
					result = "W I N";
				}else if(you.rsp == 2)
					result = "L O S E";
			}
			
			if(this.rsp == 1) {
				if(you.rsp == 0) {
					result = "L O S E";
				}else if(you.rsp == 2)
					result = "W I N";
			}
			
			if(this.rsp == 2) {
				if(you.rsp == 0) {
					result = "W I N";
				}else if(you.rsp == 1)
					result = "L O S E";
			}
			
	
			return result;
		
	}

}
