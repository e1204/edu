class ArrAvg{
	
	private int[] arr = new int[10];
	
	public ArrAvg() {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
		}
	}
	
	public void resultPrint() {
		double avg = 0;
		double sum = 0;
		
		for(int i : arr) {
			sum += i;
			System.out.println(i);
		}
		
		avg = sum / arr.length;
		
		System.out.println("Æò±ÕÀº " + avg);
	}
		
}


public class Array {

	public static void main(String[] args) {

		ArrAvg arrAvg = new ArrAvg();
		
		arrAvg.resultPrint();
		
	}
	
}
