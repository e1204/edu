package edu.kosmo.ex;

public class RCP {
	
	private int rcp;
	
	public RCP(String user) {
		if(user.equals("가위")) {
			rcp = 1;
		}
		else if(user.equals("바위")) {
			rcp = 2;
		}
		else if(user.equals("보")) {
			rcp = 3;
		}
	}
	
	public RCP() {
		this.rcp = (int)(Math.random() * 3 + 1);
	}
	
	public String getRCP(int rcp) {
		String str = "";
		
		if(rcp == 1) {
			str = "가위";			
		}
		else if(rcp == 2) {
			str = "바위";
		}
		else if(rcp == 3) {
			str = "보";
		}
		
		return str;
	}
	
	public String getResult(RCP user) {
		String result="";
		
		if(user.rcp == this.rcp) {
			result = "DRAW";
		}
		else if((user.rcp == 1 && this.rcp == 3) || (user.rcp == 2 && this.rcp == 1) || (user.rcp == 3 && this.rcp == 2)){
			result = "WIN";
		}
		else if((user.rcp == 1 && this.rcp == 2) || (user.rcp == 2 && this.rcp == 3) || (user.rcp == 3 && this.rcp == 1)){
			result = "LOSE";
		}
		
		return result;
		
	}
	
	public String get() {
		String get = "";
		if(this.rcp == 1) {
			get = "가위";
		}
		else if(this.rcp == 2) {
			get = "바위";
		}
		else if(this.rcp == 3) {
			get = "보";
		}
		
		return get;
	}
	
	
	
	
	
	


}