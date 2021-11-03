class Apple{
	
	@Override
	public String toString() {
		return "I am an apple.";
	}
	
}

class Orange{
	
	@Override
	public String toString() {
		return "I am an orange.";
	}
	
}

class Box <T>{
	
	private T ob;
	
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
	
}

public class PrimitivesAndGeneric{
	public static void main(String[] args) {
		
		Box<String> sBox = new Box<>();
		sBox.set("I am so happy.");
		
		Box<Box<String>> wBox = new Box<>();
		wBox.set(sBox);

		Box<Box<Box<String>>> zBox = new Box<>();
		zBox.set(wBox);
		
		System.out.println(zBox.get().get().get());
		
		
	}
}



/*
public class Class3 {

	public static void main(String[] args) {
	
		Box<Apple>aBox = new Box<Apple>();
		Box<Orange>oBox = new Box<Orange>();
		
		aBox.set(new Apple());
		oBox.set(new Orange());
		
		Apple ap = aBox.get();
		Orange og = oBox.get();
		
		System.out.println(ap);
		System.out.println(og);
				
	}

}*/
