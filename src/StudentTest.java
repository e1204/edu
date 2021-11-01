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
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("�ּ� : " + address);
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
		
		System.out.println("�б� : " + uni);
		System.out.println("�а� : " + major);
		System.out.println("�й� : " + stuNum);
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
			System.out.println("8�б� ������ ������� �Է��ϼ���.");	
			
			for(int i = 0; i < grade.length; i++) {
				System.out.println((i+1) + "�б� ���� : ");
				grade[i] = sc.nextDouble();
			}
			
		} catch (Exception e) {
			System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է� ���ּ���.");
			setGrade();
		}
		
	}
		
}


public class StudentTest {

	public static void main(String[] args) {

		Student student = new Student("�����", 20, "����� ��ġ��", "�ѱ����б�", "�����а�", 210098);
		
		student.print();
		student.setGrade();
		
		System.out.println("8�б� �� ��� ������ : " + student.average() + "�� �Դϴ�.");
		
	}

}*/
