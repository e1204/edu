class DBox<T1, T2>{
	
	private T1 t1;
	private T2 t2;
	
	public void set(T1 a, T2 b) {
		t1 = a;
		t2 = b;
	}
	
	public String toString() {
		return t1 + "&" + t2;
	}
		
}

class DDBox<T1, T2>{
	
	private T1 t1;
	private T2 t2;
	
	public void set(T1 a, T2 b) {
		t1 = a;
		t2 = b;
	}
	
	public String toString() {
		return t1 + "\n" + t2;
	}
		
}



public class DDDDDDDDDD {

	public static void main(String[] args) {
	
		DBox<String, Integer> box1 = new DBox<>();
        box1.set("Apple", 25);

        DBox<String, Integer> box2 = new DBox<>();
        box2.set("Orange", 33);
        
        DDBox<DBox<String, Integer>, DBox<String, Integer>> ddbox = new DDBox<>();
        ddbox.set(box1, box2);

        System.out.println(ddbox);

	}

}
