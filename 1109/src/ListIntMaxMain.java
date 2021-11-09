import java.util.ArrayList;
import java.util.Scanner;

class ListIntMax{
	
	private ArrayList<Integer> arrList;
	
	private int max;
	
	public ListIntMax() {
		arrList = new ArrayList<>();
	}
	
	public ArrayList<Integer> getArrList() {
		
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("정수 -1이 입력될 때까지>>");
			
			while(true) {
				int num = sc.nextInt();
				if(num == -1) {
					break;
				}
				arrList.add(num);
			}
			
		} catch (Exception e) {
			System.out.println("잘못된 입력입니다.");
			getArrList();
		}
		
		return arrList;
	}

	public void setArrList(ArrayList<Integer> arrList) {
		this.arrList = arrList;
	}

	public int getMax() {
		
		max = 0;
		
		for (Integer i : arrList) {
			if(i > max) {
				max = i;
			}
		}
		
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

}


public class ListIntMaxMain {

	public static void main(String[] args) {

		ListIntMax listIntMax = new ListIntMax();
		listIntMax.getArrList();
		
		System.out.println(listIntMax.getMax());
		
	}

}
