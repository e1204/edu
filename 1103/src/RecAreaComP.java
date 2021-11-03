import java.util.Arrays;

class Rectangle implements Comparable{
   
   private int width,height;
   
   public Rectangle(int width, int height) {
      this.height = height;
      this.width = width;
   }
   
   public int getArea() {
	  return width * height;
   }

   @Override
   public int compareTo(Object o) {
	   return ((Rectangle)o).getArea() - this.getArea();
   }   
   
   @Override
   public String toString() {
	   return String.valueOf(getArea());
   }
   
}


public class RecAreaComP {

	public static void main(String[] args) {
		
		Rectangle[] recArr = {new Rectangle(6,6), new Rectangle(5,5),
							  new Rectangle(10, 10), new Rectangle(11,11)};
	       
	    Arrays.sort(recArr);
	    
	    for (Rectangle rec : recArr) {
			System.out.println(rec.getArea());
		}
	}

}
