
public class RRRR {

	public static void main(String[] args) {

		int[][] arr = new int[4][3];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length-1; j++) {
				arr[i][j] = (int)(Math.random()*100 + 1);
				System.out.print(arr[i][j] + "\t");
			}
		System.out.println();	
		}
	
		
	}
	
}
