class IPTV extends ColorTV{
	
	private String ip;
	
	public IPTV(String ip, int size, int color) {
		super(size, color);     //super는 자기 자신 로직처리하는거 위에 있어야됨
		this.ip = ip;			
	}
	
	public void printProperty() {
		System.out.print(ip + " 주소에 ");
		super.printProperty();
	}
	
}


class ColorTV extends TV {

	private int color;

	public ColorTV(int size, int color) {
		super(size);
		this.color = color;
	}

	public void printProperty() {
		System.out.println(super.getSize() + "인치 " + this.color + "컬러");
	}
	
	
}

//[1번]main() 메소드와 실행 결과를 참고하여 TV를 상속받은 
//ColorTV 클래스를 작성하라.
//32인치 1024컬러

class TV {
	private int size;

	public TV(int size) {
		this.size = size;
	}

	protected int getSize() {
		return size;
	}
	
	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printProperty();
		
	
	//[2번]ColorTV를 상속받는 IPTV 클래스를 작성하라.
	//192.1.1.2 주소에 32인치, 2048컬러

		IPTV iptv = new IPTV("192.1.1.2", 32, 2048); 
		iptv.printProperty();

}

}