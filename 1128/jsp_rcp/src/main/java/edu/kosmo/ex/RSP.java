package edu.kosmo.ex;

public class RSP {
	
	private int rsp;
	
	public RSP(String user) {
		if(user.equals("가위")) {
			rsp = 1;
		}
		else if(user.equals("바위")) {
			rsp = 2;
		}
		else if(user.equals("보")) {
			rsp = 3;
		}
	}
	
	public RSP() {
		this.rsp = (int)(Math.random() * 3 + 1);
	}
	
	public String getRSP(int rsp) {
		String str = "";
		
		if(rsp == 1) {
			str = "가위";			
		}
		else if(rsp == 2) {
			str = "바위";
		}
		else if(rsp == 3) {
			str = "보";
		}
		
		return str;
	}
	
	public String getResult(RSP user) {
		String result="";
		
		if(user.rsp == this.rsp) {
			result = "DRAW";
		}
		else if((user.rsp == 1 && this.rsp == 3) || (user.rsp == 2 && this.rsp == 1) || (user.rsp == 3 && this.rsp == 2)){
			result = "WIN";
		}
		else if((user.rsp == 1 && this.rsp == 2) || (user.rsp == 2 && this.rsp == 3) || (user.rsp == 3 && this.rsp == 1)){
			result = "LOSE";
		}
		
		return result;
		
	}
	
	public String get() {
		String get = "";
		if(this.rsp == 1) {
			get = "가위";
		}
		else if(this.rsp == 2) {
			get = "바위";
		}
		else if(this.rsp == 3) {
			get = "보";
		}
		
		return get;
	}
	
	
	
	
	
	


}