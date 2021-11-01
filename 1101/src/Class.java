class Person{
	
	private String name;
	
	public Person(String name){
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		Person person = (Person)obj;
		
		if(this.name == person.name)
			return true;
		return false;
	}	
	
}


public class Class {
	public static void main(String[] args) {
		
		Person p1 = new Person("È«±æµ¿");
		System.out.println(p1.equals(new Person("È«±æµ¿")));
		System.out.println(p1.equals(new Person("ÃÖ¸íÅÂ")));
		
	}

}







