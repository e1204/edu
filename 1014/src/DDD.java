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
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("�ּ� : " + address);
		System.out.println("�μ� : " + team);
	}

}


public class DDD {

	public static void main(String[] args) {
		
		Employee employee = new Employee("ȫ�浿", 19, "���� �����", "���� 1��");
		employee.printInfo();
		
	}

}
