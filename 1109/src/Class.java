import java.util.HashSet;

class Num{
	
	private int num;
	
	public Num(int n) {
		num = n;
	}
	
	@Override
	public String toString() {
		return String.valueOf(num);
	}
	
	//1. hashcode() - 해쉬 알고리즘 - 분류 한다(속도)
	@Override
	public int hashCode() {
		return num % 3;
	}
	
	//2. 동등 비교를 위해 - true면 동등 false면 다름 : 이 로직은 개발자가 짜야함
	@Override
	public boolean equals(Object obj) {
		if(num == ((Num)obj).num) {
			return true;
		}
		else {
			return false;
		}
	}
		
}


public class Class {

	public static void main(String[] args) {
		
		HashSet<Num> set = new HashSet<>();
        set.add(new Num(7799));
        set.add(new Num(9955));
        set.add(new Num(7799));

        System.out.println("인스턴스 수: " + set.size());

        for(Num n : set)
            System.out.print(n.toString() + '\t');

        System.out.println();
	
	}

}
