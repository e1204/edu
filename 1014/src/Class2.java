class Grade{
	
	int math, science, english;
	
	
	Grade(int math, int science, int english){
		this.math = math;
		this.science = science;
		this.english = english;
	}
	
	public double average() {
		double avg = (math + science + english) / 3.0;
		return avg;
	}
	
	public String getGrade() {
		String grade;
		double avg = (math + science + english) / 3.0;
		
		if(avg >= 90)
			grade = "���Դϴ�.";
		else if(avg >= 80)
			grade = "���Դϴ�.";
		else if(avg >= 70)
			grade = "���Դϴ�.";
		else if(avg >= 60)
			grade = "���Դϴ�.";
		else 
			grade = "���Դϴ�.";
		
		return grade;
}
	
}



public class Class2 {

	public static void main(String[] args) {
		
		int math, science, english;
		math = 90;
		science = 80;
		english = 80;
		
		Grade me = new Grade(math, science, english);
		System.out.println("����� " + me.average());
		System.out.println(me.getGrade());
		
		

	}

}
