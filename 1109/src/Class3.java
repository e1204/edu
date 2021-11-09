import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

class Person{
	
	 String name;
	 int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		return name + "(" + age + "¼¼)";
	}
	
	@Override
	public int hashCode() {
		return age/10;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Person) {
			Person person = (Person)obj;
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


public class Class3 {

	public static void main(String[] args) {
		
		TreeSet<Person> tree = new TreeSet<>();
		
		tree.add(new Person("YOON", 37));
		tree.add(new Person("HONG", 53));
		tree.add(new Person("PARK", 22));
		
		for (Person p : tree) {
			System.out.println(p);
		}

	}

}

