import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Class1 {

	public static void main(String[] args) {
		
		List<Integer> list = new LinkedList<>();
		
		for(int i = 1; i <= 100; i++) {
			list.add(i);
		}
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
		
		
		
	
	}

}
