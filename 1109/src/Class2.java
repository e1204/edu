import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

class Person1 implements Comparable<Person1>{
	
	 String name;
	 int age;
	
	public Person1(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(Person1 p) {
		return this.age - p.age;
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
		
		
		if(this.name.equals(((Person)obj).name) && this.age == ((Person)obj).age) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
}

class PersonComparator implements Comparator<Person1>{
	public int compare(Person p1, Person p2) {
		return p2.age - p1.age;
	}
}

public class Class2 {

	public static void main(String[] args) {
		
		TreeSet<Person1> tree = new TreeSet<>(new PersonComparator());
		
		tree.add(new Person1("YOON", 37));
		tree.add(new Person1("HONG", 53));
		tree.add(new Person1("PARK", 22));
		
		for (Person1 p : tree) {
			System.out.println(p);
		}

	}

}

