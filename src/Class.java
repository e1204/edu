class Person{
	
	private String name;
	
	Person(String name){
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		Person person = (Person)obj;
		
		if(this.name == )
			return true;
		return false;
				
	}	
	
}


public class Class {
	public static void main(String[] args) {
		
		Person p1 = new Person("ȫ�浿");
		System.out.println(p1.equals(new Person("ȫ�浿")));
		System.out.println(p1.equals(new Person("�ָ���")));
		
	}

}







