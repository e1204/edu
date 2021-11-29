package edu.kosmo.ex;

public class RSP {
	
	private int rsp;
	
	public RSP(String user) {
		if(user.equals("����")) {
			rsp = 1;
		}
		else if(user.equals("����")) {
			rsp = 2;
		}
		else if(user.equals("��")) {
			rsp = 3;
		}
	}
	
	public RSP() {
		this.rsp = (int)(Math.random() * 3 + 1);
	}
	
	public String getRSP(int rsp) {
		String str = "";
		
		if(rsp == 1) {
			str = "����";			
		}
		else if(rsp == 2) {
			str = "����";
		}
		else if(rsp == 3) {
			str = "��";
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
			get = "����";
		}
		else if(this.rsp == 2) {
			get = "����";
		}
		else if(this.rsp == 3) {
			get = "��";
		}
		
		return get;
	}
	
	
	
	
	
	


}