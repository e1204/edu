/*import java.util.Scanner;

class Person{
	
	private String name;
	private int age;
	private String address;
	
	public Person(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public void print() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + address);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
		
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}

class Student extends Person{
	
	private String uni, major;
	private int stuNum;
	private double[] grade = new double[8];
	
	
	public Student(String name, int age, String address, String uni, String major, int stuNum) {
		super(name, age, address);
		this.uni = uni;
		this.major = major;
		this.stuNum = stuNum;
	}
	
	@Override
	public void print() {
		super.print();
		
		System.out.println("학교 : " + uni);
		System.out.println("학과 : " + major);
		System.out.println("학번 : " + stuNum);
	}
	
	public double average() {
		double sum = 0;
		double avg = 0;
		
		for (double d : grade) {
			sum = sum + d;
		}
		avg = sum / grade.length;
		
		return avg;
	}
	
	public String getUni() {
		return uni;
	}
	public void setUni(String uni) {
		this.uni = uni;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getStuNum() {
		return stuNum;
	}
	public void setStuNum(int stuNum) {
		this.stuNum = stuNum;
	}
	public double[] getGrade() {
		return grade;
	}
	public void setGrade(double[] grade) {
		this.grade = grade;
	}
	
	public void setGrade() {
		
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("8학기 학점을 순서대로 입력하세요.");	
			
			for(int i = 0; i < grade.length; i++) {
				System.out.println((i+1) + "학기 학점 : ");
				grade[i] = sc.nextDouble();
			}
			
		} catch (Exception e) {
			System.out.println("잘못된 입력입니다. 다시 입력 해주세요.");
			setGrade();
		}
		
	}
		
}


public class StudentTest {

	public static void main(String[] args) {

		Student student = new Student("김다정", 20, "서울시 대치동", "한국대학교", "전산학과", 210098);
		
		student.print();
		student.setGrade();
		
		System.out.println("8학기 총 평균 평점은 : " + student.average() + "점 입니다.");
		
	}

}*/
