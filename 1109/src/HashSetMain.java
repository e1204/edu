
import java.util.HashSet;

class Person1 {
	
	private String name;
	private int age;
	
	public Person1(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name + "(" + age + "技)";
	}
	
	@Override
	public int hashCode() {
		return age/10;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Person1) {
			Person1 person = (Person1)obj;
			if(person.name.equals(this.name) && this.age == person.age) {
				return true;
			}
		}
		return false;
		
		/*
		if(this.name.equals(((Person)obj).name) && this.age == ((Person)obj).age) {
			return true;
		}
		else {
			return false;
		}
		*/
	}
	
}


public class HashSetMain {

	public static void main(String[] args) {
		
		HashSet<Person1> hSet = new HashSet<Person1>();
		
		hSet.add(new Person1("LEE", 10));
		hSet.add(new Person1("LEE", 10));
		hSet.add(new Person1("PARK", 35));
		hSet.add(new Person1("PARK", 35));
	
		System.out.println("历厘等 单捞磐 荐: " + hSet.size());
		System.out.println(hSet);

	}

}
