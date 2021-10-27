interface Sea {
}

interface Ground {
}

interface Locable {
	void printLive();
}

class Fish implements Locable, Sea {

	@Override
	public void printLive() {
		System.out.println("�ٴٿ� ��ϴ�.");
	}
}

class Tiger implements Locable, Ground {

	@Override
	public void printLive() {
		System.out.println("������ ��ϴ�.");
	}
}

public class Location {
	
	//main�� static�̶� static �Լ��� �ҷ��� �� ����(static�� static�� �θ� �� ����)
	public static void CheckLocation(Locable loc) {
		if(loc instanceof Sea) 
			System.out.println("�ٴ�");
		else if(loc instanceof Ground)
			System.out.println("����");
		else
			System.out.println("�ϴ�");
	}
	
	public static void main(String[] args) {
		
		Locable loc1 = new Fish();
		Locable loc2 = new Tiger();
		
		CheckLocation(loc1);
		CheckLocation(loc2);
	
		Fish fish = new Fish();
		Tiger tiger = new Tiger();
		
		CheckLocation(fish);
		CheckLocation(tiger);
		
		//if�� �Լ��� �����
		/*if (loc1 instanceof Sea) {
    		System.out.println("�ٴٿ� ��ϴ�.");			
    	}else if(loc1 instanceof Ground) {
    		System.out.println("������ ��ϴ�.");
    	}else {
    		System.out.println("�ϴÿ� �����");    	
    	}*/
		
	}
		
}
