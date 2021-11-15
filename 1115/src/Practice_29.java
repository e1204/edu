/*1. int 배열 5개 선언
 *2. 차례 대로 0 1 2 3 4 입력
 *3. 배열 순서 대로 출력 
 */

public class Practice_29 {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i;
			System.out.println(arr[i]);
		}
		
	}

}
