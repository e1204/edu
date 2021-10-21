class IPTV extends ColorTV{
	
	private String ip;
	
	public IPTV(String ip, int size, int color) {
		super(size, color);     //super�� �ڱ� �ڽ� ����ó���ϴ°� ���� �־�ߵ�
		this.ip = ip;			
	}
	
	public void printProperty() {
		System.out.print(ip + " �ּҿ� ");
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
		System.out.println(super.getSize() + "��ġ " + this.color + "�÷�");
	}
	
	
}

//[1��]main() �޼ҵ�� ���� ����� �����Ͽ� TV�� ��ӹ��� 
//ColorTV Ŭ������ �ۼ��϶�.
//32��ġ 1024�÷�

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
		
	
	//[2��]ColorTV�� ��ӹ޴� IPTV Ŭ������ �ۼ��϶�.
	//192.1.1.2 �ּҿ� 32��ġ, 2048�÷�

		IPTV iptv = new IPTV("192.1.1.2", 32, 2048); 
		iptv.printProperty();

}

}