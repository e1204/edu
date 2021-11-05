class Box7<T>{
	
	private T t;
	
	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}

		
}


public class Class {

	public static void main(String[] args) {
	
			Box7<Integer> box1 = new Box7<>();
	        box1.set(99);

	        Box7<Integer> box2 = new Box7<>();
	        box2.set(55);

	        System.out.println(box1.get() + " & " + box2.get());
	        swapBox(box1, box2); 
	        System.out.println(box1.get() + " & " + box2.get());
	    
	}
	
	public static <T> void swapBox(Box7<T> box1, Box7<T> box2) {
		
		T temp = box1.get();
		box1.set(box2.get());
		box2.set(temp);
		
	}
	
	/*
	public static void swapBox(Box7<Integer> box1, Box7<Integer> box2) {
		
		int temp = box1.get();
		box1.set(box2.get());
		box2.set(temp);
		
	}
	*/
	
	
	
	
}
