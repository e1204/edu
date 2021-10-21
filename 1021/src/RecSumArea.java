
class Rectangle5{
	
	private int width;
	private int height;
	
	public Rectangle5(int width,int height) {
		this.width = width;
		this.height = height;
	}
	
	public int getArea() {
		return width * height;
	}
	
	public static int getArrRec(Rectangle5[] rec) {
		 int sum =0;
		 for ( Rectangle5 rectangle : rec) {
			sum += rectangle.getArea();
		}
		 return sum;
	}
	
}
  
public class RecSumArea {
	
	
	public static int getArrRec(Rectangle5[] rec) {
		 int sum =0;
		 for ( Rectangle5 rectangle : rec) {
			sum += rectangle.getArea();
		}
		 return sum;
	}
    public static void main(String[] args) {
    	
    	Rectangle5[] rec = new Rectangle5[2];
    	
    	rec[0] = new Rectangle5(100, 200);
    	rec[1] = new Rectangle5(10, 20);
    	
    	int area = getArrRec(rec);
    	System.out.println("합계 넓이는 " + area);
    	System.out.println("합계 넓이는 " + Rectangle5.getArrRec(rec));
    	
    	
    	
    	//private int[] arr = new int[10];
    	//System.out.println("합계는"+ getArrSum(arrAvg.getArr()));
    	
    	//System.out.println("합계는"+ ArrAvg.getArrSum(arrAvg.getArr()));
    	
    }
}