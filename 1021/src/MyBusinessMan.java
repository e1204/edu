
class Man{
	String name;
	
	public void tellYourName() {
		System.out.println("My name is " + name);
	}
	
	/*Man(String name){
		this.name = name;
	}*/
	
}

class BusinessMan extends Man{
	
	String company;
	String position;
	
	public BusinessMan(String name, String company, String position) {
		this.name = name; //부모 클래스는 this 대신 super 가능
		this.company = company;
		this.position = position;
	}
	
	//super() 부모 생성자 호출
	//this() 생성자 호출
	/*
	public BusinessMan(String name, String company, String position) {
		super(name); //부모 클래스는 this 대신 super 가능
		this.company = company;
		this.position = position;
	}*/
	
	public void tellYourInfo() {
		System.out.println("My company is " + company);
		System.out.println("My position is " + position);
		tellYourName();
	}
	
}


public class MyBusinessMan {

	public static void main(String[] args) {
		
		BusinessMan man = new BusinessMan("YOON", "Hybrid ELD", "Staff Eng.");
				
		man.tellYourInfo();		
	
	}
}

