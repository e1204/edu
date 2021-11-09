import java.util.ArrayList;
import java.util.Scanner;

class Student{
	
	private String name, major;
	private int ID;
	private double avg;
	
	public Student(String name, String major, int ID, double avg) {
		this.name = name;
		this.major = major;
		this.ID = ID;
		this.avg = avg;
	}
	
	public String toString() {
		return "이름: " + name + ", " + major + ", " + ID + ", " + avg;
	}
	
	public void PrintInfo() {
		
		
		for(int i = 1; i <= 4; i++) {
			
			Scanner sc = new Scanner(System.in);
		
			System.out.println("학생 이름, 학과, 학번, 학점평균");
		
			sc.next();
			
			System.out.println("이름 : " + name);
			System.out.println("학과 : " + major);
		
	}
	
}

}	

public class Class4 {

	public static void main(String[] args) {
		
		ArrayList<Student> arrList = new ArrayList<Student>();
		
		System.out.println(arrList);
		
		
	

		
		
		
	}

}
