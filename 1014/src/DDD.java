class Employee{
	
	private String name;
	private int age;
	private String address;
	private String team;
	
	Employee(String name, int age, String address, String team){
		this.name = name;
		this.age = age;
		this.address = address;
		this.team = team;
	}
	
	void printInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + address);
		System.out.println("부서 : " + team);
	}

}


public class DDD {

	public static void main(String[] args) {
		
		Employee employee = new Employee("홍길동", 19, "서울 뉴욕시", "개발 1팀");
		employee.printInfo();
		
	}

}
