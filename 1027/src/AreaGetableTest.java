interface AreaGetable{
	double getArea();
}

class Circle implements AreaGetable{
	   
	   private double r;
	   
	   public Circle(double r) {
	      this.r = r;
	   }
	   
	   @Override
	   public double getArea() {
	      return r * r * Math.PI;
	   }   
	   
}

class Rectangle implements AreaGetable{
	   
	   private double width,height;
	   
	   public Rectangle(double width,double height) {
	      this.height = height;
	      this.width = width;
	   }
	   
	   @Override
	   public double getArea() {
	      return width * height;
	   }   
	}



public class AreaGetableTest {

	public static double getAllArea(AreaGetable[] area) {
		  
		  double sum = 0;
		  for (AreaGetable areaGetable : area) {
			  sum += areaGetable.getArea();
		  }
		  
		  /*for(int i = 0; i < area.length; i++) {
			  sum += area[i].getArea();
		  }
		  */
		   
		  return sum;
	}
	
	/*public static double getArea(Circle c) {
		return c.getArea();
	}
	
	public static double getArea(Rectangle rec) {
		return rec.getArea();
	}*/
	
	public static double getArea(AreaGetable ar) {
		return ar.getArea();
	}
	
	
	public static void main(String[] args) {
		
		AreaGetable[] area = {new Rectangle(4,5), new Circle(4)};
	       
	       //AreaGetable oneArea = new Circle(4);
	       System.out.println(getAllArea(area));
	       System.out.println(getArea(new Circle(10)));
	       System.out.println(getArea(new Rectangle(4,5)));
	       
	       //oneArea = new Rectangle(4,5);
	       //System.out.println(area.getArea());      
		
	
	}

	

}
