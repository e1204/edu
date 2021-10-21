class ArrMax{
	
	private int[] arr;
	
	public ArrMax() {
		arr = new int[5];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*100) + 1;
		}
	}	
		
	public void printMax() {
			
		int max = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		System.out.println("최대값은 " + max);
		
		}
	
	}

public class MaxTest {

	public static void main(String[] args) {

		ArrMax arrMax = new ArrMax();
		arrMax.printMax();
		
	}

}
