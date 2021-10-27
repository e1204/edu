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
		System.out.println("바다에 삽니다.");
	}
}

class Tiger implements Locable, Ground {

	@Override
	public void printLive() {
		System.out.println("육지에 삽니다.");
	}
}

public class Location {
	
	//main이 static이라 static 함수만 불러올 수 있음(static은 static만 부를 수 있음)
	public static void CheckLocation(Locable loc) {
		if(loc instanceof Sea) 
			System.out.println("바다");
		else if(loc instanceof Ground)
			System.out.println("육지");
		else
			System.out.println("하늘");
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
		
		//if문 함수로 만들기
		/*if (loc1 instanceof Sea) {
    		System.out.println("바다에 삽니다.");			
    	}else if(loc1 instanceof Ground) {
    		System.out.println("육지에 삽니다.");
    	}else {
    		System.out.println("하늘에 살겠지");    	
    	}*/
		
	}
		
}
